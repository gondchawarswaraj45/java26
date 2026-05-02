<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login | AuraBooks</title>
    <link rel="stylesheet" href="css/index.css">
    <link href="https://fonts.googleapis.com/css2?family=Outfit:wght@300;400;600;800&display=swap" rel="stylesheet">
    <style>
        .auth-toggle {
            display: flex;
            gap: 1rem;
            margin-bottom: 2rem;
            justify-content: center;
        }
        .auth-toggle button {
            background: transparent;
            border: none;
            color: var(--text-muted);
            cursor: pointer;
            font-size: 1.1rem;
            font-weight: 600;
            padding: 0.5rem 1rem;
            border-bottom: 2px solid transparent;
        }
        .auth-toggle button.active {
            color: var(--primary);
            border-bottom-color: var(--primary);
        }
        .form-section {
            display: none;
        }
        .form-section.active {
            display: block;
        }
    </style>
</head>
<body style="background: radial-gradient(circle at top right, rgba(99, 102, 241, 0.1), transparent 50%);">
    <nav class="glass scrolled">
        <a href="index.jsp" class="logo">AuraBooks</a>
        <ul class="nav-links">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="books">Shop</a></li>
            <c:choose>
                <c:when test="${not empty sessionScope.user}">
                    <li><a href="logout">Logout</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="login.jsp">Login</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
    </nav>

    <div class="form-container glass">
        <div class="auth-toggle">
            <button id="loginTab" class="active" onclick="showForm('login')">Login</button>
            <button id="registerTab" onclick="showForm('register')">Register</button>
        </div>

        <c:if test="${not empty error}">
            <div style="background: rgba(239, 68, 68, 0.1); color: #ef4444; padding: 1rem; border-radius: 12px; margin-bottom: 1.5rem; text-align: center; border: 1px solid rgba(239, 68, 68, 0.2);">
                ${error}
            </div>
        </c:if>

        <c:if test="${param.success eq '1'}">
            <div style="background: rgba(34, 197, 94, 0.1); color: #22c55e; padding: 1rem; border-radius: 12px; margin-bottom: 1.5rem; text-align: center; border: 1px solid rgba(34, 197, 94, 0.2);">
                Registration successful! Please login.
            </div>
        </c:if>

        <!-- Login Form -->
        <div id="loginForm" class="form-section active">
            <form action="login" method="post">
                <div class="input-group">
                    <label>Email Address</label>
                    <input type="email" name="email" required placeholder="name@example.com">
                </div>
                <div class="input-group">
                    <label>Password</label>
                    <input type="password" name="password" required placeholder="••••••••">
                </div>
                <button type="submit" class="btn btn-primary" style="width: 100%; margin-top: 1rem;">Sign In</button>
            </form>
        </div>

        <!-- Register Form -->
        <div id="registerForm" class="form-section">
            <form action="register" method="post">
                <div class="input-group">
                    <label>Full Name</label>
                    <input type="text" name="username" required placeholder="John Doe">
                </div>
                <div class="input-group">
                    <label>Email Address</label>
                    <input type="email" name="email" required placeholder="john@example.com">
                </div>
                <div class="input-group">
                    <label>Password</label>
                    <input type="password" name="password" required placeholder="Create a password">
                </div>
                <button type="submit" class="btn btn-primary" style="width: 100%; margin-top: 1rem;">Create Account</button>
            </form>
        </div>
    </div>

    <script>
        function showForm(type) {
            const loginForm = document.getElementById('loginForm');
            const registerForm = document.getElementById('registerForm');
            const loginTab = document.getElementById('loginTab');
            const registerTab = document.getElementById('registerTab');

            if (type === 'login') {
                loginForm.classList.add('active');
                registerForm.classList.remove('active');
                loginTab.classList.add('active');
                registerTab.classList.remove('active');
            } else {
                registerForm.classList.add('active');
                loginForm.classList.remove('active');
                registerTab.classList.add('active');
                loginTab.classList.remove('active');
            }
        }
    </script>
</body>
</html>
