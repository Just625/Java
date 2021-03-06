<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/31/2021
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new customer</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
    <h1>Create new customer</h1>
<p>
    <c:if test='${message!=null}'>
        <span class="message">${message}</span>
    </c:if>
</p>
<p>
    <a href="/customers">Back to customer list</a>
</p>
    <form method="post">
        <fieldset>
<%--            Tag legend đi kèm fieldset để bao quanh 2 chữ Customer  information--%>
            <legend>Customer information</legend>
            <table>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" id="name"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" id="email"></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="address" id="address"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><button >Create customer</button></td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</html>
