package com.kharitonov.xml.entity.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyBoard", namespace = "http://www.example.com/DeviceStore", propOrder = {
        "lighting",
        "keys"
})
public class KeyBoard extends Device {
    protected boolean lighting;
    protected int keys;

    public KeyBoard() {
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
