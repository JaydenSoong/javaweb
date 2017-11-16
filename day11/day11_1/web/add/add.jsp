<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/16
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%-- 演示 JSP 与 Servlet 分离，JSP 提交表单，Servlet 作运算处理。--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>加法运算</title>
</head>
<body>
    <form action="/day11_1/AddServlet" method="post">
        <input type="text" name="num1">
        <span> + </span>
        <input type="text" name="num2">
        <span>  </span>
        <input type="submit" value="计算">
    </form>
</body>
</html>
