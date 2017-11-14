package com.jayden.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示 Refresh 定时刷新响应头
 * 定时刷新可理解为定时重定向
 * @Author Jayden
 * @Date 2017/11/14 22:35
 */
@WebServlet(name = "CServlet", urlPatterns = {"/CServlet"})
public class CServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 向浏览器写内容
        response.getWriter().print("Welcome back Jayden! It will go to DServlet 5 seconds later.");
        // 定时刷新响应头
        response.setHeader("Refresh", "5;/DServlet");
    }
}
