<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/27/2021
  Time: 4:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <head>
    <title>$Title$</title>
    <style>
      input{
        padding: 6px;
        border: 1px solid black ;
        margin-top: 8px;
        font-size: 17px;
      }
      button{
        border-radius: 4px;
        padding: 8px 24px;
        background-color: #C0C0C0;
      }
    </style>
  </head>
  <body>
    <h2>Vietnamese Dictionary</h2>
    <form method="post" action="/translate">
      <input type="text" name="wordSearch" placeholder="Enter your word here">
      <button type="submit">Search</button>
    </form>
  </body>
</html>
