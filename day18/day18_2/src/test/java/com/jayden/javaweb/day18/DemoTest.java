package com.jayden.javaweb.day18;

import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class DemoTest {
    @Test
    public void demo1Test() throws PropertyVetoException, SQLException {
        Connection conn = new Demo1().getConnection();
        System.out.println(conn);
        conn.close();
    }

    @Test
    public void demo2Test() throws SQLException {
        Connection conn = new Demo2().getConnection();
        System.out.println(conn);
        conn.close();
    }
}
