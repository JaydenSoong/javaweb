package com.jayden.javaweb;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.io.IOException;

import static java.lang.System.out;

@javax.servlet.annotation.WebServlet(name = "JNDIServlet", urlPatterns = {"/JNDIServlet"})
public class JNDIServlet extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        try {
            Context cnt = new InitialContext();
            Context env = (Context) cnt.lookup("java:comp/env");
            DataSource dt = (DataSource) env.lookup("day18/connection");
            out.print(dt.getConnection());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
