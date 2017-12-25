package com.soong.javaweb.day19;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet"})
public class MyServlet extends BaseServlet {


    public String fun1(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("fun1 running...");
        return "r:/index.jsp";
    }

    public String fun2(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("fun2 running...");
        return "f:/index.jsp";
    }

    public String fun3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("fun3 running...");
        return "/index.jsp";
    }
    public String fun4(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("fun4 running...");
        return null;
    }
    public String fun5(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("fun5 running...");
        return "d:/index.jsp";
    }
}


