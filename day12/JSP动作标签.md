# JSP 动作标签
## 1. JSP 的动作标签与 html 的标签有本质的区别
   * 这些动作标签是由 tomcat(服务器) 来解释执行。它与 Java 一样，都是服务器端的行为。
   * html 是由浏览器来执行的。
## 2. 常用的 JSP 动作标签
   * <jsp:include> 包含。它与 RequestDispatcher 的 include() 方法是一样的。一个是在 JSP 中使用，一个是在 forward 中使用。
   * <jsp:forward> 转发。它与 RequestDispatcher 的 forward() 方法是一样的。一个是在 JSP 中使用，一个是在 forward 中使用。
   * <jsp:param> 作为 <jsp:include> 和 <jsp:forword> 的子标签，用来传递参数。