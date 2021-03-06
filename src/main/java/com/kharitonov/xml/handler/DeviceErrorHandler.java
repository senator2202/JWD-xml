package com.kharitonov.xml.handler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

public class DeviceErrorHandler implements ErrorHandler {
    private static final Logger LOGGER = LogManager.getLogger(DeviceErrorHandler.class);

    public void warning(SAXParseException e) {
        LOGGER.warn("{} - {}", getLineAddress(e), e.getMessage());
    }

    public void error(SAXParseException e) {
        LOGGER.error("{} - {}", getLineAddress(e), e.getMessage());
    }

    public void fatalError(SAXParseException e) {
        LOGGER.fatal("{} - {}", getLineAddress(e), e.getMessage());
    }

    private String getLineAddress(SAXParseException e) {
        return "Line " + e.getLineNumber() + " : Column " + e.getColumnNumber();
    }
}