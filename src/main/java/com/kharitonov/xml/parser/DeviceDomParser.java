package com.kharitonov.xml.parser;

import com.kharitonov.xml.builder.DeviceBuilder;
import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.exception.DeviceParseException;
import com.kharitonov.xml.util.BuilderProvider;
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
import java.util.ArrayList;
import java.util.List;

public class DeviceDomParser {
    public List<Device> parse(String fileName) throws DeviceParseException {
        List<Device> devices = new ArrayList<>();
        Document document;
        try {
            document = read(fileName);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new DeviceParseException(e);
        }
        Element root = document.getDocumentElement();
        NodeList nodeList = root.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String tag = element.getTagName();
                DeviceBuilder builder = BuilderProvider.provide(tag);
                Device device = builder.build(element);
                devices.add(device);
            }
        }
        return devices;
    }

    private Document read(String fileName) throws ParserConfigurationException, IOException, SAXException {
        File fXmlFile = new File(fileName);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        return dBuilder.parse(fXmlFile);
    }
}
