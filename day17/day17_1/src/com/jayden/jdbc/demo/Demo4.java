package com.jayden.jdbc.demo;

import com.jayden.utils.JdbcUtils;
import org.apache.commons.io.IOUtils;

import javax.sql.rowset.serial.SerialBlob;
import java.io.*;
import java.sql.*;

/**
 * 对大数据（音频、视频、图片）的处理
 */
public class Demo4 {
    private Connection conn = JdbcUtils.getConnection();

    private void saveData(String filename){
        try {
            // SQL 语句
            String sql = "INSERT INTO pic VALUES (?, ?, ?)";
            // 预处理语句
            PreparedStatement pstmt = conn.prepareStatement(sql);
            // 对预处理语句赋值
            pstmt.setInt(1, 1);
            pstmt.setString(2, "婚纱照");
            // Blob 是一个接口，SerialBlob 实现了该接口
            pstmt.setBlob(3, new SerialBlob(IOUtils.toByteArray(new FileInputStream(filename))));
            // 执行添加
            pstmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void getData(){
        try {
            // SQL 语句
            String sql = "SELECT pic FROM pic WHERE picname = ?";
            // 预处理语句
            PreparedStatement pstmt = conn.prepareStatement(sql);
            // 对预处理语句赋值
            pstmt.setString(1, "婚纱照");
            // 执行查询
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                // 将查询到的结果赋值给一个 Blob 对象
                Blob blob = rs.getBlob(1);
                // 通过 Blob 对象得到输入流
                InputStream in = blob.getBinaryStream();
                // 创建输出流
                OutputStream out = new FileOutputStream("D:/hxx.jpg");
                // 借助工具类，完成输入流与输出流之间的复制
                IOUtils.copy(in, out);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
