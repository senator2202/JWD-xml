package com.kharitonov.xml.builder;

import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.entity.Keyboard;
import org.apache.commons.collections4.MultiValuedMap;
import org.w3c.dom.Element;

public class KeyboardBuilder extends DeviceBuilder {
    @Override
    public Device build(Element element) {
        device = new Keyboard();
        buildParent(element);
        String lighting = element.getElementsByTagName(TagName.LIGHTING).item(FIRST_INDEX).getTextContent();
        String keys = element.getElementsByTagName(TagName.KEYS).item(FIRST_INDEX).getTextContent();
        ((Keyboard) device).setLighting(Boolean.parseBoolean(lighting));
        ((Keyboard) device).setKeys(Integer.parseInt(keys));
        return device;
    }

    @Override
    public Device build(MultiValuedMap<String, String> map) {
        device = new Keyboard();
        buildParent(map);
        String lighting = map.get(TagName.LIGHTING).iterator().next();
        String keys = map.get(TagName.KEYS).iterator().next();
        ((Keyboard) device).setLighting(Boolean.parseBoolean(lighting));
        ((Keyboard) device).setKeys(Integer.parseInt(keys));
        return device;
    }
}
