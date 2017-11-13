package com.jayden.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示从 ServletContext 中读取数据
 * @Author Jayden
 * @Date 2017/11/13 23:10
 */
@WebServlet(name = "BServlet", urlPatterns = {"/BServlet"})
public class BServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         * 1. 获取 ServletContext 对象
         * 2. 调用其 getAttribute() 方法获取数据
         */
        ServletContext application = this.getServletContext();
        System.out.println(application.getAttribute("name"));
    }
}
