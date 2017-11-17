<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/17
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>用户登录</title>
    <form action="/day11_3/LoginServlet" method="post">
        <label> 用户名：
            <input type="text" name="username">
        </label>
        <br>
        <br>
        <label> 密 &nbsp;&nbsp;&nbsp;码：
            <input type="password" name="password">
        </label>
        <br>
        <input type="submit" value="登录">
    </form>
    <%
        Object obj = request.getAttribute("succed");
        if (obj != null) {
            String str = (String) obj;
            out.print(str);
        }
    %>
</head>
<body>

</body>
</html>
