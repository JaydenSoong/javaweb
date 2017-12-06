package com.jayden.jdbc.demo;

import org.junit.Test;

import java.sql.*;

public class Demo2 {

    /**
     * 增、删、改操作
     */
    @Test
    public void test() throws ClassNotFoundException, SQLException {
        /*
         * 一、创建连接对象
         *     1. 准备四大参数 Driver, url, name, password
         *     2. 得到连接对象
         */
        String driverClass = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://172.16.17.71:3306/mydb1";
        String name = "Jayden";
        String password = "464099Ya%";

        Class.forName(driverClass);
        Connection connection = DriverManager.getConnection(url, name, password);

        /*
         * 二、操作表
         *     1. 创建 Statement 对象
         *     2. 执行操作
         */
        Statement statement = connection.createStatement();
        // 增
        //String sql = "INSERT INTO stu VALUES (1002, '李四', 20, 'female')";
        // 改
        //String sql = "UPDATE stu SET sage=21 WHERE sid=1002";
        // 删
        String sql = "DELETE FROM stu";
        int i = statement.executeUpdate(sql);
        System.out.println(i);

        // 关闭资源
        statement.close();
        connection.close();
    }

    @Test
    public void test1() throws ClassNotFoundException, SQLException {
        // 准备四大参数
        String classDriver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://172.16.17.71:3306/mydb1";
        String name = "Jayden";
        String pwd = "464099Ya%";

        // 加载类
        Class.forName(classDriver);
        // 建立连接
        Connection connection = DriverManager.getConnection(url, name, pwd);

        // 创建 Statement
        Statement statement = connection.createStatement();
        // 执行查询，返回结果集
        ResultSet rs = statement.executeQuery("SELECT * FROM emp");
        // 解析结果集

        while (rs.next()) {
            System.out.println(rs.getBigDecimal("empno") + " " + rs.getString("ename") + " " + rs.getBigDecimal("sal"));
        }

        // 关闭资源
        rs.close();
        statement.close();
        connection.close();
    }

    /**
     * JDBC 标准化格式
     */
    @Test
    public void test3() throws Exception{
        Connection conn = null;
        Statement statement = null;
        ResultSet set = null;
        try {
            // 得到 Connection
            String classDriverName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://172.16.17.71:3306/mydb1";
            String name = "Jayden";
            String pwd = "464099Ya%";

            Class.forName(classDriverName);
            conn = DriverManager.getConnection(url, name, pwd);

            statement = conn.createStatement();
            set = statement.executeQuery("SELECT * FROM emp");

            // 先获取到元数据，再获取到列数
            int count = set.getMetaData().getColumnCount();
            while (set.next()) {
                for (int i=1; i<= count; i++){
                    // 除了 getObject()， getString() 也具有通用性，基本所有数据都可以 toString
                    System.out.print(set.getString(i));
                    if (i < count){
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        } finally {
            if (set != null) set.close();
            if (statement != null) statement.close();
            if (conn != null) conn.close();
        }
    }

}
