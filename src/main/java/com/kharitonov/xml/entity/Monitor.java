package com.kharitonov.xml.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Monitor extends Device {
    private double diagonal;
    private Matrix matrix;
    private boolean curved;
    private List<ConnectionInterface> connections = new ArrayList<>();
    private String resolution;

    public Monitor() {
        resolution = EMPTY;
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
        return Objects.requireNonNullElse(resolution, "FullHd");
    }

    public void setResolution(String value) {
        this.resolution = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Monitor)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        Monitor monitor = (Monitor) o;

        if (Double.compare(monitor.diagonal, diagonal) != 0) {
            return false;
        }
        if (curved != monitor.curved) {
            return false;
        }
        if (matrix != monitor.matrix) {
            return false;
        }
        if (connections != null ? !connections.equals(monitor.connections) : monitor.connections != null) {
            return false;
        }
        return resolution != null ? resolution.equals(monitor.resolution) : monitor.resolution == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(diagonal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (matrix != null ? matrix.hashCode() : 0);
        result = 31 * result + (curved ? 1 : 0);
        result = 31 * result + (connections != null ? connections.hashCode() : 0);
        result = 31 * result + (resolution != null ? resolution.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Monitor{");
        sb.append(super.toString());
        sb.append(", diagonal=").append(diagonal).append('\'');
        sb.append(", matrix=").append(matrix).append('\'');
        sb.append(", curved=").append(curved).append('\'');
        sb.append(", connections=").append(connections).append('\'');
        sb.append(", resolution='").append(resolution).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
