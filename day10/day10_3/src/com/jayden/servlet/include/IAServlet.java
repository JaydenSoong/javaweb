package com.jayden.servlet.include;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示请求包含。请求包含是相当于两个 Servlet 共同完成一个任务。所以请求者请求头和请求体都会被保留。
 * @Author Jayden
 * @Date 2017/11/15 22:21
 */
@WebServlet(name = "IAServlet", urlPatterns = {"/IAServlet"})
public class IAServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("IAServlet...........");
        // 设置响应头
        response.setHeader("aaa", "AAAA");
        // 设置响应体（最终不会被保留）
        response.getWriter().print("Hello, ");

        // 请求转发过程。先得到请求转发对象，再转发
        RequestDispatcher rd = request.getRequestDispatcher("/IBServlet");
        rd.forward(request, response);
    }
}
