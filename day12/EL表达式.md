# EL 表达式
1. EL 是 JSP 的内置表达式语言
    * 从 JSP 2.0 开始，不让使用 Java 脚本，而是使用 EL 表达式和动态标签来代替 Java 脚本。
    * EL 表达式代替的是 <%= ... %> 也就是说，EL 表达式只能做输出。
2. EL 表达式来查找四大域
    * ${xxx} 全域查找名为 "xxx" 的属性。如果不存在，则输出空字符串，而不是 null
    * ${pageScope.xxx}、${request.xxx}、${session.xxx}、${application.xxx} 在指定域中查找名为 "xxx" 的属性
3. JavaBean 民航
4. EL 可以输出的东西都在 11 个内置对象中。其中 10 个是 Map，pageContext 不是 Map，它就是 PageContext 类型
    * pageScope
    * requestScope
    * sessionScope
    * applicationScope
    * param: 对应参数，它是一个 Map，其中 key 是参数名，value 是参数值。适合于单值。
    * paramValues: 对应参数，它是一个 Map，其中 key 是参数名，value 是多个参数值。适合于多值。
    * header: 对应请求头，它是一个 Map，其中，key 是头名称，value 是单个的头值。适合于单值。
    * headerValues: 对应请求头，它是一个 Map，其中，key 是头名称，value 是多个的头值。适合于多值。
    * initParam: 获取 \<context-param> 内的参数
        ```
        <context-param>
            <param-name>xxx</param-name>
            <param-value>XXX</param-value>
        </context-param>
        <context-param>
            <param-name>yyy</param-name>
            <param-value>YYY</param-value>
        </context-param>
        ```
    * cookie: Map<String, Cookie> 类型，其中 key 是 cookie 的 name, vaule 是 cookie 对象。取得具体值还要加上 .value。如 ${cookie.username.value}
    * pageContext: 它就是 pageContext 类型。
        ```
        // 获取协议
        ${pageContext.request.scheme}<br>
        // 获取请求方式
        ${pageContext.request.method}<br>
        // 获取项目地址 
        ${pageContext.request.contextPath}
        ```