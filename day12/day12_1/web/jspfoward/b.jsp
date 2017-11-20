<h1>b.jsp</h1>
<%
    String name = request.getParameter("username");
    String password = request.getParameter("password");
    out.print(name + ", " + password);
%>
