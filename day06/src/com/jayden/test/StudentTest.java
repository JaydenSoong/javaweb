package com.jayden.test;

import com.jayden.domain.Student;

import com.jayden.studentManage.Service;
import org.junit.jupiter.api.Test;

class StudentTest {

    private Student student = new Student();

    @Test
    void test(){
        student.setAge(20);
        student.setId(1003);
        student.setName("王五");
        student.setSex("男");
        Service.addStudent(student);
    }


}
