package com.kharitonov.xml.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.com/DeviceStore}Device" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "device"
})
@XmlRootElement(name = "DeviceStore", namespace = "http://www.example.com/DeviceStore")
public class DeviceStore {

    @XmlElementRef(name = "Device", namespace = "http://www.example.com/DeviceStore", type = JAXBElement.class)
    protected List<JAXBElement<? extends Device>> device;

    /**
     * Gets the value of the device property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the device property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevice().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Processor }{@code >}
     * {@link JAXBElement }{@code <}{@link KeyBoard }{@code >}
     * {@link JAXBElement }{@code <}{@link Device }{@code >}
     * {@link JAXBElement }{@code <}{@link Monitor }{@code >}
     */
    public List<JAXBElement<? extends Device>> getDevice() {
        if (device == null) {
            device = new ArrayList<JAXBElement<? extends Device>>();
        }
        return this.device;
    }

}
