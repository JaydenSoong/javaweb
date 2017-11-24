package com.jayden.dom4jtest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

class Foo {
    private Document getDocument() throws DocumentException {
        // 得到 SAXReader
        SAXReader reader = new SAXReader();
        // 返回 Document
        return reader.read("xml/user.xml");
    }

    /**
     * 回写方法
     */
    private void xmlWriter(Document document) throws IOException {
        // 回写，第一个参数：要回写到哪里，第二个参数：带格式（给缩进）
        XMLWriter writer = new XMLWriter(new FileOutputStream("xml/user.xml"), OutputFormat.createPrettyPrint());
        writer.write(document);
        // 关流
        writer.close();
    }
    /**
     * 得到所有 name 标签的值
     */
   @Test
   void getNodeText() throws DocumentException {
       // 得到 Document
       Document document = getDocument();
       // 得到 Document 的根元素
       Element root = document.getRootElement();
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
    void getFirstNodeText() throws DocumentException {
        // 得到 Document
        Document document = getDocument();
        // 得到根元素
        Element root = document.getRootElement();
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
    void getSecondNodeText() throws DocumentException {
        // 得到 Document
        Document document = getDocument();
        // 得到根元素
        Element root = document.getRootElement();
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
    void addSex() throws DocumentException, IOException {
        // 得到 Document
        Document document = getDocument();
        // 得到根元素
        Element root = document.getRootElement();
        // 得到第一个 user
        Element user1 = root.element("user");
        // 在末尾添加节点
        Element sex = user1.addElement("sex");
        // 往节点中添加文本节点
        sex.addText("male");
        // 回写
        xmlWriter(document);
    }



    /**
     * 在特定位置添加元素，比如在 password 后面添加 email
     */
    @Test
    void addEmail() throws DocumentException, IOException {
        Document document = getDocument();
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
        xmlWriter(document);
    }
}
