package com.jayden.servlet.session1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 向 Session 中保存数据
 * @Author: Jayden
 * @Date 2017/11/17 9:08
 */
@WebServlet(name = "AServlet", urlPatterns = {"/AServlet"})
public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取 HttpSession 对象
        HttpSession session = request.getSession();
        // 设置 HttpSession 域
        session.setAttribute("aaa", "AAA");
        session.setAttribute("bbb", "BBB");
    }
}
