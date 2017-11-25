package com.jayden.test;

import com.jayden.domain.Student;

import com.jayden.studentManage.Service;
import org.junit.jupiter.api.Test;

class StudentTest {
    @Test
    void addTest(){
        Student student = new Student();
        student.setAge(20);
        student.setId(1003);
        student.setName("王五");
        student.setSex("男");
        Service.addStudent(student);
    }

    @Test
    void removeTest(){
        Service.removeStudent(1003);
    }

    @Test
    void findTest(){
        System.out.println(Service.findStudent(1004));
    }
}
