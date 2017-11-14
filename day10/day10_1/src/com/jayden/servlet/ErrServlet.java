package com.jayden.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 发送状态码
 * @Author Jayden
 * @Date 2017/11/14 21:22
 */
@WebServlet(name = "ErrServlet", urlPatterns = {"/ErrServlet"})
public class ErrServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 发送带消息的错误码
        response.sendError(404, "您访问的资源不存在，您敢再访问一次吗？");
        // 2. 发送不带消息的错误码
        // response.sendError(405);
        // 3. 设置状态码
        // response.setStatus(204);
    }
}
