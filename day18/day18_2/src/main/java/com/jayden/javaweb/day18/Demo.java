package com.jayden.javaweb.day18;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * c3p0 连接池的使用
 */
class Demo {
    Connection getConnection() throws PropertyVetoException, SQLException {
        // 创建连接池对象
        ComboPooledDataSource ds = new ComboPooledDataSource();
        // 配置连接数据的四大参数
        ds.setDriverClass("com.mysql.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/mydb1");
        ds.setUser("root");
        ds.setPassword("464099ya%");

        return ds.getConnection();
    }
}
