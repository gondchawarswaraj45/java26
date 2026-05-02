<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard | Student Portal</title>
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<body>

    <div class="portal-container">
        <div class="logo-section">
            <h1>Session Verified</h1>
            <p class="subtitle">Accessing restricted academic profile</p>
        </div>

        <div class="welcome-card">
            <label>AUTHENTICATED IDENTITY</label>
            <h2 style="font-weight: 500; font-size: 24px; margin-top: 8px;">
                <s:property value="student.fullName" />
            </h2>

            <div class="student-meta">
                <div class="meta-row">
                    <span class="meta-label">ID</span>
                    <span><s:property value="username" /></span>
                </div>
                <div class="meta-row">
                    <span class="meta-label">DEPARTMENT</span>
                    <span><s:property value="student.department" /></span>
                </div>
                <div class="meta-row">
                    <span class="meta-label">STATUS</span>
                    <span style="color: #28a745; font-weight: 600;">ACTIVE</span>
                </div>
            </div>

            <a href="login.jsp" class="btn-back">LOGOUT</a>
        </div>
    </div>

</body>
</html>
