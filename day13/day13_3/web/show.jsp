<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/23
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr><th>用户名</th><th>密码</th></tr>
    <tr><td>${requestScope.user.username}</td><td>${requestScope.user.password}</td></tr>
</table>
</body>
</html>
