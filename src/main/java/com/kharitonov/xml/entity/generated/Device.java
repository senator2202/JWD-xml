package com.kharitonov.xml.entity.generated;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device", namespace = "http://www.example.com/DeviceStore", propOrder = {
        "manufacturer",
        "model",
        "price"
})
@XmlSeeAlso({
        Monitor.class,
        Processor.class,
        Keyboard.class
})
public class Device {
    @XmlElement(required = true)
    protected String manufacturer;
    @XmlElement(required = true)
    protected String model;
    protected double price;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "serial")
    protected String serial;
    @XmlAttribute(name = "manufactureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar manufactureDate;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String value) {
        this.model = value;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double value) {
        this.price = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String value) {
        this.serial = value;
    }

    public XMLGregorianCalendar getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(XMLGregorianCalendar value) {
        this.manufactureDate = value;
    }

}
