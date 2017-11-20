# JavaBean
## JavaBean 规范
1. 必须要有一个默认的构造器（无参构造器）
2. 必须提供 get/set 方法。如果只提供 get 方法，那么这个属性是只读属性。
3. 属性：有 get/set 方法的成员。也可以不是成员。只有 get/set 方法。属性名称由 get/set 方法来决定，而不是成员名称。
4. 方法名称满足一定的规范，那么它就是属性。布尔类型的属性，它的读方法可以是 is 开头，也可以是 get 开头。
## 内省
1. 内省类 --> Bean 信息 --> 属性的描述 --> 属性的 get/set 对应的 Method --> 反射
2. commons-beanutils 依赖内省。使用时要先导包
    * commons-beanutils.jar
    * commons-logging.jar
## JSP 中与 javaBean 相关的标签(基本没有用，相关动作都在 Servlet 中完成)
1. \<jsp:useBean> 创建或查找 bean
    ```
    // 在 session 中查找名为 user1 的 bean。若没有，则创建。
    <jsp:useBean id="user1" class="com.jayden.domain.Person" scope="session">
    ```
2. \<jsp:setProperty> 修改属性
    ```
    // 将名为 user1 的 bean 的 username 属性设置为 admin
    <jsp:serProperty property="username" name="user1" value="admin">
    ```
3. \<jsp:getProperty> 获取属性
    ```
    // 获取名为 user1 的 bean 的 username 属性
    <jsp:serProperty property="username" name="user1" >
    ```