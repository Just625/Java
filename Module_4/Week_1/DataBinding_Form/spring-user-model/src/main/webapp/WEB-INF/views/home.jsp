<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/16/2021
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<h5>Login</h5>
<form:form action="/login" modelAttribute="login" method="post">
    <div class="input-container">
        <form:label for="account" path="account"></form:label>
        <form:input path="account" type="text" name="account" id="account"/>
    </div>
    <div class="input-container">
        <form:label for="password" path="password"></form:label>
        <form:input path="password" type="password" name="password" id="password"/>
    </div>
    <button>Login</button>
</form:form>
</body>
</html>
