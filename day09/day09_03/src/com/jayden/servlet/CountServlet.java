package com.jayden.servlet;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 统计访问量
 * @Author: Jayden
 * @Date 2017/11/14 14:41
 */
@javax.servlet.annotation.WebServlet(name = "CountServlet", urlPatterns = {"/CountServlet"})
public class CountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        /*
         * 1. 获取 ServletContext 对象。
         * 2. 从 ServletContext 对象中获取名为 “count” 的属性
         * 3. 如果存在，给访问量加 1，然后再保存回去
         * 4. 如果不存在，说明是第一次访问，向 ServletContext 中保存名为 “count” 的属性，值为 1。
         */
        ServletContext app = this.getServletContext();
        Integer count = (Integer) app.getAttribute("count");
        app.setAttribute("count", count);
        if(count == null) {
            app.setAttribute("count", 1);
        } else {
            app.setAttribute("count", count+1);
        }

        /*
         * 向浏览器输出，需要使用响应对象。
         */
        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();
//        pw.write(count);
        pw.print("<h1>本网站一共被访问了 " + count + " 次</h1>");
    }
}
