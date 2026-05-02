<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Cart | AuraBooks</title>
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
        <h2 style="font-size: 2.5rem; margin-bottom: 2rem;">Shopping Cart</h2>

        <c:choose>
            <c:when test="${not empty cartItems}">
                <div style="display: grid; grid-template-columns: 2fr 1fr; gap: 3rem;">
                    <!-- Cart Items List -->
                    <div style="display: flex; flex-direction: column; gap: 1.5rem;">
                        <c:forEach var="item" items="${cartItems}">
                            <div class="glass" style="display: flex; gap: 1.5rem; padding: 1.5rem; border-radius: 20px; align-items: center;">
                                <img src="${item.book.imageUrl}" alt="${item.book.title}" style="width: 100px; height: 150px; object-fit: cover; border-radius: 12px;">
                                <div style="flex-grow: 1;">
                                    <h3>${item.book.title}</h3>
                                    <p style="color: var(--text-muted);">${item.book.author}</p>
                                    <p style="margin-top: 0.5rem; font-weight: 600;">Quantity: ${item.quantity}</p>
                                </div>
                                <div style="text-align: right;">
                                    <p class="book-price" style="margin-bottom: 1rem;">$${item.subtotal}</p>
                                    <form action="cart" method="post">
                                        <input type="hidden" name="action" value="remove">
                                        <input type="hidden" name="bookId" value="${item.book.id}">
                                        <button type="submit" style="background: transparent; border: none; color: #ef4444; cursor: pointer; font-weight: 600;">Remove</button>
                                    </form>
                                </div>
                            </div>
                        </c:forEach>
                    </div>

                    <!-- Summary Card -->
                    <div class="glass" style="padding: 2rem; border-radius: 24px; height: fit-content;">
                        <h3 style="margin-bottom: 1.5rem; border-bottom: 1px solid var(--border); padding-bottom: 1rem;">Order Summary</h3>
                        <div style="display: flex; justify-content: space-between; margin-bottom: 1rem;">
                            <span>Subtotal</span>
                            <span>$${total}</span>
                        </div>
                        <div style="display: flex; justify-content: space-between; margin-bottom: 1rem;">
                            <span>Shipping</span>
                            <span style="color: #22c55e;">FREE</span>
                        </div>
                        <div style="display: flex; justify-content: space-between; margin-bottom: 2rem; font-size: 1.4rem; font-weight: 800; border-top: 1px solid var(--border); padding-top: 1rem;">
                            <span>Total</span>
                            <span class="book-price">$${total}</span>
                        </div>
                        
                        <c:choose>
                            <c:when test="${not empty sessionScope.user}">
                                <form action="checkout" method="post">
                                    <button type="submit" class="btn btn-primary" style="width: 100%;">Proceed to Checkout</button>
                                </form>
                            </c:when>
                            <c:otherwise>
                                <a href="login.jsp" class="btn btn-primary" style="display: block; text-align: center;">Login to Checkout</a>
                            </c:otherwise>
                        </c:choose>
                    </div>
                </div>
            </c:when>
            <c:otherwise>
                <div class="glass" style="text-align: center; padding: 6rem; border-radius: 24px;">
                    <h3 style="font-size: 1.5rem; margin-bottom: 1rem; color: var(--text-muted);">Your cart is empty</h3>
                    <a href="books" class="btn btn-primary">Start Shopping</a>
                </div>
            </c:otherwise>
        </c:choose>
    </main>
</body>
</html>
