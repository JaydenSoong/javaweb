<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: SOONG
  Date: 2017/11/22
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Date date = new Date();
    request.setAttribute("date", date);
%>
<%-- 格式化时间 --%>
    <fmt:formatDate value="${requestScope.date}" pattern="YYYY-mm-dd hh:mm:ss" />
<%-- 格式化数字 --%>
<hr>
<%
    request.setAttribute("num", 3.1);
%>
<%-- 会补零 --%>
    <fmt:formatNumber value="${num}" pattern="0.000"/>
<br>
<%-- 不会补零 --%>
    <fmt:formatNumber value="${num}" pattern="#.##"/>
</body>
</html>
