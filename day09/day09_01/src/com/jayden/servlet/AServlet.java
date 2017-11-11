package com.jayden.servlet;
import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class AServlet implements Servlet {
    /**
     * 生命周期方法，在 Servlet 对象创建时调用，只被调用一次。
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init()...");

        // 获取Servlet的名称
        System.out.println(servletConfig.getServletName());
        // 获取初始化参数的值
        System.out.println(servletConfig.getInitParameter("n1"));
        System.out.println(servletConfig.getInitParameter("n2"));

        // 获取初始化参数的名称
        Enumeration e = servletConfig.getInitParameterNames();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }

    /**
     * 用来获取 Servlet 对象的配置信息
     */
    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig()...");
        return null;
    }
    /**
     * 使命周期方法，在 Servlet 对象生命周期内会被调用多次。
     * 每次处理请求都是调用这个方法
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service()...");
    }

    /**
     * 用来获取 Servlet 对象的信息
     * 一般不会被调用
     */
    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo()...");
        return null;
    }
    /**
     * 生命周期方法，在 Servlet 对象消费前调用，只被调用一次。
     */
    @Override
    public void destroy() {
        System.out.println("destroy()...");
    }
}
