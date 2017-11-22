<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/22
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <%-- 使用 java 脚本设置 --%>
    <%
       request.setAttribute("code", "<script>alert('hello');</script>");
    %>
    <%-- 使用标签代替java脚本设置，与使用 java 脚本设置的效果是一样的。--%>
    <c:set var="code" value="<script>alert('hello');</script>" scope="request"/>

    <%-- 使用 EL 表达式进行输出 --%>
    ${code}
    <%-- 使用标签进行输出，有一个 escapeXml 属性，其默认值是 false。作用是将“<、>”等转义。
    所以使用下面的标签输出时将不会弹出对话框，而是输出字符串 --%>
    <c:out value="${code}" escapeXml="" />
  </body>
</html>
