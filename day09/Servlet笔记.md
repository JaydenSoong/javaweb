## Servlet概述
### 1. 什么是 Servlet
Servlet 是 JavaWeb 的三大组件之一，它属于动态资源。其作用是处理请求，服务器会把接收到的请求交给 Servlet 来处理。在 Servlet 中通常需要：

   * 接收请求数据
   * 处理请求
   * 完成响应

Servlet 需要我们自己来编写，每个 Servlet 必须实现 javax.servlet.Servlet 接口。
### 2. 实现 Servlet 的方式
实现 Servlet 有三种方式：

   * 实现 javax.servlet.Servlet 接口
   * 继承 javax.servlet.GenericServlet 类
   * 继承 javax.servlet.http.HttpServlet 类

Servlet 中的方法大多数不由我们来调用，而是由 Tomcat 来调用。并且 Servlet 对象也不是由我们来创建，而是由 Tomcat 来创建。 