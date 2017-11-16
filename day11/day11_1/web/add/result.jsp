<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/16
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%-- 显示结果数据 --%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>计算结果</title>
</head>
<body>
    <span>所得结果：</span>
    <% Integer result = (Integer) request.getAttribute("result");%>
    <%= result%>
</body>
</html>
