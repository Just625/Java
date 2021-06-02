<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/1/2021
  Time: 9:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit user</title>
    <style>
        span{
            color:green;
        }
    </style>
</head>
<body>
<h1>Edit user</h1>
<p>
    <c:if test='${message!=null}'>
        <span >${message}</span>
    </c:if>
</p>
<p>
    <a href="/users">Back to user list</a>
</p>
<form action="" method="post">
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" id="name" value="${user.name}"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" id="email" value="${user.email}"></td>
            </tr>
            <tr>
                <td>Country</td>
                <td><input type="text" name="country" id="country" value="${user.country}"></td>
            </tr>
            <tr>
                <td></td>
                <td><button>Update user</button></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
