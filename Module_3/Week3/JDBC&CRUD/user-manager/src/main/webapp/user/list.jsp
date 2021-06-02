<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/1/2021
  Time: 4:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<h1>User</h1>
<p>
    <a href="/users?action=create">Create new customer</a>
</p>
<form action="">
    <input type="text" name="q" placeholder="Search">
    <button>Search by address</button>
</form>
<button><a href="/users?sort=true">Sort</a></button>
<table border="=1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Email</td>
        <td>Country</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach  items="${users}" var="user">
        <tr>
            <td><c:out value="${user.id}"></c:out></td>
            <td><c:out value="${user.name}"></c:out></td>
            <td>${user.email}</td>
            <td>${user.country}</td>
            <td><a href="/users?action=edit&id=${user.id}">Edit</a></td>
            <td><a href="/users?action=delete&id=${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
