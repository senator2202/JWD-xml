package com.kharitonov.xml.entity;

public enum Matrix {
    IPS("IPS"),
    TN_FILM("TN+FILM"),
    VA("VA");

    private final String value;

    Matrix(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
