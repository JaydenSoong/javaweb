<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/21
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String a = "aaa";
    pageContext.setAttribute("a", a);
%>
${fn:toUpperCase(a)}
</body>
</html>
