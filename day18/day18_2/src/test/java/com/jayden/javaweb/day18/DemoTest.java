package com.jayden.javaweb.day18;

import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class DemoTest {
    @Test
    public void demoTest() throws PropertyVetoException, SQLException {
        Connection conn = new Demo().getConnection();
        System.out.println(conn);
        conn.close();
    }
}
