package com.kharitonov.xml.analyzer;

import com.kharitonov.xml.entity.generated.Device;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

public abstract class DeviceXmlAnalyzer {
    protected List<Device> devices = new ArrayList<>();

    public abstract void add(Element root);
}
