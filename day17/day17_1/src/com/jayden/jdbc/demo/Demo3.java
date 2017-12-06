package com.jayden.jdbc.demo;

import com.jayden.utils.JdbcUtils;
import org.junit.Test;

import java.io.IOException;
import java.sql.*;

/**
 * SQL 攻击
 */
public class Demo3 {
    private boolean login(String username, String password) throws Exception {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            String driverClassName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://172.16.17.71:3306/mydb1";
            String name = "Jayden";
            String pwd = "464099Ya%";
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url, name, pwd);

            statement = connection.createStatement();
            String sql = "SELECT * FROM usr WHERE username = '" + username  + "'AND password = '" + password +"'";
            rs = statement.executeQuery(sql);
            return rs.next();
        } catch (Exception e){
            throw new RuntimeException(e);
        } finally {
            if (rs != null) rs.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
    }


    private boolean login2(String username, String password) throws Exception {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String driverClassName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://172.16.17.71:3306/mydb1";
            String name = "Jayden";
            String pwd = "464099Ya%";
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url, name, pwd);

            String sql = "SELECT * FROM usr WHERE username=? and password=?";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            rs = pstmt.executeQuery();
            return rs.next();
        } catch (Exception e){
            throw new RuntimeException(e);
        } finally {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (connection != null) connection.close();
        }
    }

    @Test
    public void test() throws Exception {
        // 正常登录查询
        System.out.println(login2("Wangwu", "123456"));
        // SQL 攻击
        System.out.println(login2("a' or 'a'='a", "a' or 'a'='a"));
    }

    @Test
    public void test2() throws SQLException {
        System.out.println(JdbcUtils.getConnection());
    }
}
