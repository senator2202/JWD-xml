package com.kharitonov.xml.entity;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Monitor", namespace = "http://www.example.com/DeviceStore", propOrder = {
        "diagonal",
        "matrix",
        "curved",
        "connection"
})
public class Monitor extends Device {
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

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double value) {
        this.diagonal = value;
    }

    public Matrix getMatrix() {
        return matrix;
    }

    public void setMatrix(Matrix value) {
        this.matrix = value;
    }

    public boolean isCurved() {
        return curved;
    }

    public void setCurved(boolean value) {
        this.curved = value;
    }

    public List<ConnectionInterface> getConnection() {
        if (connection == null) {
            connection = new ArrayList<>();
        }
        return this.connection;
    }

    public String getResolution() {
        if (resolution == null) {
            return "FullHd";
        } else {
            return resolution;
        }
    }

    public void setResolution(String value) {
        this.resolution = value;
    }

}
