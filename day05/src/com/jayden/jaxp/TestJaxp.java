package com.jayden.jaxp;

import org.junit.jupiter.api.Test;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;

class TestJaxp {
    /**
     * 查出所有指定名称的标签
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    @Test
    void findByTagName() throws ParserConfigurationException, IOException, SAXException {
        // 得到 Document
        Document document = getDocument();
        // 获取名为 name 的标签元素
        NodeList nodeList = document.getElementsByTagName("name");
        // 遍历该 NodeList：通过 getLength() 获取 NodeList 的长度，
        // 通过 item(index) 获取 index 位置上的元素，通过 getTextContent() 获取某个 Node 的文本内容
        for (int i = 0, length = nodeList.getLength(); i < length; i++) {
            Node node = nodeList.item(i);
            System.out.println(node.getTextContent());
        }
    }

    /**
     * 查出第一个指定名称的标签
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    @Test
    void findFirstByTagName() throws ParserConfigurationException, IOException, SAXException {
        // 得到 Document
        Document document = getDocument();
        // 得到第一个指定名称的标签
        Node node = document.getElementsByTagName("name").item(0);
        System.out.println(node.getTextContent());

    }

    private Document getDocument() throws ParserConfigurationException, SAXException, IOException {
        // 创建解析器工厂
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // 创建解析器
        DocumentBuilder builder = factory.newDocumentBuilder();
        // 解析 xml 文件
        return builder.parse("xml/user.xml");
    }

    /**
     * 添加元素
     * @throws IOException
     * @throws SAXException
     * @throws ParserConfigurationException
     */
    @Test
    void addNode() throws IOException, SAXException, ParserConfigurationException, TransformerException {
        // 得到 Document
        Document document = getDocument();
        // 创建节点
        Element element = document.createElement("sex");
        // 创建文本节点
        Text text = document.createTextNode("male");
        // 将文本添加至标签
        element.appendChild(text);
        // 得到第一个 user
        Node node = document.getElementsByTagName("user").item(0);
        // 将创建的标签添加到第一个 user 最后
        node.appendChild(element);

        /* 将内存中的内容回写到文件中 */
        // 得到 TransformerFactory
        TransformerFactory factory = TransformerFactory.newInstance();
        // 得到 Transformer
        Transformer transformer = factory.newTransformer();
        // 回写
        transformer.transform(new DOMSource(document), new StreamResult("xml/user.xml"));

    }
}
