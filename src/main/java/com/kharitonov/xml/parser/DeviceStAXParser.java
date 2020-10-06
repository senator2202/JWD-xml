package com.kharitonov.xml.parser;

import com.kharitonov.xml.builder.DeviceBuilder;
import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.entity.DeviceType;
import com.kharitonov.xml.exception.DeviceParseException;
import com.kharitonov.xml.util.BuilderProvider;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DeviceStAXParser {
    private static final String ROOT_ELEMENT = "deviceStore";

    public List<Device> parse(String fileName) throws DeviceParseException {
        List<Device> devices = new ArrayList<>();
        Path path = Paths.get(fileName);
        try (InputStream is = Files.newInputStream(path);
             StAXStreamProcessor processor = new StAXStreamProcessor(is)) {
            XMLStreamReader reader = processor.getReader();
            MultiValuedMap<String, String> attributeMap = new ArrayListValuedHashMap<>();
            while (reader.hasNext()) {
                int type = reader.next();
                if (type == XMLStreamConstants.START_ELEMENT) {
                    String name = reader.getLocalName();
                    if (DeviceType.contains(name)) {
                        int count = reader.getAttributeCount();
                        for (int i = 0; i < count; i++) {
                            String attrName = reader.getAttributeLocalName(i);
                            String attrValue = reader.getAttributeValue(i);
                            attributeMap.put(attrName, attrValue);
                        }
                    } else if (!name.equals(ROOT_ELEMENT)) {
                        String value = reader.getElementText();
                        attributeMap.put(name, value);
                    }
                }
                if (type == XMLStreamConstants.END_ELEMENT) {
                    String name = reader.getLocalName();
                    if (DeviceType.contains(name)) {
                        DeviceBuilder builder = BuilderProvider.provide(name);
                        Device device = builder.build(attributeMap);
                        devices.add(device);
                        attributeMap.clear();
                    }
                }
            }
        } catch (XMLStreamException | IOException e) {
            throw new DeviceParseException(e);
        }
        return devices;
    }
}
