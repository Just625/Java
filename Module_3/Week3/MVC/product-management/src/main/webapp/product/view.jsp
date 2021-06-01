<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/1/2021
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
    <style>
        table{
            font-family: Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }
        td,th{
            border: 1px solid #ddd;
            padding: 8px
        }
        th{
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #04AA6D;
            color: white;
        }
        #price{
            text-align: right;
        }
    </style>
</head>
<body>
<h1>View product detail</h1>
<p><a href="/products">Back to product list</a></p>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>${requestScope["product"].id}</td>
        <td>${requestScope["product"].name}</td>
        <td id="price">${requestScope["product"].price}</td>
        <td>${requestScope["product"].description}</td>
    </tr>
</table>
</body>
</html>
