package com.jayden.dom4jtest;

import com.jayden.util.Dom4jUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;

import java.util.List;

class Foo {
    /**
     * 得到所有 name 标签的值
     */
   @Test
   void getNodeText(){
       // 得到 user.xml 的根元素
       Element root = Dom4jUtils.getRoot("xml/user.xml");
       // 得到根元素的所有第一层名为 user 的子元素
       List<Element> list = root.elements("user");
       // 遍历
       for (Element element : list) {
           // 得到 name 标签
           Element element1 = element.element("name");
           System.out.println(element1.getText());
       }
   }

    /**
     * 得到第一个 name 标签的值
     */
    @Test
    void getFirstNodeText(){
        // 得到 user.xml 的根元素
        Element root = Dom4jUtils.getRoot("xml/user.xml");
        // 得到第一个 user
        Element firstUser = root.element("user");
        // 得到第一个 name
        Element firstName = firstUser.element("name");
        // 输出 name 的值
        System.out.println(firstName.getText());
    }

    /**
     * 得到第二个 name 的值
     */
    @Test
    void getSecondNodeText(){
        // 得到 user.xml 的根元素
        Element root = Dom4jUtils.getRoot("xml/user.xml");
        // 得到根元素的所有第一层名为 user 的子元素
        List<Element> list = root.elements("user");
        // 得到第二个 user
        Element secondUser = list.get(1);
        // 得到第二个 name
        Element secondName = secondUser.element("name");
        // 输出 name 的值
        System.out.println(secondName.getText());
    }

    /**
     * 在标签末尾添加节点
     */
    @Test
    void addSex(){
        // 得到 user.xml 的 Document
        Document document = Dom4jUtils.getDocument("xml/user.xml");
        // 得到 user.xml 的根元素
        Element root = document.getRootElement();
        // 得到第一个 user
        Element user1 = root.element("user");
        // 在末尾添加节点
        Element sex = user1.addElement("sex");
        // 往节点中添加文本节点
        sex.addText("male");
        Dom4jUtils.xmlWriters("xml/user.xml", document);
    }

    /**
     * 在特定位置添加元素，比如在 password 后面添加 email
     */
    @Test
    void addEmail(){
        // 得到 user.xml 的 Document
        Document document = Dom4jUtils.getDocument("xml/user.xml");
        // 得到 user.xml 的根元素
        Element root = document.getRootElement();
        Element user1 = root.element("user");
        // 得到 第一个 user 下面的所有元素
        List<Element> elements = user1.elements();
        // 创建节点
        Element email = DocumentHelper.createElement("email");
        email.addText("foo@126.com");
        // 通过 List<E> 的 add(index, element) 方法往特定位置添加节点
        elements.add(2, email);
        // 回写
        Dom4jUtils.xmlWriters("xml/user.xml", document);
    }

    // 将第一个 sex 修改为 female
    @Test
    void modifySex(){
        // 得到 Document
        Document document = Dom4jUtils.getDocument("xml/user.xml");
        // 获取根节点
        Element root = document.getRootElement();
        // 获取第一个 user
        Element user1 = root.element("user");
        // 得到 sex
        Element sex = user1.element("sex");
        // 修改 sex 的内容
        sex.setText("female");
        // 回写
        Dom4jUtils.xmlWriters("xml/user.xml", document);
    }
}
