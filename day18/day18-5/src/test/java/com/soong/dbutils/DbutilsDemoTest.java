package com.soong.dbutils;

import com.soong.dbutils.demo.DbutilsDemo;
import com.soong.dbutils.demo.MyDbutilsDemo;
import com.soong.dbutils.domain.Stu;
import org.junit.Test;

import java.sql.SQLException;

public class DbutilsDemoTest {
    @Test
    public void test() throws SQLException {
//        new MyDbutilsDemo().addStu(new Stu(12, "Lisi", 20, "female"));
        System.out.println(new MyDbutilsDemo().load(12));
    }
}
