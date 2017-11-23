package com.jayden.domain;

/**
 * 把从数据库中查询到的结果保存到本类对象中。
 * @Author: Jayden
 * @Date 2017/11/23 9:54
 */
public class User {
    private String username;
    private int password;

    public User(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
