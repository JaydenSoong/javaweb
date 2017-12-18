package com.jayden.day18.dbcp;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Demo1 {
    public Connection getConnection() throws SQLException {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb1");
        dataSource.setUsername("root");
        dataSource.setPassword("464099ya%");
        return dataSource.getConnection();
//        Connection conn = dataSource.getConnection();
//        System.out.println(conn.getClass().getName());
    }
}
