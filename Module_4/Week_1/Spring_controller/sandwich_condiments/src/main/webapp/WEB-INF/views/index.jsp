<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/14/2021
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Condiments</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="save">
    <input type="checkbox" name="condiment" value="lettuce">
    <label>Lettuce</label>
    <input type="checkbox" name="condiment" value="tomato">
    <label>Tomato</label>
    <input type="checkbox" name="condiment" value="mustard">
    <label>Mustard</label></br>
    <input type="checkbox" name="condiment" value="sprouts">
    <label>Sprouts</label></br>
    <button>Save</button>
</form>
</body>
</html>
