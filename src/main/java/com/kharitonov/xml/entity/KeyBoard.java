package com.kharitonov.xml.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyBoard complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="KeyBoard">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.com/DeviceStore}Device">
 *       &lt;sequence>
 *         &lt;element name="lighting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="keys" type="{http://www.example.com/DeviceStore}Keys"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyBoard", namespace = "http://www.example.com/DeviceStore", propOrder = {
        "lighting",
        "keys"
})
public class KeyBoard
        extends Device {

    protected boolean lighting;
    protected int keys;

    /**
     * Gets the value of the lighting property.
     */
    public boolean isLighting() {
        return lighting;
    }

    /**
     * Sets the value of the lighting property.
     */
    public void setLighting(boolean value) {
        this.lighting = value;
    }

    /**
     * Gets the value of the keys property.
     */
    public int getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     */
    public void setKeys(int value) {
        this.keys = value;
    }

}
