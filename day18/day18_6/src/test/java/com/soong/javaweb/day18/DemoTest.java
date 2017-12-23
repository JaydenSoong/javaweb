package com.soong.javaweb.day18;

import com.soong.javaweb.day18.demo.DbutilsDemo;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DemoTest {
    @Test
    public void addTest() throws SQLException {
        //new DbutilsDemo().addStu(new Stu(1002, "Lisi", 22, "female"));
    }

    @Test
    public void findTest() throws SQLException {
//        Stu stu = new DbutilsDemo().findStu(1001);
//        System.out.println(stu);

//        List<Stu> list = new DbutilsDemo().findStu();
//        System.out.println(list);

       Map map = new DbutilsDemo().findStu2Map(1002);
       System.out.println(map);
//        List list = new DbutilsDemo().findStu2List();
//        System.out.println(list);
    }
}
