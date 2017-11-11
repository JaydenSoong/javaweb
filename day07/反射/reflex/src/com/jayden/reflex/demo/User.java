package com.jayden.reflex.demo;

public class User {
    // 成员变量
    private String name;
    private int id;

    // 空参构造器
    public User() {
    }

    // 带参构造器
    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // 普通方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
