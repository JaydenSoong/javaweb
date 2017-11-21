<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/21
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>EL 表达式进行域查找</title>
  </head>
  <body>
  <%-- java 脚本设置域 --%>
  <%
    request.setAttribute("xxx", "request_XXX");
    pageContext.setAttribute("xxx", "pageContext_XXX");
    session.setAttribute("xxx", "session_XXX");
    application.setAttribute("xxx", "application_XXX");
  %>
  <%-- EL 表达式进行全域查找 --%>
  ${xxx}
  <%-- EL 表达式进行指定域查找 --%>
  <hr>
  ${pageScope.xxx}<br>
  ${requestScope.xxx}<br>
  ${sessionScope.xxx}<br>
  ${applicationScope.xxx}
  </body>
</html>
