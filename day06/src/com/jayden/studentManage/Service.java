package com.jayden.studentManage;

import com.jayden.domain.Student;
import com.jayden.util.Dom4jUtils;
import org.dom4j.Document;
import org.dom4j.Element;

public class Service {

    public static void addStudent(Student student){
        // 得到 document
        Document document = Dom4jUtils.getDocument("xml/student.xml");
        // 得到根节点
        Element root = document.getRootElement();

        // 添加学生逻辑
        Element stu = root.addElement("stu");
        Element id = stu.addElement("id");
        id.addText(String.valueOf(student.getId()));
        Element name = stu.addElement("name");
        name.addText(student.getName());
        Element age = stu.addElement("age");
        age.addText(String.valueOf(student.getAge()));
        Element sex = stu.addElement("sex");
        sex.addText(student.getSex());

        // 回写
        Dom4jUtils.xmlWriters("xml/student.xml", document);
    }
}
