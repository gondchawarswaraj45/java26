<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login | Student Portal</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <!-- Font Awesome for academic icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
</head>
<body>

    <div class="portal-container">
        <div class="portal-card">
            <div class="logo-section">
                <div class="logo-icon">
                    <i class="fas fa-university"></i>
                </div>
                <h1>Student Portal</h1>
                <p class="subtitle">Access your academic dashboard</p>
            </div>

            <!-- Struts Action Error -->
            <s:if test="hasActionErrors()">
                <div class="error-msg">
                    <i class="fas fa-exclamation-circle"></i> 
                    <s:actionerror />
                </div>
            </s:if>

            <s:form action="login" method="post">
                <div class="form-group">
                    <label for="username">Student ID / Username</label>
                    <s:textfield name="username" id="username" placeholder="e.g. S12345" />
                </div>
                
                <div class="form-group">
                    <label for="password">Password</label>
                    <s:password name="password" id="password" placeholder="••••••••" />
                </div>

                <s:submit value="Sign In to Portal" cssClass="btn-login" />
            </s:form>

            <div class="footer-links">
                <p><a href="#">Forgot Password?</a> | <a href="#">Help Center</a></p>
                <p style="margin-top: 15px; font-size: 0.8rem;">
                    Secure Login System &copy; 2024 University Lab
                </p>
            </div>
        </div>
    </div>

</body>
</html>
