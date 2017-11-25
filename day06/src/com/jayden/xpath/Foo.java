package com.jayden.xpath;

import com.jayden.util.Dom4jUtils;
import org.dom4j.Document;
import org.dom4j.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

class Foo {
    /**
     * 获取 user.xml 的所有 name 标签的值
     */
    @Test
    void selectNames(){
        // 得到 user.xml 的 document
        Document document = Dom4jUtils.getDocument("xml/user.xml");
        // 得到所有的 name 标签
        List<Node> nodes = document.selectNodes("//name");
        // 遍历得到每个一标签的文本节点的值
        for (Node node : nodes) {
            System.out.println(node.getText());
        }
    }
    /**
     * 获取 user.xml 的所有 第一个 name 标签的值
     */
    @Test
    void selectFirstNames(){
        // 得到 user.xml 的 document
        Document document = Dom4jUtils.getDocument("xml/user.xml");
        // 得到第一个 name 标签
        Node node = document.selectSingleNode("/users/user[1]/name");
        System.out.println(node.getText());
    }
}
