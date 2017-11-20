package com.jayden.domain;

/**
 * JavaBean
 * 1. 必须提供 get/set 方法
 * 2. 必须提供默认构造器（无参构造器）
 * 3. 一般具有 set/get 方法的成员称为属性。
 * 4. 其实一个属性也可以没有成员变量。只有 get/set 方法。
 *    属性的名称是由 get/set 方法去除 get/set 后，再把首字母小写。
 * @Author Jayden
 * @Date 2017/11/20 21:42
 */
public class Person {
    private String name;
    private int age;
    private String gender;

    public boolean isHuman() {
        return human;
    }

    public void setHuman(boolean human) {
        this.human = human;
    }

    // boolean 类型的属性
    private boolean human;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", human=" + human +
                '}';
    }
}
