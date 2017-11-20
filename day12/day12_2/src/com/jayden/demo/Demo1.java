package com.jayden.demo;

import com.jayden.domain.Person;
import com.jayden.utils.CommonUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    @Test
    public void fun1() throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        String classx = "com.jayden.domain.Person";
        Class clazz = Class.forName(classx);
        Object bean = clazz.newInstance();

        BeanUtils.setProperty(bean, "name", "张三");
        BeanUtils.setProperty(bean, "age", 15);
        BeanUtils.setProperty(bean, "gender", "male");
        BeanUtils.setProperty(bean, "human", true);

        System.out.println(bean);

    }

    /**
     * 把 Map 中的一个属性直接封装到一个 bean 中
     * 要求：map 的 key 与 bean 的属性名相同。
     * @Author Jayden
     * @Date 2017/11/21 0:14
     */
    @Test
    public void fun2() throws InvocationTargetException, IllegalAccessException {
        Person bean = new Person();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "李四");
        map.put("age", 65);
        map.put("gender", "female");
        map.put("human", false);

        BeanUtils.populate(bean,map);

        System.out.println(bean);
    }

    /**
     * 使用自定义的工具将 Map 封装到 bean 中。
     * @Author Jayden
     * @Date 2017/11/21 0:38
     */
    @Test
    public void fun3() throws ClassNotFoundException {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "李四");
        map.put("age", 65);
        map.put("gender", "female");
        map.put("human", false);
        System.out.println(CommonUtils.toBean(map, Class.forName("com.jayden.domain.Person")));
    }
}
