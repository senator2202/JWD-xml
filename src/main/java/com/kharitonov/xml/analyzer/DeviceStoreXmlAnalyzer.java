package com.kharitonov.xml.analyzer;

import com.kharitonov.xml.entity.generated.Device;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class DeviceStoreXmlAnalyzer {
    public void analyze(Element root) {
        List<Device> devices = new ArrayList<>();
        NodeList nodeList = root.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                int a = 1;
            }
        }
    }
}
