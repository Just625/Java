<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/27/2021
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Converter</title>
    <style>
      input{
        height: 28px;
        margin: 10px 0px;
        padding: 5px;
      }
      button{
        background-color: #C0C0C0;
        border-radius: 16%;
        width: 73px;
        height: 42px;
      }
    </style>
  </head>
  <body>
    <h1>Currency Converter</h1>
    <form method="post" action="/convert">
      <label>Rate: </label><br/>
      <input type="number" name="rate" placeholder="rate" value="22000"><br/>
      <label>USD: </label><br/>
      <input type="number" name="usd" placeholder="usd" value="0"><br/>
      <button type="submit">Converter</button>
    </form>
  </body>
</html>
