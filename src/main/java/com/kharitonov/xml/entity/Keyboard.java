package com.kharitonov.xml.entity;


public class Keyboard extends Device {
    private boolean lighting;
    private int keys;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Keyboard)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        Keyboard keyboard = (Keyboard) o;

        if (lighting != keyboard.lighting) {
            return false;
        }
        return keys == keyboard.keys;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (lighting ? 1 : 0);
        result = 31 * result + keys;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Keyboard{");
        sb.append("manufacturer='").append(getManufacturer()).append('\'');
        sb.append(", model='").append(getModel()).append('\'');
        sb.append(", price=").append(getPrice());
        sb.append(", id='").append(getId()).append('\'');
        sb.append(", serial='").append(getSerial()).append('\'');
        sb.append(", lighting=").append(lighting).append('\'');
        sb.append(", keys=").append(keys);
        sb.append('}');
        return sb.toString();
    }
}
