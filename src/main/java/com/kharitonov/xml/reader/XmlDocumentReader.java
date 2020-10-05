package com.kharitonov.xml.reader;

import com.kharitonov.xml.exception.XmlReaderException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlDocumentReader {
    public Document read(String fileName) throws XmlReaderException {
        File fXmlFile = new File(fileName);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            return dBuilder.parse(fXmlFile);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new XmlReaderException(e);
        }
    }
}
