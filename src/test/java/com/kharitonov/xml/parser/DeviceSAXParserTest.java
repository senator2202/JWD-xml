package com.kharitonov.xml.parser;

import com.kharitonov.xml.exception.DeviceParseException;
import org.testng.annotations.Test;

public class DeviceSAXParserTest {
    private DeviceSAXParser parser = new DeviceSAXParser();

    @Test
    public void testParse() throws DeviceParseException {
        parser.parse("input/deviceStore.xml");
    }
}