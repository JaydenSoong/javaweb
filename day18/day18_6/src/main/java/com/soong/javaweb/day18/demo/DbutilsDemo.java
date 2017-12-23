package com.soong.javaweb.day18.demo;

import com.soong.javaweb.day18.domain.Stu;
import com.soong.javaweb.day18.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DbutilsDemo {
    public void addStu(Stu stu) throws SQLException {
        QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "INSERT INTO stu VALUES(?,?,?,?)";
        Object[] params = {stu.getSid(), stu.getSname(), stu.getAge(), stu.getGender()};
        qr.update(sql, params);
    }

    public Stu findStu(int sid) throws SQLException {
        QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "SELECT * FROM stu WHERE sid = ?";
        Object[] params = {sid};
        return qr.query(sql, new BeanHandler<Stu>(Stu.class), params);
    }

    public List<Stu> findStu() throws SQLException {
        QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "SELECT * FROM stu";
        return qr.query(sql, new BeanListHandler<Stu>(Stu.class));
    }

    public Map<String, Object> findStu2Map(int sid) throws SQLException {
        QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "SELECT * FROM stu WHERE sid = ?";
        Object[] params = {sid};
        return qr.query(sql, new MapHandler(), params);
    }

    public List<Map<String,Object>> findStu2List() throws SQLException {
        QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
        String sql = "SELECT * FROM stu";
        return qr.query(sql, new MapListHandler());
    }
}
