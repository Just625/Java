<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.codegym.Customer" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/28/2021
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Display customer list</title>
    <style>
      table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
        padding: 15px;
        width: 700px;
        text-align: center;
      }
    </style>
  </head>
  <body>
    <h1>Danh sách khách hàng</h1>
    <%
      List<Customer> customerList = new ArrayList<>();
      customerList.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội","first.jpg"));
      customerList.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang","second.jpg"));
      customerList.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định","third.jpg"));
      customerList.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây","fourth.jpg"));
      customerList.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội","fifth.jpg"));
      pageContext.setAttribute("customers", customerList);
    %>
    <table>
      <tr>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
      </tr>
      <c:forEach items="${customers}" var="customer" >
        <tr>
          <td>
            <c:out value="${customer.name}"/>
          </td>
          <td>
            <c:out value="${customer.dOB}"/>
          </td>
          <td>
            <c:out value="${customer.address}"/>
          </td>
          <td>
            <img src="${customer.imgPath}" alt="" width="100" height="100">
          </td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
