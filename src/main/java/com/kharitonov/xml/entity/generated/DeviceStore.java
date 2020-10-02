package com.kharitonov.xml.entity.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "device"
})
@XmlRootElement(name = "DeviceStore", namespace = "http://www.example.com/DeviceStore")
public class DeviceStore {
    @XmlElementRef(name = "Device", namespace = "http://www.example.com/DeviceStore", type = JAXBElement.class)
    protected List<JAXBElement<? extends Device>> device;

    public List<JAXBElement<? extends Device>> getDevice() {
        if (device == null) {
            device = new ArrayList<>();
        }
        return this.device;
    }

}
