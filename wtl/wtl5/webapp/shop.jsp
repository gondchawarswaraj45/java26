<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shop | AuraBooks</title>
    <link rel="stylesheet" href="css/index.css">
    <link href="https://fonts.googleapis.com/css2?family=Outfit:wght@300;400;600;800&display=swap" rel="stylesheet">
</head>
<body>
    <nav class="glass scrolled">
        <a href="index.jsp" class="logo">AuraBooks</a>
        <ul class="nav-links">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="books">Shop</a></li>
            <c:choose>
                <c:when test="${not empty sessionScope.user}">
                    <li><a href="cart.jsp">Cart</a></li>
                    <li><a href="logout">Logout (${sessionScope.user.username})</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="login.jsp">Login</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
    </nav>

    <main style="padding: 2rem 5%;">
        <div style="display: flex; justify-content: space-between; align-items: center; margin-bottom: 3rem;">
            <h2 style="font-size: 2.5rem;">Explore our Library</h2>
            <form action="books" method="get" class="glass" style="padding: 0.5rem 1rem; border-radius: 50px; display: flex; gap: 0.5rem;">
                <input type="text" name="search" placeholder="Search titles, authors..." style="background: transparent; border: none; color: white; outline: none; width: 250px;">
                <button type="submit" class="btn btn-primary" style="padding: 0.5rem 1.5rem;">Search</button>
            </form>
        </div>

        <div class="book-grid">
            <c:forEach var="book" items="${books}">
                <div class="book-card glass">
                    <img src="${book.imageUrl}" alt="${book.title}" class="book-img">
                    <div class="book-info">
                        <span style="font-size: 0.8rem; color: var(--primary); font-weight: 600; text-transform: uppercase;">${book.category}</span>
                        <h3>${book.title}</h3>
                        <p style="color: var(--text-muted);">${book.author}</p>
                        <div style="display: flex; justify-content: space-between; align-items: center; margin-top: 1rem;">
                            <p class="book-price">$${book.price}</p>
                            <form action="cart" method="post">
                                <input type="hidden" name="action" value="add">
                                <input type="hidden" name="bookId" value="${book.id}">
                                <button type="submit" class="btn glass" style="color: white; border-color: var(--primary);">Add to Cart</button>
                            </form>
                        </div>
                    </div>
                </div>
            </c:forEach>
            <c:if test="${empty books}">
                <div style="grid-column: 1 / -1; text-align: center; padding: 4rem;">
                    <p style="color: var(--text-muted); font-size: 1.2rem;">No books found matching your criteria.</p>
                </div>
            </c:if>
        </div>
    </main>
</body>
</html>
