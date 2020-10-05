package com.kharitonov.xml.analyzer;

import com.kharitonov.xml.entity.generated.Keyboard;
import com.kharitonov.xml.entity.generated.Monitor;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MonitorXmlAnalyzer extends DeviceXmlAnalyzer {
    @Override
    public void add(Element root) {
       /* NodeList nodeList = root.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                int a = 1;
            }
        }*/

        devices.add(new Monitor());
    }
}
