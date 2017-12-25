package com.soong.javaweb.day19;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public abstract class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取请求参数，并判断
        String methodName = req.getParameter("method");
        if (methodName == null || methodName.trim().isEmpty()) throw new RuntimeException("没有获取到您要调用方法的参数");

        // 得到 Class 对象
        Class cl = this.getClass();

        // 建立 method 对象
        Method method;
        try {
            // 通过反射为 method 赋值
            method = cl.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
        } catch (Exception e) {
            throw new RuntimeException("您要调用的方法 " + methodName + " 不存在!");
        }

        // 有了 method 就可以反射调用具体的方法
        try {
            // 得到方法调用之后的返回值，以决定是转发还是重定向，还是其它
            String result = (String) method.invoke(this, req, resp);
            // 如果没有返回值，或返回值为空，则什么也不做
            if (result == null || result.trim().isEmpty()) return;
            if (result.contains(":")) { // 若返回值包含“:”则用“:”将字符串分割，前缀表示处理方式，后缀表示路径
                String[] str = result.split(":");
                // 根据前缀决定处理方式
                switch (str[0]) {
                    case "f":
                        req.getRequestDispatcher(str[1]).forward(req, resp); // 前缀为 f，表示转发
                        break;
                    case "r":
                        resp.sendRedirect(req.getContextPath() + str[1]); // 前缀 r，表示重定向
                        break;
                    default:
                        throw new RuntimeException("您所需要的操作 " + str[0] + " 目前还不支持");
                }
            } else req.getRequestDispatcher(result).forward(req, resp); // 默认使用转发方式
        } catch (Exception e) {
            throw new RuntimeException("您调用的方法内部抛出了异常" + e);
        }
    }
}
