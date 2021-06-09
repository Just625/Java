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
    <title>Edit book</title>
    <style>
        span {
            color: green;
        }

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        .edit-container {
            background: url(https://media.discordapp.net/attachments/416883390541725696/851112158577164308/login-background.jpg?width=711&height=473);
            height: 100vh;
            background-size: cover;
            display: flex;
            justify-content: flex-end;
        }

        .title {
            text-align: center;
            font-size: 39px;
            color: #757575;
            font-family: sans-serif;
            padding-top: 20px;
            padding-bottom: 20px;
            margin-bottom: 20px;
        }

        .edit-form {
            width: 400px;
            height: 100vh;
            background: #ffffff;
            padding: 20px;
        }

        .submit-wrapper {
            display: flex;
            justify-content: space-between;
            margin-top: 15px;
        }

        .btn {
            padding: 7px 18px;
            color: white;
            background-color: #007bff;
            border-width: 1px;
            border-radius: 3px;
        }

        input {
            width: 136%;
            padding: 10px 13px;
            border-radius: 5px;
            border: 1px solid #dbdbdb;
        }

        #category_id {
            width: 106px;
            height: 33px;
        }

        .input-status {
            width: 30%;
        }
        .input-wrapper{
            margin-bottom:10px;
        }
    </style>
</head>
<body>
<div class="edit-container">
    <div class="edit-form">
        <div class="title">Edit product</div>
        <p>
            <c:if test='${message!=null}'>
                <span>${message}</span>
            </c:if>
        </p>
        <form action="" method="post">
            <fieldset>
                <legend>Product information</legend>
                <table>
                    <tr>
                        <td>
                            <div class="input-wrapper">
                                Name:
                            </div>
                        </td>
                        <td>
                            <div class="input-wrapper">
                                <input type="text" name="name" id="name" value="${product.name}">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="input-wrapper">
                                Price:
                            </div>
                        </td>
                        <td>
                            <div class="input-wrapper"><input type="text" name="price" id="price"
                                                              value="${product.price}"></div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="input-wrapper">Quantity</div>
                        </td>
                        <td>
                            <div class="input-wrapper"><input type="text" name="quantity" id="quantity"
                                                              value="${product.quantity}"></div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="input-wrapper">Color</div>
                        </td>
                        <td>
                            <div class="input-wrapper"><input type="text" name="color" id="color"
                                                              value="${product.color}"></div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="input-wrapper">Description:</div>
                        </td>
                        <td>
                            <div class="input-wrapper"><input type="text" name="description" id="description"
                                                              value="${product.description}"></div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="input-wrapper">Category:</div>
                        </td>
                        <td>
                            <div class="input-wrapper">
                                <select name="category_id" id="category_id">
                                    <c:forEach items="${categories.entrySet()}" var="category">
                                        <c:if test="${book.category_id == category.getKey()}">
                                            <option value="${category.getKey()}" selected="selected">
                                                <c:out value="${category.getValue()}"/>
                                            </option>
                                        </c:if>
                                        <c:if test="${!(book.category_id == category.getKey())}">
                                            <option value="${category.getKey()}">
                                                <c:out value="${category.getValue()}"/>
                                            </option>
                                        </c:if>
                                    </c:forEach>
                                </select>
                            </div>
                        </td>
                    </tr>
                </table>
            </fieldset>
            <div class="submit-wrapper">
                <button class="btn" type='submit'>Update product</button>
                <div><a href="/products">Back to product list</a></div>
            </div>
        </form>
    </div>
</div>

</body>
</html>
