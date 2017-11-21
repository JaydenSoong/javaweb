<%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/21
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- map.key 这是 EL 的语法，也可以写成 map['key'] --%>
${param.username}<br>
${paramValues.hobby[0]}<br>
${paramValues.hobby[1]}
</body>
</html>
