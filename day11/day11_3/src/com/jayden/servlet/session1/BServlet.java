package com.jayden.servlet.session1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 从 Session 中获取数据
 * @Author: Jayden
 * @Date 2017/11/17 9:12
 */
@WebServlet(name = "BServlet", urlPatterns = {"/BServlet"})
public class BServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 得到 HttpSession 对象
        HttpSession session = request.getSession();
        // 获取值
        System.out.println(session.getAttribute("aaa"));
        System.out.println(session.getAttribute("bbb"));
    }
}
