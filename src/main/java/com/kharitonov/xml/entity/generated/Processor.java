package com.kharitonov.xml.entity.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Processor", namespace = "http://www.example.com/DeviceStore", propOrder = {
        "frequency",
        "cores"
})
public class Processor extends Device {

    protected int frequency;
    protected int cores;

    public Processor() {
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int value) {
        this.frequency = value;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int value) {
        this.cores = value;
    }

}
