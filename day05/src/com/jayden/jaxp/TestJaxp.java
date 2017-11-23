package com.jayden.jaxp;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

class TestJaxp {
    @Test
    void findByTagName() throws ParserConfigurationException, IOException, SAXException {
        // 创建解析器工厂
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // 创建解析器
        DocumentBuilder builder = factory.newDocumentBuilder();
        // 解析 xml 文件
        Document document = builder.parse("xml/user.xml");
        // 获取名为 name 的标签元素
        NodeList nodeList = document.getElementsByTagName("name");
        // 遍历该 NodeList：通过 getLength() 获取 NodeList 的长度，
        // 通过 item(index) 获取 index 位置上的元素，通过 getTextContent() 获取某个 Node 的文本内容
        for (int i = 0, length = nodeList.getLength(); i < length; i++) {
            Node node = nodeList.item(i);
            System.out.println(node.getTextContent());
        }
    }
}
