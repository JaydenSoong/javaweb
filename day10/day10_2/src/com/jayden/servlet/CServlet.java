package com.jayden.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求相关
 * @Author: Jayden
 * @Date 2017/11/15 10:57
 */
@WebServlet(name = "CServlet", urlPatterns = {"/CServlet"})
public class CServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取浏览器的 IP 地址
        String ip = request.getRemoteAddr();
        System.out.println(ip);

        // 获取浏览器相关信息
        String user = request.getHeader("User-Agent");
        System.out.println(user);

        // 获取主机
        String host = request.getHeader("Host");
        System.out.println(host);

        // 防盗链，非本机发出的请求，则响应 404。Referer 这个请求头表示请求的来源。
        String referer = request.getHeader("Referer");


        if (referer == null || !referer.contains("localhost") ) {
//           response.setStatus(404);
            response.sendError(404, "请通过本机链接请求数据");
        } else {
            response.getWriter().write("Welcome back!");
        }
    }
}
