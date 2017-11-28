package com.jayden.studentManage;

import com.jayden.domain.Student;
import com.jayden.util.Dom4jUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;

import java.util.List;

public class Service {
    /**
     * 添加学生
     * @param student, 将要添加的学生
     */
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

    /**
     * 删除学生
     * @param id， 删除与给定 id 值相同的学生
     */
    public static void removeStudent(int id) {
        // 得到 document
        Document document = Dom4jUtils.getDocument("xml/student.xml");
        // 使用 xpath 返回所有 id 节点
        List<Node> ids = document.selectNodes("//id");
        // 遍历
        for (Node node : ids){
            // 如果给定 id 的值与遍历到的 id 节点的值相等，删除该 id 代表的学生
            if (String.valueOf(id).equals(node.getText())){
                Element stu = node.getParent();
                Element root = stu.getParent();
                root.remove(stu);
            }
        }
        // 回写
        Dom4jUtils.xmlWriters("xml/student.xml", document);
    }

    public static Student findStudent(int id) {
        // 得到 document
        Document document = Dom4jUtils.getDocument("xml/student.xml");
        // 使用 xpath 返回所有 id 节点
        List<Node> ids = document.selectNodes("//id");
        // 遍历
        for (Node node : ids){
            // 如果给定 id 的值与遍历到的 id 节点的值相等，删除该 id 代表的学生
            if (String.valueOf(id).equals(node.getText())){
                Student student = new Student();
                student.setId(id);
                // 得到该 id 标签的父节点
                Element stu = node.getParent();
                Element name = stu.element("name");
                student.setName(name.getText());
                Element age = stu.element("age");
                student.setAge(Integer.parseInt(age.getText()));
                Element sex = stu.element("sex");
                student.setSex(sex.getText());
                return student;
            }
        }
        return null;
    }
}
