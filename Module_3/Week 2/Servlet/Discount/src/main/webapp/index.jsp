<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/27/2021
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        input {
            margin-bottom: 10px;
            height: 25px;
        }
        button{
            width: 80px;
            text-align: center;
            height: 36px;
        }
    </style>
</head>
<body>
<form method="post" action="/display-discount">
    <label>Product Description</label></br>
    <input type="text" name="productDescription" placeholder="Enter description for product"></br>
    <label>List Price</label></br>
    <input type="number" name="listPrice" placeholder="Enter price"></br>
    <label>Discount Percent</label></br>
    <input type="text" name="discountPercent" placeholder="Enter discount percent for product"></br>
    <button type="submit">Submit</button>
</form>
</body>
</html>
