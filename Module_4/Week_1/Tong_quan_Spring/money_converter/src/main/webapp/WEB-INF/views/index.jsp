<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/13/2021
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert Menu</title>
    <style>
        .input-container{
            margin-bottom:10px;
        }
    </style>
</head>
<body>
<h1>Converter menu</h1>
<div class="container">
    <form method="post">
        <div class="input-container">
            <label>USD</label>
            <input type="number" name="usd" value=${usd}>
        </div>
        <div class="input-container">
            <label>rate</label>
            <input type="number" name="rate" value=${rate}>
        </div>
        <div  class="input-container">
            <button> Convert</button>
        </div>
        <div class="input-container">
            <label>VND</label>
            <input type="number" name="vnd" value="${vnd}" disabled="disabled">
        </div>
    </form>
</div>
</body>
</html>
