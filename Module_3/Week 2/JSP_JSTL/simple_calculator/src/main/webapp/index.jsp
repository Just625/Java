<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/28/2021
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
    <h1>Simple Calculator</h1>
    <h3>Calculator</h3>
    <form method="get" action="/calculate">
        <label>First operand: </label>
        <input type="number" name="firstNumb" placeholder="Enter first number"></br>
        <label>Operator: </label>
        <select name="operands">
            <option value="Addition">Addition</option>
            <option value="Subtraction">Subtraction</option>
            <option value="Multiplication">Multiplication</option>
            <option value="Division">Division</option>
        </select></br>
        <label>Second operand: </label>
        <input type="number" name="secondNumb" placeholder="Enter second number"></br>
        <button>Calculate</button>
    </form>
</body>
</html>
