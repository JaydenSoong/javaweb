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
    <c:out value="${code}" />
    <hr>

    <%-- EL 表达式获取地址 --%>
    ${pageContext.request.contextPath}/index.jsp
    <br>
   <%-- url 标签，比上面的 EL 方式更方便 --%>
    <c:url value="/index.jsp" />
    <br>
    <c:url value="/index.jsp"><c:param name="username" value="张三" /></c:url>
    <br>
  <%-- url 标签在超链接中的应用 --%>
    <a href="<c:url value="/index.jsp"><c:param name="username" value="张三" /></c:url>">首页</a>
    <c:if test="${empty param.username}">
     您还没有输入 useranme
    </c:if>
    <c:choose>
        <c:when test="${empty param.username}">您还没有输入 useranme</c:when>
        <c:when test="${not empty param.username}">${param.username}</c:when>
    </c:choose>
  <hr>
  <%--<c:set var="Arr" value="{1, 2, 3, 4, 5}" scope="request" />--%>
    <%
        int[] Arr = {1, 2, 3, 4, 5, 6, 7};
        request.setAttribute("Arr", Arr);
    %>
  <c:forEach items="${Arr}" var="i" >
      ${i}
  </c:forEach>
  </body>
</html>
