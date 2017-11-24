package com.jayden.dom4jtest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.util.List;

class Foo {
    private Document getDocument() throws DocumentException {
        // 得到 SAXReader
        SAXReader reader = new SAXReader();
        // 返回 Document
        return reader.read("xml/user.xml");
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
}
