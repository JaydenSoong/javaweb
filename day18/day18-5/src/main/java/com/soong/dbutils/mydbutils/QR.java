package com.soong.dbutils.mydbutils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 模仿 QueryRunner
 */
public class QR<T> {
    private DataSource dataSource;

    /**
     * 空参构造器
     */
    public QR() {
    }

    /**
     * 带参数构造器
     * @param dataSource, 参数，DataSource
     */
    public QR(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 实现增、删、改的方法
     * @param sql, SQL 模板
     * @param params, 模板参数
     * @return 影响行数
     */
    public int update(String sql, Object... params) throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            // 将 sql 中的每个参数初始化。
            initParams(pstmt, params);
            // 影响行数
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (pstmt != null) pstmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 实现查询操作
     * @param sql, SQL 模板
     * @param rh 处理结果集的接口, 接口方法由调用者实现
     * @param params, 模板参数
     * @return 查询结果对象
     */
    public T load(String sql, ResHandler<T> rh, Object... params){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = dataSource.getConnection();
            pstmt = conn.prepareStatement(sql);
            initParams(pstmt, params);
            rs = pstmt.executeQuery();
            // 将结果集处理后返回
            return rh.res2Bean(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 处理结果集的接口，具体由调用者实现
     * @param <T>
     */
    public interface ResHandler<T>{
        public T res2Bean(ResultSet result) throws SQLException;
    }

    /**
     * 初始化模板参数的方法
     * @param pstmt, 预处理语句
     * @param params, 模板参数
     */
    private void initParams(PreparedStatement pstmt, Object[] params) throws SQLException {
        for (int i=0; i<params.length; i++){
            // 参数位置从 1 开始
            pstmt.setObject(i+1, params[i]);
        }
    }
}
