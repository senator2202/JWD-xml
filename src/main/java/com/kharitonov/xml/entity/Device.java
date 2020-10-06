package com.kharitonov.xml.entity;

import java.util.Calendar;


public class Device {
    private String manufacturer;
    private String model;
    private double price;
    private String id;
    private String serial;
    private Calendar manufactureDate;

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

    public Calendar getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Calendar value) {
        this.manufactureDate = value;
    }

}
