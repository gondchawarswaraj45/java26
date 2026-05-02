package com.ebookshop.servlet;

import com.ebookshop.dao.BookDAO;
import com.ebookshop.model.Book;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/books")
public class BookServlet extends HttpServlet {
    private BookDAO bookDAO = new BookDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = request.getParameter("search");
        List<Book> books;
        
        if (query != null && !query.trim().isEmpty()) {
            books = bookDAO.searchBooks(query);
        } else {
            books = bookDAO.getAllBooks();
        }
        
        request.setAttribute("books", books);
        request.getRequestDispatcher("/shop.jsp").forward(request, response);
    }
}
