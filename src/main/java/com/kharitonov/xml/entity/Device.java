package com.kharitonov.xml.entity;

import java.util.Calendar;
import java.util.Objects;


public class Device {
    static final String EMPTY = "";
    private String manufacturer;
    private String model;
    private double price;
    private String id;
    private String serial;
    private Calendar manufactureDate;

    Device() {
        serial = EMPTY;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Device)) {
            return false;
        }

        Device device = (Device) o;

        if (Double.compare(device.price, price) != 0) {
            return false;
        }
        if (!Objects.equals(manufacturer, device.manufacturer)) {
            return false;
        }
        if (!Objects.equals(model, device.model)) {
            return false;
        }
        if (!Objects.equals(id, device.id)) {
            return false;
        }
        if (!Objects.equals(serial, device.serial)) {
            return false;
        }
        return manufactureDate != null
                ? manufactureDate.get(Calendar.YEAR) == device.manufactureDate.get(Calendar.YEAR) &&
                manufactureDate.get(Calendar.MONTH) == device.manufactureDate.get(Calendar.MONTH) &&
                manufactureDate.get(Calendar.DATE) == device.manufactureDate.get(Calendar.DATE)
                : device.manufactureDate == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (serial != null ? serial.hashCode() : 0);
        result = 31 * result + (manufactureDate != null ? manufactureDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("manufacturer='").append(manufacturer).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", price=").append(price);
        sb.append(", id='").append(id).append('\'');
        sb.append(", serial='").append(serial).append('\'');
        return sb.toString();
    }
}
