<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard | Student Portal</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
</head>
<body>

    <div class="portal-container" style="max-width: 600px;">
        <div class="portal-card">
            <div class="dashboard-header">
                <div class="avatar">
                    <i class="fas fa-user-graduate"></i>
                </div>
                <div>
                    <h1>Welcome, <s:property value="studentName" />!</h1>
                    <p class="subtitle">Student ID: <s:property value="username" /></p>
                </div>
            </div>

            <div style="margin-bottom: 25px;">
                <p style="font-weight: 600; color: var(--text-main); margin-bottom: 15px;">Academic Overview</p>
                <div class="stat-grid">
                    <div class="stat-item">
                        <span class="stat-label">Current GPA</span>
                        <span class="stat-value">3.85 / 4.0</span>
                    </div>
                    <div class="stat-item">
                        <span class="stat-label">Credits Earned</span>
                        <span class="stat-value">92</span>
                    </div>
                    <div class="stat-item">
                        <span class="stat-label">Attendance</span>
                        <span class="stat-value">94%</span>
                    </div>
                    <div class="stat-item">
                        <span class="stat-label">Pending Exams</span>
                        <span class="stat-value">2</span>
                    </div>
                </div>
            </div>

            <div style="background: #eff6ff; border: 1px dashed var(--primary-light); padding: 15px; border-radius: 8px; margin-bottom: 25px;">
                <p style="font-size: 0.9rem; color: var(--primary);">
                    <i class="fas fa-info-circle"></i> 
                    <strong>Notice:</strong> Your semester registration deadline is approaching (May 15th).
                </p>
            </div>

            <a href="login.jsp" class="btn-login" style="text-decoration: none; display: block; text-align: center; background: #64748b;">
                <i class="fas fa-sign-out-alt"></i> Logout from Portal
            </a>
        </div>
    </div>

</body>
</html>
