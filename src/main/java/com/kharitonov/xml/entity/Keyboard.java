package com.kharitonov.xml.entity;

public class Keyboard extends Device {
    private boolean lighting;
    private int keys;

    public Keyboard() {
    }

    public boolean isLighting() {
        return lighting;
    }

    public void setLighting(boolean value) {
        this.lighting = value;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int value) {
        this.keys = value;
    }

}
