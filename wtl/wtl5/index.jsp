<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AuraBooks | Premium E-bookshop</title>
    <link rel="stylesheet" href="css/index.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Outfit:wght@300;400;600;800&display=swap" rel="stylesheet">
</head>
<body>
    <nav class="glass">
        <a href="index.jsp" class="logo">AuraBooks</a>
        <ul class="nav-links">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="books">Shop</a></li>
            <c:choose>
                <c:when test="${not empty sessionScope.user}">
                    <c:if test="${sessionScope.user.role eq 'admin'}">
                        <li><a href="admin">Admin Panel</a></li>
                    </c:if>
                    <li><a href="cart.jsp">Cart</a></li>
                    <li><a href="logout">Logout (${sessionScope.user.username})</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="login.jsp">Login</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
    </nav>

    <header class="hero">
        <h1>Read Beyond <br> <span style="color: var(--primary);">Boundaries</span></h1>
        <p>Discover a curated collection of world-class literature and technical masterpieces. Premium experience for every reader.</p>
        <div class="hero-btns">
            <a href="books" class="btn btn-primary">Explore Catalog</a>
            <a href="#featured" class="btn glass" style="margin-left: 1rem; color: white;">Trending Now</a>
        </div>
    </header>

    <section id="featured" class="featured-section" style="padding: 4rem 5%;">
        <h2 style="font-size: 2.5rem; margin-bottom: 2rem;">Featured Collections</h2>
        <div class="book-grid">
            <!-- This would normally be populated from a servlet, but for the home page we can show static highlights -->
            <div class="book-card glass">
                <img src="https://images-na.ssl-images-amazon.com/images/I/81af+MCATTL.jpg" alt="Book" class="book-img">
                <div class="book-info">
                    <h3>The Great Gatsby</h3>
                    <p style="color: var(--text-muted);">F. Scott Fitzgerald</p>
                    <p class="book-price">$12.99</p>
                    <a href="books" class="btn btn-primary" style="display: block; text-align: center; margin-top: 1rem;">View Details</a>
                </div>
            </div>
            <div class="book-card glass">
                <img src="https://images-na.ssl-images-amazon.com/images/I/41xShlnTZTL._SX376_BO1,204,203,200_.jpg" alt="Book" class="book-img">
                <div class="book-info">
                    <h3>Clean Code</h3>
                    <p style="color: var(--text-muted);">Robert C. Martin</p>
                    <p class="book-price">$45.00</p>
                    <a href="books" class="btn btn-primary" style="display: block; text-align: center; margin-top: 1rem;">View Details</a>
                </div>
            </div>
            <div class="book-card glass">
                <img src="https://images-na.ssl-images-amazon.com/images/I/71kpw99BcDL.jpg" alt="Book" class="book-img">
                <div class="book-info">
                    <h3>1984</h3>
                    <p style="color: var(--text-muted);">George Orwell</p>
                    <p class="book-price">$15.50</p>
                    <a href="books" class="btn btn-primary" style="display: block; text-align: center; margin-top: 1rem;">View Details</a>
                </div>
            </div>
        </div>
    </section>

    <footer style="padding: 4rem 5%; border-top: 1px solid var(--border); text-align: center; color: var(--text-muted);">
        <p>&copy; 2026 AuraBooks. Elevated Reading Experience.</p>
    </footer>

    <script>
        window.addEventListener('scroll', () => {
            const nav = document.querySelector('nav');
            if (window.scrollY > 20) {
                nav.classList.add('scrolled');
            } else {
                nav.classList.remove('scrolled');
            }
        });
    </script>
</body>
</html>
