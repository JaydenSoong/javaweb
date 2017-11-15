## Request 域
Servlet 中的三大域对象：request、session、application，都有如下三个方法
* void setAttribute(String name, Object value)
* Object getAttribute(String name)
* void removeAttribute(String name)

同一个请求范围内通过 request.setAttribute()、request.getAttribute() 来传值。