<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/21
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- 获取协议 --%>
${pageContext.request.scheme}<br>
<%-- 获取请求方式 --%>
${pageContext.request.method}<br>
<%-- 获取项目地址 --%>
${pageContext.request.contextPath}<br>
<%-- 获取项目地址的使用 --%>
<a href="${pageContext.request.contextPath}/header/a.jsp">点击这里</a>
<form action="${pageContext.request.contextPath}/param/a.jsp" method="post">
    <input type="submit" value="submit">
</form>
<%-- 通过 pageContext 对象可以获取到 session 对象  --%>
${pageContext.session.id}
</body>
</html>
