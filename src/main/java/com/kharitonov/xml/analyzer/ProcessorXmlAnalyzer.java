package com.kharitonov.xml.analyzer;

import com.kharitonov.xml.entity.generated.Keyboard;
import com.kharitonov.xml.entity.generated.Processor;
import org.w3c.dom.Element;

public class ProcessorXmlAnalyzer extends DeviceXmlAnalyzer {
    @Override
    public void add(Element root) {
        devices.add(new Processor());
    }
}
