package com.kharitonov.xml.entity;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Monitor complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Monitor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.com/DeviceStore}Device">
 *       &lt;sequence>
 *         &lt;element name="diagonal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="matrix" type="{http://www.example.com/DeviceStore}Matrix"/>
 *         &lt;element name="curved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="connection" type="{http://www.example.com/DeviceStore}ConnectionInterface" maxOccurs="5"/>
 *       &lt;/sequence>
 *       &lt;attribute name="resolution" type="{http://www.example.com/DeviceStore}Resolution" default="FullHd" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Monitor", namespace = "http://www.example.com/DeviceStore", propOrder = {
        "diagonal",
        "matrix",
        "curved",
        "connection"
})
public class Monitor
        extends Device {

    protected double diagonal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Matrix matrix;
    @XmlElement(defaultValue = "false")
    protected boolean curved;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<ConnectionInterface> connection;
    @XmlAttribute(name = "resolution")
    protected String resolution;

    /**
     * Gets the value of the diagonal property.
     */
    public double getDiagonal() {
        return diagonal;
    }

    /**
     * Sets the value of the diagonal property.
     */
    public void setDiagonal(double value) {
        this.diagonal = value;
    }

    /**
     * Gets the value of the matrix property.
     *
     * @return possible object is
     * {@link Matrix }
     */
    public Matrix getMatrix() {
        return matrix;
    }

    /**
     * Sets the value of the matrix property.
     *
     * @param value allowed object is
     *              {@link Matrix }
     */
    public void setMatrix(Matrix value) {
        this.matrix = value;
    }

    /**
     * Gets the value of the curved property.
     */
    public boolean isCurved() {
        return curved;
    }

    /**
     * Sets the value of the curved property.
     */
    public void setCurved(boolean value) {
        this.curved = value;
    }

    /**
     * Gets the value of the connection property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connection property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnection().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionInterface }
     */
    public List<ConnectionInterface> getConnection() {
        if (connection == null) {
            connection = new ArrayList<ConnectionInterface>();
        }
        return this.connection;
    }

    /**
     * Gets the value of the resolution property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getResolution() {
        if (resolution == null) {
            return "FullHd";
        } else {
            return resolution;
        }
    }

    /**
     * Sets the value of the resolution property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

}
