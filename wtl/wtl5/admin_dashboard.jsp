<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard | AuraBooks</title>
    <link rel="stylesheet" href="css/index.css">
    <link href="https://fonts.googleapis.com/css2?family=Outfit:wght@300;400;600;800&display=swap" rel="stylesheet">
    <style>
        .admin-container {
            padding: 8rem 8% 4rem;
        }
        .stats-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
            gap: 2rem;
            margin-bottom: 4rem;
        }
        .stat-card {
            padding: 2rem;
            text-align: center;
        }
        .stat-card h2 {
            font-size: 2.5rem;
            color: var(--primary);
        }
        .manage-section {
            margin-top: 3rem;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 2rem;
        }
        th, td {
            text-align: left;
            padding: 1.2rem;
            border-bottom: 1px solid var(--border);
        }
        th {
            color: var(--text-muted);
            font-weight: 600;
            text-transform: uppercase;
            font-size: 0.8rem;
            letter-spacing: 1px;
        }
        .action-btn {
            padding: 0.5rem 1rem;
            border-radius: 8px;
            font-size: 0.85rem;
            margin-right: 0.5rem;
        }
        .btn-edit { background: rgba(99, 102, 241, 0.1); color: var(--primary); }
        .btn-delete { background: rgba(239, 68, 68, 0.1); color: #ef4444; }
    </style>
</head>
<body>
    <nav class="glass scrolled">
        <a href="index.jsp" class="logo">AuraBooks Admin</a>
        <ul class="nav-links">
            <li><a href="index.jsp">Site Home</a></li>
            <li><a href="admin">Dashboard</a></li>
            <li><a href="logout">Logout</a></li>
        </ul>
    </nav>

    <div class="admin-container">
        <h1 style="margin-bottom: 2rem;">System Overview</h1>
        
        <div class="stats-grid">
            <div class="stat-card glass">
                <p>Total Books</p>
                <h2>${books.size()}</h2>
            </div>
            <div class="stat-card glass">
                <p>Active Users</p>
                <h2>124</h2>
            </div>
            <div class="stat-card glass">
                <p>New Orders</p>
                <h2>12</h2>
            </div>
        </div>

        <div class="manage-section">
            <div style="display: flex; justify-content: space-between; align-items: center;">
                <h2>Inventory Management</h2>
                <a href="#" class="btn btn-primary" style="padding: 0.6rem 1.5rem;">+ Add New Book</a>
            </div>

            <div class="glass" style="border-radius: 20px; margin-top: 2rem; overflow: hidden;">
                <table>
                    <thead>
                        <tr>
                            <th>Book Details</th>
                            <th>Category</th>
                            <th>Price</th>
                            <th>Stock</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="book" items="${books}">
                            <tr>
                                <td>
                                    <div style="display: flex; gap: 1rem; align-items: center;">
                                        <img src="${book.imageUrl}" style="width: 40px; height: 60px; border-radius: 4px; object-fit: cover;">
                                        <div>
                                            <p style="font-weight: 600;">${book.title}</p>
                                            <p style="font-size: 0.8rem; color: var(--text-muted);">${book.author}</p>
                                        </div>
                                    </div>
                                </td>
                                <td>${book.category}</td>
                                <td style="font-weight: 700;">$${book.price}</td>
                                <td>${book.stock}</td>
                                <td>
                                    <a href="#" class="action-btn btn-edit">Edit</a>
                                    <a href="#" class="action-btn btn-delete">Remove</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
