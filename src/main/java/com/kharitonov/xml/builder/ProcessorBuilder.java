package com.kharitonov.xml.builder;

import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.entity.Processor;
import org.w3c.dom.Element;

public class ProcessorBuilder extends DeviceBuilder{
    public ProcessorBuilder() {
        device = new Processor();
    }

    @Override
    public Device build(Element element) {
        buildParent(element);
        String cores = element.getElementsByTagName(TagName.CORES).item(FIRST_INDEX).getTextContent();
        String frequency = element.getElementsByTagName(TagName.FREQUENCY).item(FIRST_INDEX).getTextContent();
        ((Processor) device).setCores(Integer.parseInt(cores));
        ((Processor) device).setFrequency(Integer.parseInt(frequency));
        return device;
    }
}
