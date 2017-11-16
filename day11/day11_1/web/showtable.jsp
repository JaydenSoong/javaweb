<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/16
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>循环输出表格</title>
    <style>
        table{collapse: none}
        tr{height: 30px}
    </style>
</head>
<body>
    <table border="1" align="center" width="60%">
        <%
            for (int i=0; i<10; i++) {
        %>
        <tr><td></td><td></td><td></td><td></td></tr>
        <%}%>
    </table>
</body>
</html>
