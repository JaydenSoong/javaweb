package com.jayden.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class JdbcUtilsTest {
    @Test
    public void test() throws SQLException {
        Assert.assertNotNull(JdbcUtils.getConnection());
        Assert.assertNotNull(JdbcUtils.getDataSource());
    }
}
