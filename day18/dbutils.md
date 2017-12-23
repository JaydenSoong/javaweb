# QueryRunner
## update 方法
* int update(String sql, Object... params); ---> 可执行增、删、改语句。
* int update(Connection con, String sql, Object... params); ---> 需要调用者提供 Connection, 这说明本方法不再管理 Connection 了。支持事务。