# DML（数据操作语言，它是对表记录的操作——增、删、改）
## 1. 插入记录
* INSERT INTO 表名 (列名1，列名2，... 列名n) VALUES (列值1，列值2，... 列值n);
    * 在表名后直接给出要插入的列名，没有给出的列等同插入 NULL。插入记录总是插入一行，没有可能插入半行。 
    * 在 VALUES 后直接给出列值，列值的顺序与前面列名的顺序相同。
        ```
        // 插入所有列
        INSERT INTO tb_stu(
            stu_id, sc_number, stu_name, sex, age
        ) VALUES (
            1001, 'tw_1001', '张三', 'male', 18
        );

        // 插入部分列，没有插入的列，为默认值 NULL
        INSERT INTO tb_stu(
            stu_id, sc_number
        ) VALUES(
            1002, 'tw_1002' 
        );
        ```
* INSERT INTO 表名 VALUES (列值1，列值2，... 列值n)；
    * 没有给出插入的列名，表示插入所有列
    * 值的个数必须与该表列的个数相同。
    * 值的顺序，与创建表时列的顺序相同。
        ```
        INSERT INTO tb_stu VALUES(1003, 'tw_1003', '王五', 'female', 20);
        ```
## 2. 修改记录
* UPDATE 表名 SET 列名1=列值1，列名2=列值2，... [WHERE 条件]
* 条件（条件可选）
    * 条件必须是一个 boolean 类型的值或表达式：
    * 运算符：=、!=、<>、>、<、>=、<=、BETWEEN...AND、IN(...)、IS NULL、NOT、OR、AND
## 3. 删除记录
* DELETE FROM 表名 [WHERE 条件]；（若没有条件，则是删除表里的所有记录）