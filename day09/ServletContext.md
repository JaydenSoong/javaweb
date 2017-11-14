# ServletContxt
## 1. ServletContext 概述
服务器会为每个应用创建一个 ServletContext 对象：

   * ServletContext 对象的创建是在服务器启动时完成的。
   * ServletContext 对象的销毁是在服务器关闭时完成的。

ServletContext 对象的作用是在整个 Web 应用的动态资源中共享数据，例如在 AServlet 中向 ServletContext 中保存一个数据，在 BServlet 中就可以获取这个值。
## 2. 获取 ServletContext
* ServletConfig # getServletContext()
* GenericServlet # getServletContext()
* HttpSession # getServletContext()
* ServletContextEvent # getServletContext()
## 3. 域对象的功能
ServletContext 是 JavaWeb 四大域对象之一。（域对象就是用来在多个Servlet 中传输数据）
* PageContext
* ServletContext
* HttpSession
* ServletContext

所有域对象都有存取数据的功能，因为域对象中间有一个 Map，用来存取数据。下面是 ServletContext 用来操作数据的方法
* void setAttribute(String name, Object value): 存储一个对象。
* Object getAttribute(String name): 得到指定名称属性的值;
* void removeAttribute(String name): 删除指定名称的属性;
* Enumeration getAttributeNames(): 获取所有属性的名称;
## 4. 获取应用初始化参数
Servlet 可以用来获取初始化参数。但这种方式获取的是局部的参数。也就是说，一个 Servlet 只能获取自己的初始化参数。对于公共的初始化参数，只能通过 ServletContext 来获取。配置公共初始化参数是在\<servlet>\</servlet>外面配置的。
```
<servlet>....</servlet>
<context-param>
    <param-name>context_name</param-name>
    <param-value>context_value</param-value>
</context-param>
```
## 5. 获取资源的相关方法
* **获取真实路径**
    ```
    String s = this.getServletContext().getRealPath("/index.jsp")
    ```
* 获取资源流
    ```
    InputStream inputStream = this.getServletContext.getResourceAsStream("/index.jsp");
    ```
* 获取指定目录下的所有资源路径
    ```
    Set<String> set = this.getServletContext().getResourcePaths("/WEB-INF")
    ```