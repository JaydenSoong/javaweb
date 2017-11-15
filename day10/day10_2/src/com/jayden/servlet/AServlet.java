package com.jayden.servlet;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "AServlet", urlPatterns = {"/AServlet"})
public class AServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    /**
     * 演示响应字节数据
     * @Author: Jayden
     * @Date 2017/11/15 10:01
     */
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String path = "F:/gy.jpg";
        FileInputStream in = new FileInputStream(path);
        byte[] bytes = IOUtils.toByteArray(in);
        response.getOutputStream().write(bytes);
    }
}
