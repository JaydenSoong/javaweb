package com.jayden.servlet;

import javax.servlet.ServletContext;
import java.io.IOException;

/**
 * 演示向 ServletContext 中保存数据
 * @Author Jayden
 * @Date 2017/11/13 23:07
 */
public class AServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        /*
         * 1. 获取 ServletContext 对象
         * 2. 调用其 getAttribute() 方法完成数据保存
         */
        ServletContext application = this.getServletContext();
        application.setAttribute("name", "Jayden");
    }
}
