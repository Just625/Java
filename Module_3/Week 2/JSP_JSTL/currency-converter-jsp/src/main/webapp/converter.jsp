<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/28/2021
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter</title>
</head>
<body>
    <%
        Float rate = Float.parseFloat(request.getParameter("rate"));
        Float usd = Float.parseFloat(request.getParameter("usd"));
        Float result = rate * usd;
    %>
    <h3>Rate: <%=rate%></h3>
    <h3>USD: <%=usd%></h3>
    <h3>Result: <%=result%></h3>
</body>
</html>
