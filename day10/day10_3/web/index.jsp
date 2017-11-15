<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/15
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>获取请求参数</title>
  </head>
  <body>
  <h1>获取两种请求参数</h1>
  <h2>获取超链接参数</h2>
  <a href="/day10_3/AServlet?username=Jayden&password=123434">获取超链接参数</a>
  <h2>获取表单参数</h2>
  <form action="/day10_3/AServlet" method="post">
    用户名：<input type="text" name="username"><br>
    密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"><br>
    爱&nbsp;&nbsp;&nbsp;好：<input type="checkbox" name="hobby" value="cf">吃饭
    <input type="checkbox" name="hobby" value="sj">睡觉
    <input type="checkbox" name="hobby" value="kds">看电视
    <br>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
