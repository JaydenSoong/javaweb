package com.jayden.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 自定义的仿 GenericServlet 的类
 */
public class BServlet implements Servlet {
    // 声明一个成员变量，来保存 ServletConfig 对象
    private ServletConfig config;
    /**
     * 生命周期方法
     * 初始化后由 Tomcat 调用。
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        // 将 Tomcat 传来的 ServletConfig 对象保存起来
        this.config = servletConfig;
        // 调用自己定义的空参方法
        init();
    }

    // 定义一个空参方法，方便子类重写
    public void init() throws ServletException{

    }

    /**
     * 返回 init() 方法中保存的 ServletConfig 对象
     */
    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    /**
     *  用处不大，可以空实现
     */
    @Override
    public String getServletInfo() {
        return "";
    }

    /**
     *  用处不大，可以空实现
     */
    @Override
    public void destroy() {

    }

    public String getInitParameter(String name) {
        return this.config.getInitParameter(name);
    }

    public Enumeration getInitParameterNames() {
        return this.config.getInitParameterNames();
    }

    public ServletContext getServletContext() {
        return this.config.getServletContext();
    }

    public String getServletName() {
        return this.config.getServletName();
    }
}
