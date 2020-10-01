package com.kharitonov.xml.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Matrix.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Matrix">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IPS"/>
 *     &lt;enumeration value="TN+FILM"/>
 *     &lt;enumeration value="VA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
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
