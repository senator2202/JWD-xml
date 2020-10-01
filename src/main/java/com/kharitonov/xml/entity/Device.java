package com.kharitonov.xml.entity;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Device complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Device">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.example.com/DeviceStore}Id" />
 *       &lt;attribute name="serial" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="manufactureDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device", namespace = "http://www.example.com/DeviceStore", propOrder = {
        "manufacturer",
        "model",
        "price"
})
@XmlSeeAlso({
        Monitor.class,
        Processor.class,
        KeyBoard.class
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

    /**
     * Gets the value of the manufacturer property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the model property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the price property.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the serial property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSerial(String value) {
        this.serial = value;
    }

    /**
     * Gets the value of the manufactureDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Sets the value of the manufactureDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setManufactureDate(XMLGregorianCalendar value) {
        this.manufactureDate = value;
    }

}
