package com.jayden.service;

import com.jayden.dao.UserDao;
import com.jayden.domain.User;

/**
 * 处理用户业务
 * @Author: Jayden
 * @Date 2017/11/23 9:59
 */
public class UserService {
    // 依赖 UserDao
    private UserDao userDao = new UserDao();
    public User find() {
        return userDao.userFind();
    }
}
