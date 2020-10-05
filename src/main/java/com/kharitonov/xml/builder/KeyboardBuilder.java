package com.kharitonov.xml.builder;

import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.entity.Keyboard;
import org.w3c.dom.Element;

public class KeyboardBuilder extends DeviceBuilder {
    public KeyboardBuilder(){
        device = new Keyboard();
    }

    @Override
    public Device build(Element element) {
        buildParent(element);
        String lighting = element.getElementsByTagName(TagName.LIGHTING).item(FIRST_INDEX).getTextContent();
        String keys = element.getElementsByTagName(TagName.KEYS).item(FIRST_INDEX).getTextContent();
        ((Keyboard)device).setLighting(Boolean.parseBoolean(lighting));
        ((Keyboard)device).setKeys(Integer.parseInt(keys));
        return device;
    }
}
