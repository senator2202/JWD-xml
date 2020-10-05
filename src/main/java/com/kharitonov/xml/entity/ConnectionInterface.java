package com.kharitonov.xml.entity;

public enum ConnectionInterface {
    HDMI("HDMI"),
    DVI("DVI"),
    VGA("VGA"),
    THUNDERBOLT("Thunderbolt"),
    DISPLAY_PORT("DisplayPort");

    private final String value;

    ConnectionInterface(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
