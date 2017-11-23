# JSTL
## 概述
* apache 的产品，依赖 EL 表达式。
* 使用 JSTL 需要先下载 jakarta-taglibs-standard-1.1.2，然后导入 jstl.jar、standard.jar 至 /web/lib 下
* 四大库
    1. core: 核心库，重点
    2. fmt：格式化，日期，数字
    3. sql：过时
    4. xml：过时
## core --> c 标签
1. out 和 set
    * <c:out> 输出
        * value：可以是字符串常量，也可以是 EL 表达式。
        * default：当要输出的内容为 null 时，会输出 default 指定的值。 
        * escapeXml：默认值为 true，表示转义。
    * <c:set> 设置
        * var：变量名
        * value：变量值，可以是 EL 表达式
        * scope：域，默认为 page，可选值 page、request、session、application
2. remove
    * <c:remove> 删除变量
        * var：变量名
        * scope：如果不指定，则是删除所有域中的该名称的变量。如果指定了域，则是删除该域中变量。
3. url
    * <c:url> 输出一个 url
        * value：指定一个路径，它会在路径前自动添加项目地址。如：
            ```
            // 将会输出 /day13_1/index.jsp
            <c:url value="/index.jsp" />
            ```
        * <c:param>: 子标签，用来给 url 后面添加参数。如：
            ```
            // 将输出 /day13_1/index.jsp?username=%e5%bc%a0%e4%b8%89 
            <c:url value="/index.jsp">
                <c:param name="username" value="张三">
            </c:url>
            ```
        * var：指定变量名，一旦添加了这个属性，那么 url 标签就不会输出到页面。而是保存到域中。
        * scope：它与 var 一起使用，用来保存 url 到指定域中。
4. if
    * <c:if> 对应 Java 中的 If 语句
        ```
        // 当 test 为真时，执行标签体里面的内容
        <c:if test="布尔类型">...</c:if>
        ```
5. choose
    * <c:choose> 对应 Java 中的 If/else if/ else if/.../ else
        ```
        <c:choose>
            <c:when test="">...</c:when>
            <c:when test="">...</c:when>
            <c:when test="">...</c:when>
            <c:when test="">...</c:when>
            <c:otherwise>...</c:otherwise>
        </c:choose>
        ```
