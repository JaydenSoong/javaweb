# Servlet 细节
## Servlet 与线程安全
1. Servlet 是单例的。
2. Servlet 是线程不安全的。为了解决安全问题，可以：
    * 不要在 Servlet 中创建成员，创建局部变量即可。
    * 可以创建无状态成员
    * 可以创建有状态成员，但状态必须为只读的。如，只提供 get() 方法，不提供 set() 方法。
3. 因为是线程不安全的，所以是高效的。
## 让服务器在启动时就创建 Servlet 对象
默认情况下，服务器会在某个 Servlet 第一次收到请求时创建它。但也可以在 web.xml 中进行配置，使服务器在启动时就创建它。
```
<load-on-startup>0</load-on-startup>
```
load-on-startup 标签的值是一个非负的整数。服务器根据值的大小来确定创建顺序，先创建值小的。
## \<url-pattern>
\<url-pattern> 是 \<servlet-mapping> 的子元素，用来指定 Servlet 的访问路径，即 URL。它必须是以 “/” 开头。
1. 可以在\<servlet-mapping>中给出多个\<url-pattern>。表示多个URL都是指向同一个Servlet
2. 还可以在\<url-pattern>中使用通配符 “*”。可以匹配任何URL前缀或后缀。
    ```
    // 路径匹配：如 /servlet/a, /servlet/b。都可以匹配
    <url-pattern>/servlet/*</url-pattern>
    // 扩展名匹配：如 /abc/edf/hi.do, /a.do 都可以匹配
    <url-pattern>*.do</url-pattern>
    // 匹配所有
    <url-pattern>/*</url-pattern>
    ```
    注意：通配符要么为前缀，要么为后缀。不能出现在URL的中间位置，也不能只有通配符。例如 \/\*.do 就是错误的。因为通配出现在了中间位置上了。\*.\* 也是不对的，因为一个URL中间只能出现一个通配符。
## web.xml 文件的继承
在 ${CATALINA_HOME}\conf\web.xml 中的内容，相当于写到了每个项目的 web.xml 中。相当于是每一个 web.xml 的父文件。
