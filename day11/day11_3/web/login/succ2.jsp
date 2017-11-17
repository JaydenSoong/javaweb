<%@ page import="com.jayden.user.User" %><%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/17
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录反馈</title>
</head>
<body>
    <%
        Object obj = session.getAttribute("user");
        if (obj != null) {
            User user = (User) obj;
            out.print( user.getUsername() + " 欢迎回来!");
        } else {
            out.print("对不起，您还没有登录");
        }
    %>
</body>
</html>
