package com.jayden.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 5 秒后，浏览器重定向到这里来
 * @Author Jayden
 * @Date 2017/11/14 22:37
 */
@WebServlet(name = "DServlet", urlPatterns = {"/DServlet"})
public class DServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("It's DServlet");
    }
}
