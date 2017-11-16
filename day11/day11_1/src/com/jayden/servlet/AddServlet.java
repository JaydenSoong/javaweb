package com.jayden.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 本 Servlet 作加法处理
 * @Author: Jayden
 * @Date 2017/11/16 11:47
 */
@WebServlet(name = "AddServlet", urlPatterns = {"/AddServlet"})
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取 JSP 提交的参数
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");

        // 加法逻辑
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);

        // 将相加得到的值保存到 request 域中。
        request.setAttribute("result", sum);

        // 请求转发，让 result.jsp 页面来显示结果 数据
        request.getRequestDispatcher("/add/result.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
