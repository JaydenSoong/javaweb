<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/20
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>a.jsp</h1>
<jsp:include page="b.jsp">
    <jsp:param name="username" value="Jayden" />
    <jsp:param name="password" value="123456" />
</jsp:include>
</body>
</html>
