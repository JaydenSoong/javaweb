package com.jayden.servlet.forword;

import javax.servlet.RequestDispatcher;
import java.io.IOException;

/**
 * 演示请求转发。请求转发的特点是“留头不留体”，在最终的响应页面不会保留它的响应体
 * 请求转发和请求包含都是一个请求。
 * @Author Jayden
 * @Date 2017/11/15 22:14
 */
@javax.servlet.annotation.WebServlet(name = "FAServlet", urlPatterns = {"/FAServlet"})
public class FAServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("FAServlet...........");
        // 设置响应头
        response.setHeader("aaa", "AAAA");
        // 设置响应体（最终不会被保留）
        response.getWriter().print("hello");

        // 请求转发过程。先得到请求转发对象，再转发
        RequestDispatcher rd = request.getRequestDispatcher("/FBServlet");
        rd.forward(request, response);
    }
}
