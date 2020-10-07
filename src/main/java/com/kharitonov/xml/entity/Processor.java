package com.kharitonov.xml.entity;

import java.util.Calendar;

public class Processor extends Device {
    private int frequency;
    private int cores;

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int value) {
        this.frequency = value;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int value) {
        this.cores = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Processor)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        Processor processor = (Processor) o;

        if (frequency != processor.frequency) {
            return false;
        }
        return cores == processor.cores;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + frequency;
        result = 31 * result + cores;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Processor{");
        sb.append("manufacturer='").append(getManufacturer()).append('\'');
        sb.append(", model='").append(getModel()).append('\'');
        sb.append(", price=").append(getPrice());
        sb.append(", id='").append(getId()).append('\'');
        sb.append(", serial='").append(getSerial()).append('\'');
        sb.append(", frequency=").append(frequency).append('\'');
        sb.append(", cores=").append(cores);
        sb.append('}');
        return sb.toString();
    }
}
