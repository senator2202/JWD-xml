package com.kharitonov.xml.parser;

import com.kharitonov.xml.exception.DeviceParseException;
import org.testng.annotations.Test;


public class DeviceStAXParserTest {
    private DeviceStAXParser parser = new DeviceStAXParser();

    @Test
    public void testParse() throws DeviceParseException {
        parser.parse("input/deviceStore.xml");
    }
}