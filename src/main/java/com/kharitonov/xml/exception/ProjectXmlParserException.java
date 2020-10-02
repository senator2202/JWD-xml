package com.kharitonov.xml.exception;

public class ProjectXmlParserException extends Exception{
    public ProjectXmlParserException() {
    }

    public ProjectXmlParserException(String message) {
        super(message);
    }

    public ProjectXmlParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjectXmlParserException(Throwable cause) {
        super(cause);
    }
}
