# JSP 三大指令
一个 JSP 页面中，可以有 0~N 个指令的定义。
## 1. page 指令
格式：<%@ page att="", att1=""...%>，主要属性：
* pageEncoding 和 contentType：
    
    pageEncoding: 指定当前 JSP 页面的编码，服务器在把 JSP 编译成 .java 时需要使用 pageEncoding。

    contentType：表示添加一个响应头。等同于 response.setContentType("text/html; charset=utf-8");

    如果两个属性只提供一个，那么另一个的默认值为提供的那一个。

    如果两个属性都没有设置，那么默认编码是 iso(不支持中文)
* import: 导包，可以出现多次
* errorPage 和 isErrorPage
    
    errorPage: 指定当前页面若出现异常，将要请求转发到哪一个页面

    isErrorPage: 指定当前页面是否是处理异常的页面。当该属性为 true 时，这人页面会设置状态码 500，而且这个页面可以使用 9 大内置对象的 exception。
* xml 设置 error-page
    ```
    <error-page>
        <error-code>404</error-code>
        <location>/404.jsp</location>
    </error-page>
    <error-page>
        <error-code>500</error-code>
        <location>/500.jsp</location>
    </error-page>
    <error-page>
        <exception-type>java.lang.RuntimeException</exception-type>
        <location>/runtimeException.jsp</location>
    </error-page>
    ```
* autoFlush 和 buffer

    autoFlush: 指定 JSP 输出流缓冲区满时，是否自动刷新，默认为 true, 若为 false, 那么在缓冲区满时抛出异常

    buffer: 指定缓冲区大小，默认为 8KB, 通常不需要修改
* isELIgnored: 是否忽略 EL 表达式，默认为 false。
* 基本没有用的属性：
    language: 指定当前 JSP 编译后的语言类型
    info: 信息
    isThreadSafe: 当前 JSP 是否支持并发访问
    session: 当前页面是否支持 session。如果为 false，那么当前页面就没有 session 这个内置对象。
    extends: 让 JSP 生成的 Servlet 去继承该属性指定的类。
## 2. include 指令（静态包含）
* 与 RequestDispatcher 的 include() 方法功能非常相似。
* <%@ include %> 它是在 JSP 编译成 .java 文件时完成的。它们共同生成一个 .java 文件。然后再生成一个 .class
* RequestDispather 的 include() 是一个方法。包含和被包含的是两个 Servlet。即两个 .class 文件。他们只是响应的内容在运行时合并了。
* 作用，把页面分解了。使用包含的方式组合在一起。这样，一个页面中不变的部分就是一个 JSP, 我们只需要处理变化的部分。
## 3. tablib 标签（导入标签库）
* 两个属性:
    1. prefix: 指定标签库在本页面中的前缀。由我们自己来起名字
    2. uri: 指定标签库的位置。
* 如：
    ```
    // 前缀名，我们起为 pre。位置是 /struts_tags。假如这个库里有一个标签 text。在页面中就应该是<pre:text>
    <%@tablib prefix="pre" uri="/struts_tags"%>
    ```

