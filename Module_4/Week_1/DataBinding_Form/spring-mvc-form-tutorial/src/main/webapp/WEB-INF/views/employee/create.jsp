<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/16/2021
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a new employee</title>
</head>
<body>
<h3>Welcome, enter the employee details</h3>
<form:form method="post" action="/employee/addEmployee" modelAttribute="employee">
    <div class="input-container">
        <form:label path="id" >Id</form:label>
        <form:input path="id"/>
    </div>
    <div class="input-container">
        <form:label path="name" >Name</form:label>
        <form:input path="name"/>
    </div>
    <div class="input-container">
        <form:label path="contactNumber" >Contact number</form:label>
        <form:input path="contactNumber"/>
    </div>
    <button>Create</button>
</form:form>
</body>
</html>
