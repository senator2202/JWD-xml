package com.kharitonov.xml.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Processor complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Processor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.com/DeviceStore}Device">
 *       &lt;sequence>
 *         &lt;element name="frequency" type="{http://www.example.com/DeviceStore}Frequency"/>
 *         &lt;element name="cores" type="{http://www.example.com/DeviceStore}Cores"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Processor", namespace = "http://www.example.com/DeviceStore", propOrder = {
        "frequency",
        "cores"
})
public class Processor
        extends Device {

    protected int frequency;
    protected int cores;

    /**
     * Gets the value of the frequency property.
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     */
    public void setFrequency(int value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the cores property.
     */
    public int getCores() {
        return cores;
    }

    /**
     * Sets the value of the cores property.
     */
    public void setCores(int value) {
        this.cores = value;
    }

}
