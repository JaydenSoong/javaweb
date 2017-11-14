package com.jayden.servlet;

import java.io.*;

/**
 * 获取类路径下的资源
 * @Author: Jayden
 * @Date 2017/11/14 16:24
 */
@javax.servlet.annotation.WebServlet(name = "AServlet", urlPatterns = {"/AServlet"})
public class AServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // 1. 得到 ClassLoader
//        ClassLoader cl = this.getClass().getClassLoader();
        // 1. 得到 Class
        Class cl = this.getClass();
        // 2. 得到流
        InputStream inputStream = cl.getResourceAsStream("a.txt");
        System.out.println(streamToString(inputStream));
    }

    /**
     * 将流转换成字符串
     * @Author: Jayden
     * @Date 2017/11/14 16:21
     */
    private String streamToString(InputStream inputStream) throws IOException {
        // 得到 Reader 对象
        Reader reader = new BufferedReader(new InputStreamReader(inputStream));
        // 得到 BufferedReader 对象
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        // 创建 StringBuilder 用于存储每次读取的一行
        StringBuilder sb = new StringBuilder();
        try{
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }finally {
            inputStream.close();
        }
        return sb.toString();
    }
}
