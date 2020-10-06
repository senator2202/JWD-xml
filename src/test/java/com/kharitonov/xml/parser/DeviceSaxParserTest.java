package com.kharitonov.xml.parser;

import com.kharitonov.xml.exception.DeviceParseException;
import org.testng.annotations.Test;

public class DeviceSaxParserTest {
    private DeviceSaxParser parser = new DeviceSaxParser();

    @Test
    public void testParse() throws DeviceParseException {
        parser.parse("input/DeviceStore.xml");
    }
}