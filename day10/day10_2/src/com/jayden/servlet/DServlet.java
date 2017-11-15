package com.jayden.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 获取请求路径相关的方法
 * @Author: Jayden
 * @Date 2017/11/15 15:17
 */
@WebServlet(name = "DServlet", urlPatterns = {"/DServlet"})
public class DServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 将响应设置成 html, 否则 chrome firefox 不解析 html 标签
        response.setContentType("text/html");
        // 得到输出流
        PrintWriter pw = response.getWriter();
        // 获取请求协议
        pw.print(request.getScheme() + "<br />");
        // 获取服务器名
        pw.print(request.getServerName() + "<br />");
        // 获取端口号
        pw.write(request.getServerPort() + "<br>");
        // 获取项目名称
        pw.write(request.getContextPath() + "<br>");
        // 获取 Servlet 路径
        pw.write(request.getServletPath() + "<br>");
        // 获取参数
        pw.write(request.getQueryString() + "<br>");
        // 获取讲求 URI， 即 项目名 + Servlet 路径
        pw.write(request.getRequestURI() + "<br>");
        // 获取请求 URL
        pw.write(String.valueOf(request.getRequestURL()));
    }
}
