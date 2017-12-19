package com.jayden.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 自定义 JdbcUtils
 */
public class JdbcUtils {
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();

    /**
     * 使用 c3p0 返回连接对象
     * @return 连接对象
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * @return 返回连接池对象
     */
    public static DataSource getDataSource(){
        return dataSource;
    }
}
