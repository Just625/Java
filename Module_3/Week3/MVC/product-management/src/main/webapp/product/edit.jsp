<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/1/2021
  Time: 9:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit product</title>
    <style>
        span{
            color:green;
        }
    </style>
</head>
<body>
<h1>Edit product</h1>
<p>
   <c:if test='${requestScope["message"]!=null}'>
        <span >${requestScope["message"]}</span>
   </c:if>
</p>
<p>
    <a href="/products">Back to product list</a>
</p>
<form action="" method="post">
<fieldset>
    <legend>Product information</legend>
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" id="name" value="${requestScope["product"].name}"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="number" name="price" id="price" value="${requestScope["product"].price}"></td>
        </tr>
        <tr>
            <td>Description</td>
            <td><input type="text" name="description" id="description" value="${requestScope["product"].description}"></td>
        </tr>
        <tr>
            <td></td>
            <td><button>Update product</button></td>
        </tr>
    </table>
</fieldset>
</form>
</body>
</html>
