<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/16
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>保存 Cookie</title>
</head>
<body>
<h2>保存Cookie</h2>
<%
    Cookie cookie1 = new Cookie("aaa", "AAA");
    response.addCookie(cookie1);
    Cookie cookie2 = new Cookie("bbb", "BBB");
    response.addCookie(cookie2);
%>
</body>
</html>
