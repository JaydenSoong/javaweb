<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/16
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>获取 Cookie</title>
</head>
<body>
    <h2>获取 Cookie</h2>
    <%
        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies) {
            out.print(c.getName() + " = " + c.getValue() + "<br>");
        }
    %>
</body>
</html>
