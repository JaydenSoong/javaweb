package com.jayden.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

/**
 * 演示获取请求参数
 * @Author: Jayden
 * @Date 2017/11/15 16:36
 */
@javax.servlet.annotation.WebServlet(name = "AServlet", urlPatterns = {"/AServlet"})
public class AServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        // 获取单值参数的值
        pw.print(request.getParameter("username") + "<br>");
        pw.print(request.getParameter("password") + "<br>");
        pw.print("---------------------<br>");
        // 获取多值参数的值
        pw.print(Arrays.toString(request.getParameterValues("hobby")));
        pw.print("<br>---------------------<br>");
        // 获取所有参数名称
        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()){
            pw.print(names.nextElement() + "<br>");
        }
        pw.print("---------------------<br>");
        // 获取参数名称和值组成的 Map 集合
        Map<String, String[]> map = request.getParameterMap();
        for (String name : map.keySet()){
            pw.print(name + " = " + Arrays.toString(map.get(name)) + "<br>");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        // 获取单值参数的值
        pw.print(request.getParameter("username") + "<br>");
        pw.print(request.getParameter("password"));
    }
}
