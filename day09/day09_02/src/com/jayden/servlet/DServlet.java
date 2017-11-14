package com.jayden.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * ServletContext 获取公共资源（主要是获取路径）
 * @Author: Jayden
 * @Date 2017/11/14 10:59
 */
@WebServlet(name = "DServlet", urlPatterns = {"/DServlet"})
public class DServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取 ServletContext
        ServletContext application = this.getServletContext();
        // 得到真实路径
        System.out.println(application.getRealPath("/index.jsp"));
        // 得到流对象
        InputStream inputStream = application.getResourceAsStream("/index.jsp");
        // 得到目录下的所有文件的路径
        System.out.println(application.getResourcePaths("/WEB-INF"));
    }
}
