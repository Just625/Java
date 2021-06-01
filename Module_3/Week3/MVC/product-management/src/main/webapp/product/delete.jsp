<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/1/2021
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete product</title>
</head>
<body>
<h1>Delete product</h1>
<form action="" method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["product"].name}</td>
            </tr>
            <tr>
                <td>Price: </td>
                <td>${requestScope["product"].price}</td>
            </tr>
            <tr>
                <td>Description: </td>
                <td>${requestScope["product"].description}</td>
            </tr>
            <tr>
                <td></td>
                <td><button>Delete product</button></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
