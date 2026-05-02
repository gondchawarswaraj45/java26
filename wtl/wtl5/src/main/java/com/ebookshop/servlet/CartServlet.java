package com.ebookshop.servlet;

import com.ebookshop.dao.BookDAO;
import com.ebookshop.model.Book;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
    private BookDAO bookDAO = new BookDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        HttpSession session = request.getSession();
        Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");

        if (cart == null) {
            cart = new HashMap<>();
            session.setAttribute("cart", cart);
        }

        if ("add".equals(action)) {
            int bookId = Integer.parseInt(request.getParameter("bookId"));
            cart.put(bookId, cart.getOrDefault(bookId, 0) + 1);
            response.sendRedirect("books");
        } else if ("remove".equals(action)) {
            int bookId = Integer.parseInt(request.getParameter("bookId"));
            cart.remove(bookId);
            response.sendRedirect("cart.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");
        List<CartItem> cartItems = new ArrayList<>();
        double total = 0;

        if (cart != null) {
            for (Map.Entry<Integer, Integer> entry : cart.entrySet()) {
                Book book = bookDAO.getBookById(entry.getKey());
                if (book != null) {
                    CartItem item = new CartItem(book, entry.getValue());
                    cartItems.add(item);
                    total += book.getPrice() * entry.getValue();
                }
            }
        }

        request.setAttribute("cartItems", cartItems);
        request.setAttribute("total", total);
        request.getRequestDispatcher("/cart.jsp").forward(request, response);
    }

    // Inner class for Cart Item
    public static class CartItem {
        private Book book;
        private int quantity;

        public CartItem(Book book, int quantity) {
            this.book = book;
            this.quantity = quantity;
        }

        public Book getBook() { return book; }
        public int getQuantity() { return quantity; }
        public double getSubtotal() { return book.getPrice() * quantity; }
    }
}
