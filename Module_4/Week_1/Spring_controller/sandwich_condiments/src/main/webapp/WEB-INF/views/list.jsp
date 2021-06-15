<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/14/2021
  Time: 2:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Condiment list </title>
</head>
<body>
<h1>Condiments for sandwich</h1>
<p>${message}</p>
<a href="/">Back to picking condiment</a>
<ol>
  <c:forEach items="${condiments}" var="condiment">
    <li>${condiment}</li>
  </c:forEach>
</ol>
</body>
</html>
