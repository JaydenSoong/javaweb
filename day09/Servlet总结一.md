## Servlet 总结一
1. Servlet 对象生命周期方法
   * void init(ServletConfig servletconfig): 对象产生之后进行初始化。
   * void service(ServletRequest servletreuqse, ServletResponse servletresponse): 每次处理请求时都会被调用。
   * void destory(): 对象消毁前被调用。
2. 特性
   * 单例，每个 Servlet 类只有一个 Servlet 对象。可以有多个 Servlet 类。
   * 线程不安全，高效。
3. Servlet 类由我们来写，但 Servlet 对象由服务器创建，并且其方法也由服务器来调用。