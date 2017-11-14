package com.jayden.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示重定向
 * 用户请求 AServlet，然后 AServlet 响应 302，给出 Location 头。
 * @Author Jayden
 * @Date 2017/11/14 22:04
 */
@WebServlet(name = "AServlet", urlPatterns = {"/AServlet"})
public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("AServlet");
        // 设置重定向响应头
        response.setHeader("Location", "/BServlet");
        // 设置重定向状态码 302
        response.setStatus(302);
    }
}
