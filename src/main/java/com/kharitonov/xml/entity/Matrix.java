package com.kharitonov.xml.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Matrix", namespace = "http://www.example.com/DeviceStore")
@XmlEnum
public enum Matrix {

    IPS("IPS"),
    @XmlEnumValue("TN+FILM")
    TN_FILM("TN+FILM"),
    VA("VA");
    private final String value;

    Matrix(String v) {
        value = v;
    }

    public static Matrix fromValue(String v) {
        for (Matrix c : Matrix.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
