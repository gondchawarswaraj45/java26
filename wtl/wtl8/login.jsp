<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>University Portal</title>
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<body>

    <div class="portal-container">
        <div class="logo-section">
            <h1>Student Portal</h1>
            <p class="subtitle">Secure login for authorized personnel</p>
        </div>

        <s:if test="hasActionErrors()">
            <div class="error-msg">
                <s:actionerror />
            </div>
        </s:if>

        <s:form action="login" method="post">
            <div class="form-group">
                <label for="username">STUDENT ID</label>
                <s:textfield name="username" id="username" placeholder="e.g. student" autocomplete="off" />
            </div>
            
            <div class="form-group">
                <label for="password">PASSWORD</label>
                <s:password name="password" id="password" placeholder="••••••••" />
            </div>

            <s:submit value="Sign In" cssClass="btn-login" />
        </s:form>
    </div>

</body>
</html>
