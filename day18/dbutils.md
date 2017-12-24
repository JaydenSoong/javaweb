# QueryRunner
## update 方法
* int update(String sql, Object... params); ---> 可执行增、删、改语句。
* int update(Connection con, String sql, Object... params); ---> 需要调用者提供 Connection, 这说明本方法不再管理 Connection 了。支持事务。
## query 方法
* T query(String sql, ResultSetHandler rsh, Object... params) ---> 可执行查询。
    * 它会先得到 ResultSet 然后调用 rsh 的 handler() 把 rs 转换成需要的类型
* T query(Connection con, String sql, ResultSetHander rsh, Object... params) ---> 支持事务。
## ResultSetHander 接口
* BeanHandler(单行) ---> 构造器需要一个 Class 类型的参数，用来把一行结果转换成指定类型的 JavaBean 对象。
* BeanListHandler(多行) ---> 构造器也需要一个 Class 类型的参数，用来把一行结果转换成一个 JavaBean 对象。多行就成了一个 List 对象。
* MapHandler(单行) ---> 把一行结果转换成一个 Map 对象。
* MapListHandler(多行) ---> 把一行记录转换成一个 Map，多行就是多个 Map，即一个 List<Map>。
* ScalarHandler(单行单列) ---> 通常与 SELECT count(*) from stu 结合使用。结果集是单行单列的。它返回一个 Object 对象。