<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/31/2021
  Time: 5:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Deleting user</title>
</head>
<body>
<h1>Delete user</h1>
<p>
  <a href="/users">Back to user list</a>
</p>
<form method="post">
  <h3>Are you sure?</h3>
  <fieldset>
    <legend>User information</legend>
    <table>
      <tr>
        <td>Name:</td>
        <td> ${user.name}</td>
      </tr>
      <tr>
        <td>Email:</td>
        <td> ${user.email}</td>
      </tr>
      <tr>
        <td>Country:</td>
        <td> ${user.country}</td>
      </tr>
      <tr>
        <td></td>
        <td><button>Delete user</button></td>
      </tr>
    </table>
  </fieldset>
</form>
</body>
</html>
