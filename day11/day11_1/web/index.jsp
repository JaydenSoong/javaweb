<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/16
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%-- 这是一条 Java 指令 --%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>JSP 基础</title>
  </head>
  <body>
    <%-- 定义Java 代码片段（类似方法体里面的东西）--%>
    <% int a = 10; %>
    <%-- 显示表达式或变量的值--%>
    <%-- 显示10 --%>
    <%= a %>
    <br>
    <%-- 显示10 --%>
    <% out.print(a);%>
    <br>
    <%-- 声明（类似类体里面的东西）--%>
    <%!
      private int a = 100;
      private void show() {
        System.out.println("Hello, World");
      }
    %>
    <%-- 显示 100 --%>
    <%= this.a++ %>
    <%-- 调用方法 --%>
    <% show();%>
  </body>
</html>
