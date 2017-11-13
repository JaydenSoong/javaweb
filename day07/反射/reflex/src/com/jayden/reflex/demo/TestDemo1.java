package com.jayden.reflex.demo;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 得到 Class 的三种方式

        // 类名.class
        Class clazz1 = User.class;
        // 对象.getClass()
        Class clazz2 = new User().getClass();
        // 静态方法 forName()
        Class clazz3 = Class.forName("com.jayden.reflex.demo.User");
    }

    /**
     *  操作无参构造方法
     */
    @Test
    public void test1() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 1. 得到 Class
        Class c1 = Class.forName("com.jayden.reflex.demo.User");
        // 2. 操作无参构造方法，创建实例
        //User user = (User)c1.newInstance();
        Constructor cs = c1.getConstructor();
        User user = (User)cs.newInstance();
        // 3. 验证是否创建成功
        user.setId(10086);
        System.out.println(user.getId());
    }

    /**
     * 操作有参构造方法
     */
    @Test
    public void test2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c2 = Class.forName("com.jayden.reflex.demo.User");
        // 获取构造器
        Constructor cs = c2.getConstructor(String.class, int.class);
        // 验证
        User user = (User) cs.newInstance("jayden", 10001);
        System.out.println(user.getName() + "----" + user.getId());
    }

    /**
     * 操作属性
     */
    @Test
    public void test3() {
        try {
            Class c3 = Class.forName("com.jayden.reflex.demo.User");
            Constructor cs = c3.getConstructor();
            User user = (User) cs.newInstance();
            // 通过名称得到属性。这里有两个方法。getDeclaredField() 和 getField() 前者可以得到所有属性。后者只能得到 public 修饰的属性。
            Field field1 = c3.getDeclaredField("name");
//            Field field1 = c3.getField("name");
            field1.setAccessible(true);
            field1.set(user, "Jayden");
            System.out.println(field1.get(user));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
