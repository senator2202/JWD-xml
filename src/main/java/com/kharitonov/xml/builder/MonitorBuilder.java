package com.kharitonov.xml.builder;

import com.kharitonov.xml.entity.ConnectionInterface;
import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.entity.Matrix;
import com.kharitonov.xml.entity.Monitor;
import org.apache.commons.collections4.MultiValuedMap;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Collection;

public class MonitorBuilder extends DeviceBuilder {
    @Override
    public Device build(Element element) {
        device = new Monitor();
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
                ((Monitor) device).addConnection(ConnectionInterface.valueOf(connection));
            }
        }
        ((Monitor) device).setResolution(resolution);
        ((Monitor) device).setDiagonal(Double.parseDouble(diagonal));
        ((Monitor) device).setMatrix(Matrix.valueOf(matrix));
        ((Monitor) device).setCurved(Boolean.parseBoolean(curved));
        return device;
    }

    @Override
    public Device build(MultiValuedMap<String, String> map) {
        device = new Monitor();
        buildParent(map);
        String resolution = map.get(TagName.RESOLUTION).stream().findAny().orElse(BLANK);
        String diagonal = map.get(TagName.DIAGONAL).iterator().next();
        String matrix = map.get(TagName.MATRIX).iterator().next();
        String curved = map.get(TagName.CURVED).iterator().next();
        Collection<String> connections = map.get(TagName.CONNECTION);
        for (String connection : connections) {
            ((Monitor) device).addConnection(ConnectionInterface.valueOf(connection.toUpperCase()));
        }
        ((Monitor) device).setResolution(resolution);
        ((Monitor) device).setDiagonal(Double.parseDouble(diagonal));
        ((Monitor) device).setMatrix(Matrix.valueOf(matrix));
        ((Monitor) device).setCurved(Boolean.parseBoolean(curved));
        return device;
    }


}
