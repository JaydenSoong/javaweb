package com.jayden.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 获取公共配置测试
 * @Author: Jayden
 * @Date 2017/11/14 10:14
 */
@WebServlet(name = "CServlet", urlPatterns = {"/CServlet"})
public class CServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 取得 ServletContext
        ServletContext application = this.getServletContext();
        // 通过 getInitParameter() 得到公共配置的值
        System.out.println(application.getInitParameter("context_name"));

    }
}
