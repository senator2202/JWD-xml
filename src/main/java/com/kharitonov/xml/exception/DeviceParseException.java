package com.kharitonov.xml.exception;

public class DeviceParseException extends Exception {
    public DeviceParseException() {
    }

    public DeviceParseException(String message) {
        super(message);
    }

    public DeviceParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeviceParseException(Throwable cause) {
        super(cause);
    }
}
