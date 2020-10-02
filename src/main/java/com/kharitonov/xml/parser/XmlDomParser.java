package com.kharitonov.xml.parser;

import com.kharitonov.xml.analyzer.DeviceStoreXmlAnalyzer;
import com.kharitonov.xml.exception.ProjectXmlParserException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlDomParser {
    public void parse(String fileName) throws ProjectXmlParserException {
        File fXmlFile = new File(fileName);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(fXmlFile);
            Element root = document.getDocumentElement();
            DeviceStoreXmlAnalyzer analyzer = new DeviceStoreXmlAnalyzer();
            analyzer.analyze(root);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new ProjectXmlParserException(e);
        }
    }
}
