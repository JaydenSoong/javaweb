package com.jayden.dao;

import com.jayden.domain.User;

/**
 * 把从数据库中查到的数据封装到 User 中
 * @Author: Jayden
 * @Date 2017/11/23 9:57
 */
public class UserDao {
    public User userFind(){
        return new User("张三", 123456);
    }
}
