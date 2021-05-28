<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/28/2021
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      input{
        margin-bottom: 10px;
      }
      button{
        width: 80px;
        height: 36px;
      }
    </style>
  </head>
  <body>
  <h1>Currency Converter</h1>
    <form method="get" action="converter.jsp">
      <label >Rate</label></br>
      <input type="number" name="rate" value="22000"></br>
      <label >USD</label></br>
      <input type="number" name="usd" value="0"></br>
      <button>Converter</button>
    </form>
  </body>
</html>
