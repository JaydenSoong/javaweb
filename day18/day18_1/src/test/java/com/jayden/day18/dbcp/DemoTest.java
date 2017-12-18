package com.jayden.day18.dbcp;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class DemoTest {
    @Test
    public void demo1Test() throws SQLException {
        System.out.println(new Demo1().getConnection().getClass().getName());
//        Assert.assertNotNull(new Demo1().getConnection());
    }
}
