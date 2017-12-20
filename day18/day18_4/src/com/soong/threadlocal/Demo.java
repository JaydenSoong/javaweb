package com.soong.threadlocal;

import org.junit.Test;

public class Demo {
    @Test
    public void threadLocalTest(){
        ThreadLocal<String> tl = new ThreadLocal<>();
        tl.set("Hello");
        System.out.println(tl.get());
        new Thread(() -> System.out.println("内部类" + tl.get())).start();
    }
}
