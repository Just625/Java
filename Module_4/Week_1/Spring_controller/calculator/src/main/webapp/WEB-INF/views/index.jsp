<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/14/2021
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="" method="post">
    <input type="number" name="firstNumb" value="${firstNumb}">
    <input type="number" name="secondNumb" value="${secondNumb}"></br>
    <button name="operator" value="Addition">Addition(+)</button>
    <button name="operator" value="Subtraction">Subtraction(-)</button>
    <button name="operator" value="Multiplication">Multiplication(*)</button>
    <button name="operator" value="Division">Division(/)</button>
</form>
<p style="color: red">${error}</p>
<p> ${operator} ${result}</p>
</body>
</html>
