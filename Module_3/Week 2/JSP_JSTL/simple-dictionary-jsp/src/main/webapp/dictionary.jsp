<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/28/2021
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("dream" , "giấc mơ");
        dictionary.put("cartoon" , "hoạt hình");
        dictionary.put("laptop" , "máy tính xách tay");
        dictionary.put("glas" , "kính");
        String word = request.getParameter("word");
        String result = dictionary.get(word);
        String finalResult = "Can not find "+word;
        if(result!=null){
            finalResult=result;
        }
    %>
    <h3>Word: <%=word%></h3>
    <h3>Translate to: <%=finalResult%></h3>
</body>
</html>
