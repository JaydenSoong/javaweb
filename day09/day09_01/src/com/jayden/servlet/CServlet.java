package com.jayden.servlet;

import javax.servlet.ServletException;

public class CServlet extends BServlet{
    @Override
    public void init() throws ServletException {
        System.out.println("I'm Coming ...");
    }
}
