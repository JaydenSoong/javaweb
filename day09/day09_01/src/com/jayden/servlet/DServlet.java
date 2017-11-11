package com.jayden.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * GenericServlet 出现的意义就是为了简化操作，使得我们再创建 Servlet 类的时候，就只需要重写它里面的 service() 一个抽象
 * 方法就可以了。其它的方法，GenericServlet 已经帮我们实现了。
 */
public class DServlet extends GenericServlet{

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("每次请求都会被调用...");
    }
}
