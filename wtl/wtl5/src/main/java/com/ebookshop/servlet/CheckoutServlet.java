package com.ebookshop.servlet;

import com.ebookshop.model.User;
import com.ebookshop.util.DBConnection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;
import java.util.Map;

@WebServlet("/checkout")
public class CheckoutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");

        if (user == null || cart == null || cart.isEmpty()) {
            response.sendRedirect("cart.jsp");
            return;
        }

        try (Connection conn = DBConnection.getConnection()) {
            conn.setAutoCommit(false);
            
            // Calculate total and save order
            double total = 0;
            for (Map.Entry<Integer, Integer> entry : cart.entrySet()) {
                // In a real app, fetch prices from DB to avoid client-side tampering
                total += getBookPrice(conn, entry.getKey()) * entry.getValue();
            }

            String orderSql = "INSERT INTO orders (user_id, total_price) VALUES (?, ?)";
            PreparedStatement psOrder = conn.prepareStatement(orderSql, Statement.RETURN_GENERATED_KEYS);
            psOrder.setInt(1, user.getId());
            psOrder.setDouble(2, total);
            psOrder.executeUpdate();

            ResultSet rsOrder = psOrder.getGeneratedKeys();
            if (rsOrder.next()) {
                int orderId = rsOrder.getInt(1);
                String itemSql = "INSERT INTO order_items (order_id, book_id, quantity, price) VALUES (?, ?, ?, ?)";
                PreparedStatement psItem = conn.prepareStatement(itemSql);

                for (Map.Entry<Integer, Integer> entry : cart.entrySet()) {
                    psItem.setInt(1, orderId);
                    psItem.setInt(2, entry.getKey());
                    psItem.setInt(3, entry.getValue());
                    psItem.setDouble(4, getBookPrice(conn, entry.getKey()));
                    psItem.addBatch();
                }
                psItem.executeBatch();
            }

            conn.commit();
            session.removeAttribute("cart");
            response.sendRedirect("index.jsp?orderSuccess=1");

        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("cart.jsp?error=checkout_failed");
        }
    }

    private double getBookPrice(Connection conn, int bookId) throws SQLException {
        String sql = "SELECT price FROM books WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, bookId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getDouble("price");
            }
        }
        return 0;
    }
}
