package com.kharitonov.xml.parser;

import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.exception.DeviceParseException;
import com.kharitonov.xml.handler.DeviceErrorHandler;
import com.kharitonov.xml.handler.DeviceHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

public class DeviceSAXParser {
    private static final Logger LOGGER = LogManager.getLogger(DeviceSAXParser.class);

    public List<Device> parse(String fileName) throws DeviceParseException {
        try {
            SAXParserFactory parserFactory = SAXParserFactory.newInstance();
            SAXParser parser = parserFactory.newSAXParser();
            XMLReader reader = parser.getXMLReader();
            DeviceHandler deviceHandler = new DeviceHandler();
            List<Device> devices;
            reader.setContentHandler(deviceHandler);
            reader.setErrorHandler(new DeviceErrorHandler());
            reader.parse(fileName);
            devices = deviceHandler.getDevices();
            LOGGER.info("{} devices were successfully parsed!", devices.size());
            return devices;
        } catch (SAXException | ParserConfigurationException | IOException e) {
            throw new DeviceParseException(e);
        }
    }
}
