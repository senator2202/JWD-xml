package com.kharitonov.xml.validator;

import com.kharitonov.xml.handler.DeviceErrorHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.xerces.parsers.DOMParser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

import java.io.IOException;

public class XmlValidator {
    private static final Logger LOGGER = LogManager.getLogger(XmlValidator.class);
    private static final String VALIDATION_URL = "http://xml.org/sax/features/validation";
    private static final String SCHEMA_URL = "http://apache.org/xml/features/validation/schema";

    public boolean validate(String filename) {
        DOMParser parser = new DOMParser();
        boolean result = true;
        try {
            parser.setErrorHandler(new DeviceErrorHandler());
            parser.setFeature(VALIDATION_URL, true);
            parser.setFeature(SCHEMA_URL, true);
            parser.parse(filename);
        } catch (SAXNotRecognizedException e) {
            LOGGER.error("Идентификатор не распознан", e);
            result = false;
        } catch (SAXNotSupportedException e) {
            LOGGER.error("Неподдерживаемая операция", e);
            result = false;
        } catch (SAXException e) {
            LOGGER.error("Глобальная SAX ошибка", e);
            result = false;
        } catch (IOException e) {
            LOGGER.error("Ошибка I/O потока", e);
            result = false;
        }
        return result;
    }
}
