package com.kharitonov.xml.entity;

public class Processor extends Device {
    protected int frequency;
    protected int cores;

    public Processor() {
    }

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

}
