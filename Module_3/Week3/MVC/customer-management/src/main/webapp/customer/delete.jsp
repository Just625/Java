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
    <title>Deleting customer</title>
</head>
<body>
    <h1>Delete customer</h1>
    <p>
        <a href="/customers">Back to customer list</a>
    </p>
    <form method="post">
        <h3>Are you sure?</h3>
        <fieldset>
            <legend>Customer information</legend>
            <table>
                <tr>
                    <td>Name:</td>
                    <td> ${requestScope["customer"].name}</td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td> ${requestScope["customer"].email}</td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td> ${requestScope["customer"].address}</td>
                </tr>
                <tr>
                    <td></td>
                    <td><button>Delete customer</button></td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</html>
