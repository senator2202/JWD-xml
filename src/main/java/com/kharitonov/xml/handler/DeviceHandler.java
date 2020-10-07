package com.kharitonov.xml.handler;

import com.kharitonov.xml.builder.DeviceBuilder;
import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.entity.DeviceType;
import com.kharitonov.xml.util.BuilderProvider;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeviceHandler extends DefaultHandler {
    private static final String ROOT_ELEMENT = "DeviceStore";
    private final List<Device> devices = new ArrayList<>();
    private final MultiValuedMap<String, String> attributeMap = new ArrayListValuedHashMap<>();
    private String currentTag;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        if (!qName.equals(ROOT_ELEMENT)) {
            for (int i = 0; i < attrs.getLength(); i++) {
                attributeMap.put(attrs.getQName(i), attrs.getValue(i));
            }
            currentTag = qName;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        String tagValue = new String(ch, start, length);
        if (isDeviceTag(currentTag)) {
            attributeMap.put(currentTag, tagValue);
            currentTag = null;
        }
    }

    private boolean isDeviceTag(String tag) {
        return tag != null &&
                !tag.equals(ROOT_ELEMENT) &&
                !DeviceType.contains(tag);
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (DeviceType.contains(qName)) {
            DeviceBuilder builder = BuilderProvider.provide(qName);
            Device device = builder.build(attributeMap);
            devices.add(device);
            attributeMap.clear();
        }
    }

    public List<Device> getDevices() {
        return Collections.unmodifiableList(devices);
    }
}