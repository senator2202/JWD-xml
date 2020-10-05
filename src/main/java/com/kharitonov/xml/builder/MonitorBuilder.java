package com.kharitonov.xml.builder;

import com.kharitonov.xml.entity.ConnectionInterface;
import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.entity.Matrix;
import com.kharitonov.xml.entity.Monitor;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MonitorBuilder extends DeviceBuilder {
    public MonitorBuilder() {
        device = new Monitor();
    }

    @Override
    public Device build(Element element) {
        buildParent(element);
        String resolution = element.getAttribute(TagName.RESOLUTION);
        String diagonal = element.getElementsByTagName(TagName.DIAGONAL).item(FIRST_INDEX).getTextContent();
        String matrix = element.getElementsByTagName(TagName.MATRIX).item(FIRST_INDEX).getTextContent();
        String curved = element.getElementsByTagName(TagName.CURVED).item(FIRST_INDEX).getTextContent();
        NodeList connections = element.getElementsByTagName(TagName.CONNECTION);
        for (int i = 0; i < connections.getLength(); i++) {
            Node node = connections.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                String connection = node.getTextContent().toUpperCase();
                ((Monitor)device).addConnection(ConnectionInterface.valueOf(connection));
            }
        }
        ((Monitor)device).setResolution(resolution);
        ((Monitor)device).setDiagonal(Double.parseDouble(diagonal));
        ((Monitor)device).setMatrix(Matrix.valueOf(matrix));
        ((Monitor)device).setCurved(Boolean.parseBoolean(curved));
        return device;
    }
}
