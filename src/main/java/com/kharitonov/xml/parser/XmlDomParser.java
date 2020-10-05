package com.kharitonov.xml.parser;

import com.kharitonov.xml.builder.DeviceBuilder;
import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.entity.generated.DeviceStore;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlDomParser {
    public List<Device> parse(Document document) {
        List<Device> devices = new ArrayList<>();
        Element root = document.getDocumentElement();
        NodeList nodeList = root.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType()==Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String tag = element.getTagName();
                DeviceBuilder builder = BuilderProvider.provide(tag);
                Device device = builder.build(element);
                devices.add(device);
            }
        }
        return devices;
    }

    public DeviceStore fromXmlToObject(String filePath) {
        try {
            // создаем объект JAXBContext - точку входа для JAXB
            JAXBContext jaxbContext = JAXBContext.newInstance(DeviceStore.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            DeviceStore store = (DeviceStore) un.unmarshal(new File(filePath));
            int a=1;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
