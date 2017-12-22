package com.soong.dbutils.demo;

import com.soong.dbutils.domain.Stu;
import org.apache.commons.dbutils.QueryRunner;
import com.soong.dbutils.Utils.JbUtils;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class DbutilsDemo {
    public void addStu(Stu stu) throws SQLException {
        QueryRunner qr = new QueryRunner(JbUtils.getDataSource());
        String sql = "INSERT INTO stu VALUES(?,?,?,?)";
        Object[] params = {stu.getSid(), stu.getSname(), stu.getAge(), stu.getGender()};
        qr.update(sql,params);
    }

    public Stu load(int sid) throws SQLException {
        QueryRunner qr = new QueryRunner(JbUtils.getDataSource());
        String sql = "SELECT * FROM stu WHERE sid = ?";
        Object[] params = {sid};
        return qr.query(sql,  new BeanHandler<Stu>(Stu.class));
    }
}
