package com.jayden.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * JdbcUtils version 1.0
 */
public class JdbcUtils {
    private static Properties prop = null;
    // 对 properties 初始化和加载类驱动器都只需要进行一次。所以将其放在静态代码块中。
    static {
        // 对 properties 对象进行初始化。
        try {
            // 得到 properties 对象。
            prop = new Properties();
            InputStream in = new FileInputStream("src/dbconfig.properties");
            prop.load(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 加载类驱动器
        try {
            Class.forName(prop.getProperty("driverClassName"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @return 返回得到得 Connection 对象。
     * @throws SQLException ,SQL 异常
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("name"), prop.getProperty("pwd"));
    }
}
