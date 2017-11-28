# DDL
## 数据库
1. 查看所有数据库 SHOW DATABASES;
2. 创建数据库 CREATE DATABASE [IF NOT EXISTS] mydb [CHARSET=utf8];
3. 删除数据库 DROP DATABASE [IF EXISTS] mydb;
4. 修改数据库编码 ALTER DATABASE mydb CHARACTER SET utf8;
## 数据类型（列类型）
* int: 整型
* double: 浮点型，例如 double(5, 2) 表示最大长度为 5，其中有两位小数
* decimal: 浮点型，在表示钱方法可以使用该类型，因为不会出现精度缺失的问题。
* char: 固定长度字符串类型，最大长度 255, char(255)。数据长度不足指定长度，补足到指定长度。
* varchar: 可变长度字符串类型，最大长度 65535，varchar(65535)
* text(clob): 字符串类型，可细分为：
    * 很小
    * 小
    * 中
    * 大
* blob: 字节类型，也可细分为：
    * 很小
    * 小
    * 中
    * 大
* date: 日期类型，格式为：yyyy-mm-dd
* time: 时间类型，格式为：hh:mm:ss
* timestamp: 时间戳类型
## 表
* 创建表
    ```
    CREATE TABLE [IF NOT EXISTS] 表名 (
        列名 列类型，
        列名 列类型，
        ...
        列名 列类型
    );
    ```
* 查看当前数据库中所有表名称 SHOW TABLES;
* 查看指定表的创建语句 SHOW CREATE TABLE 表名;
* 查看表结构 DESC 表名;
* 删除表 DROP TABLE 表名;
* 修改表 前缀 ALTER TABLE 表名
    * 修改之添加列 
        ```
        ALTER TABLE 表名 ADD (
            列名 列类型,
            列名 列类型，
            ...
            列名 列类型
        );
        ```
    * 修改之修改列类型（如果被修改的列已经存在数据，那么新的类型可能影响到已经存在的数据） ALTER TABLE 表名 MODIFY 列名 列类型;
    * 修改之修改列名 ALTER TABLE 表名 CHANGE 列名 新列名 列类型；
    * 修改之删除列 ALTER TABLE 表名 DROP 列名;
    * 修改表名称 ALTER TABLE 表名 RENAME TO 新表名;