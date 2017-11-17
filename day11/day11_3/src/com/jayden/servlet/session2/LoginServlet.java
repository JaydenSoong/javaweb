package com.jayden.servlet.session2;

import com.jayden.user.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 处理中文问题
        request.setCharacterEncoding("utf-8");
        // 通过获取表单参数创建用户
        User user = new User(request.getParameter("username"), request.getParameter("password"));

        // 判断逻辑
        if (user.getUsername().equals("Jay") && user.getPassword().equals("123456")) {
            // 验证通过，将参数保存到 Session 中
            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            // 重定向到登录成功页面
            response.setHeader("Location", "/day11_3/login/succ1.jsp");
            response.setStatus(302);
        } else {
            // 验证失败，将错误信息保存到 request 域中，请求转发到登录页面
            request.setAttribute("succed", "用户名或密码错误");
            request.getRequestDispatcher("/login/login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
