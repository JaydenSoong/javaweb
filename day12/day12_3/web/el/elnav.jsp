<%@ page import="com.jayden.domain.Address" %>
<%@ page import="com.jayden.domain.Employee" %><%--
  Created by IntelliJ IDEA.
  User: Jayden
  Date: 2017/11/21
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>EL 导航</title>
</head>
<body>
<%
    Address address = new Address();
    address.setCity("成都");
    address.setDistrict("双流");
    address.setStreet("临港路一段");

    Employee employee = new Employee();
    employee.setName("王五");
    employee.setSalary(2500);
    employee.setAddress(address);
    request.setAttribute("employee", employee);
%>
<%-- 传统方式输出 --%>
<%=((Employee)(request.getAttribute("employee"))).getAddress().getStreet()%>
<%-- EL 导航，与一面传统方式输出效果是一样的 --%>
${employee.address.street}
</body>
</html>
