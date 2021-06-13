<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/13/2021
  Time: 6:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<div class="container">
    <form action="" method="post">
        <div class="input-container">
            <label>English word: </label>
            <input type="text" name="eWord" value="${eWord}">
            <p style="color:red; font-size: 10px">${message}</p>
        </div>
        <div class="searchBtn">
            <button>Search</button>
        </div>
    </form>
    <div class="input-container">
        <label>Vietnamese word: </label>
        <input type="text"  readonly="readonly" value="${vnWord}">
    </div>
</div>
</body>
</html>
