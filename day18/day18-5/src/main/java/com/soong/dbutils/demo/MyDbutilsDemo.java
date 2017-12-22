package com.soong.dbutils.demo;

import com.soong.dbutils.domain.Stu;
import com.soong.dbutils.mydbutils.QR;
import com.soong.dbutils.Utils.JbUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDbutilsDemo {
    public void addStu(Stu stu) throws SQLException {
        // 创建自定义的 QR 对象
        QR qr = new QR(JbUtils.getDataSource());
        String sql = "INSERT INTO stu VALUES(?, ?, ?, ?)";
        Object[] params = {stu.getSid(), stu.getSname(), stu.getAge(), stu.getGender()};
        // 执行添加操作
        qr.update(sql, params);
    }

    public Stu load(int sid) {
        QR qr = new QR(JbUtils.getDataSource());
        String sql = "SELECT * FROM stu WHERE sid = ?";
        Object[] params = {sid};
        // 实现将结果集转换成对象的接口
        QR.ResHandler<Stu> rh = result -> {
            if (!result.next()) return null;
            Stu stu = new Stu();
            stu.setSid(result.getInt(1));
            stu.setSname(result.getString(2));
            stu.setAge(result.getInt(3));
            stu.setGender(result.getString(4));
            return stu;
        };
        // 执行查询并返回结果
        return (Stu) qr.load(sql, rh, params);
    }
}
