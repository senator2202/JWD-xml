package com.kharitonov.xml.entity.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Keyboard", namespace = "http://www.example.com/DeviceStore", propOrder = {
        "lighting",
        "keys"
})
public class Keyboard extends Device {
    protected boolean lighting;
    protected int keys;

    public Keyboard() {
    }

    public boolean isLighting() {
        return lighting;
    }

    public void setLighting(boolean value) {
        this.lighting = value;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int value) {
        this.keys = value;
    }

}
