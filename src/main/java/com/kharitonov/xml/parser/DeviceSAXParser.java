package com.kharitonov.xml.parser;

import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.exception.DeviceParseException;
import com.kharitonov.xml.handler.DeviceErrorHandler;
import com.kharitonov.xml.handler.DeviceHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

public class DeviceSAXParser {
    public List<Device> parse(String fileName) throws DeviceParseException {
        try {
            SAXParserFactory parserFactory = SAXParserFactory.newInstance();
            SAXParser parser = parserFactory.newSAXParser();
            XMLReader reader = parser.getXMLReader();
            DeviceHandler deviceHandler = new DeviceHandler();
            reader.setContentHandler(deviceHandler);
            reader.setErrorHandler(new DeviceErrorHandler());
            reader.parse(fileName);
            return deviceHandler.getDevices();
        } catch (SAXException | ParserConfigurationException | IOException e) {
            throw new DeviceParseException(e);
        }
    }
}
