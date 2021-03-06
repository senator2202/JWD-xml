package com.kharitonov.xml.builder;

import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.entity.Processor;
import org.apache.commons.collections4.MultiValuedMap;
import org.w3c.dom.Element;

public class ProcessorBuilder extends DeviceBuilder {
    @Override
    public Device build(Element element) {
        device = new Processor();
        buildParent(element);
        String cores = element.getElementsByTagName(TagName.CORES).item(FIRST_INDEX).getTextContent();
        String frequency = element.getElementsByTagName(TagName.FREQUENCY).item(FIRST_INDEX).getTextContent();
        ((Processor) device).setCores(Integer.parseInt(cores));
        ((Processor) device).setFrequency(Integer.parseInt(frequency));
        return device;
    }

    @Override
    public Device build(MultiValuedMap<String, String> map) {
        device = new Processor();
        buildParent(map);
        String cores = map.get(TagName.CORES).iterator().next();
        String frequency = map.get(TagName.FREQUENCY).iterator().next();
        ((Processor) device).setCores(Integer.parseInt(cores));
        ((Processor) device).setFrequency(Integer.parseInt(frequency));
        return device;
    }
}
