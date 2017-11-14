package com.jayden.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 通过 Servlet 禁用缓存
 * @Author Jayden
 * @Date 2017/11/14 22:51
 */
@WebServlet(name = "FServlet", urlPatterns = {"/FServlet"})
public class FServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 禁用缓存，下面三条都加上
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("pragma", "no-cache");
        response.setDateHeader("expires", -1);
    }
}
