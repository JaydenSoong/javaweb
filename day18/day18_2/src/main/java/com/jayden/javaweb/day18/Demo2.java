package com.jayden.javaweb.day18;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Demo2 {
    public Connection getConnection() throws SQLException {
        return new ComboPooledDataSource().getConnection();
    }
}
