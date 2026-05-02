package com.ebookshop.servlet;

import com.ebookshop.dao.UserDAO;
import com.ebookshop.model.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private UserDAO userDAO = new UserDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        if (userDAO.registerUser(user)) {
            response.sendRedirect("login.jsp?success=1");
        } else {
            request.setAttribute("error", "Registration failed. Email or username might already exist.");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
