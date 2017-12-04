package com.jayden.jdbc.demo;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Demo1 {
    @Test
    void connect() throws ClassNotFoundException, SQLException {
        // 之前要先导包
        // 加载类
        Class.forName("com.mysql.jdbc.Driver");
        // 配置参数
        String url = "jdbc:mysql://localhost:3306/mydb1";
        String name = "root";
        String pwd = "464099ya%";

        // 获取连接对象
        Connection connection = DriverManager.getConnection(url, name, pwd);
        System.out.println(connection);
    }

}
