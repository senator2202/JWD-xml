package com.kharitonov.xml.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionInterface.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionInterface">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HDMI"/>
 *     &lt;enumeration value="DVI"/>
 *     &lt;enumeration value="VGA"/>
 *     &lt;enumeration value="Thunderbolt"/>
 *     &lt;enumeration value="DisplayPort"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ConnectionInterface", namespace = "http://www.example.com/DeviceStore")
@XmlEnum
public enum ConnectionInterface {

    HDMI("HDMI"),
    DVI("DVI"),
    VGA("VGA"),
    @XmlEnumValue("Thunderbolt")
    THUNDERBOLT("Thunderbolt"),
    @XmlEnumValue("DisplayPort")
    DISPLAY_PORT("DisplayPort");
    private final String value;

    ConnectionInterface(String v) {
        value = v;
    }

    public static ConnectionInterface fromValue(String v) {
        for (ConnectionInterface c : ConnectionInterface.values()) {
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
