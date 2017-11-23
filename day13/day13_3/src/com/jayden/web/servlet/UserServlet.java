package com.jayden.web.servlet;

import com.jayden.domain.User;
import com.jayden.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 依赖 UserService
        UserService userService = new UserService();
        User user = userService.find();

        // 将查询结果保存起来
        request.setAttribute("user", user);

        // 请求转发
        request.getRequestDispatcher("/show.jsp").forward(request, response);
    }
}
