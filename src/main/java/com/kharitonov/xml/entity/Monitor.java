package com.kharitonov.xml.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monitor extends Device {
    private double diagonal;
    private Matrix matrix;
    private boolean curved;
    private List<ConnectionInterface> connections = new ArrayList<>();
    private String resolution;

    public Monitor() {
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double value) {
        this.diagonal = value;
    }

    public Matrix getMatrix() {
        return matrix;
    }

    public void setMatrix(Matrix value) {
        this.matrix = value;
    }

    public boolean isCurved() {
        return curved;
    }

    public void setCurved(boolean value) {
        this.curved = value;
    }

    public void addConnection(ConnectionInterface connectionInterface) {
        connections.add(connectionInterface);
    }

    public List<ConnectionInterface> getConnections() {
        if (connections == null) {
            connections = new ArrayList<>();
        }
        return Collections.unmodifiableList(connections);
    }

    public String getResolution() {
        if (resolution == null) {
            return "FullHd";
        } else {
            return resolution;
        }
    }

    public void setResolution(String value) {
        this.resolution = value;
    }

}
