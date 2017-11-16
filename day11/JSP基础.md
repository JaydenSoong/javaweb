# JSP 基础
## 1. JSP 的作用
* Servlet

    缺点：不适合设置 html 响应体，需要大量的 response.getWriter().print("\<html>");

    优点：动态资源，可以编程。
* html
    
    缺点：html 是静态页面，不能包含动态信息。
    优点：不用为输出 html 标签而发愁。
* JSP

    优点：在原有的 html 的基础上添加脚本，构成 JSP 页面。
## JSP 和 Servlet 的分工
* JSP 
    
    作为请求的发起页面，例如显示表单、超链接

    作为请求的结束页面，例如显示数据。
* Servlet

    作为请求中处理数据的中间环节。
## JSP 的组成
* JSP = html + java 脚本 + java 标签（指令）
* JSP 中无需创建即可使用的对象有 9 个，被称为 9 大内置对象。例如：request 对象，out 对象。
* 3 种 java 脚本

    <%...%>：java 代码片段（常用），用于定义 0~N 条 Java 语句。—— 方法内能写什么，它就能放什么。

    <%=...%>：java 表达式（常用），用于输出一条表达式或变量的结果。—— response.getWriter().print() 能放什么，它就能放什么。
    
    <%!...%>：声明，用来创建类的成员变量和成员方法（基本不用）—— 类体中可以放什么，它就可以放什么。
## JSP 原理
* JSP 其实是一种特殊的 Servlet

    当 JSP 页面第一次被访问时，服务器会把 JSP 编译成 Java 文件（这个 Java 文件其实是一个 Servlet 类）

    然后再把 Java 编译成 class 

    然后再创建该类对象

    最后调用它的 service() 方法

    第二次请求同一页面时，直接调用 service() 方法

## JSP 注释
<%-- ... --%>：当服务器把 JSP 编译成 .java 文件时已经忽略了注释部分。