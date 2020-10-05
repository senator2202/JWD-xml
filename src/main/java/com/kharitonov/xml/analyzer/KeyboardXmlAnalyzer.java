package com.kharitonov.xml.analyzer;

import com.kharitonov.xml.entity.generated.Keyboard;
import org.w3c.dom.Element;

public class KeyboardXmlAnalyzer extends DeviceXmlAnalyzer{
    @Override
    public void add(Element root) {
        devices.add(new Keyboard());
    }
}
