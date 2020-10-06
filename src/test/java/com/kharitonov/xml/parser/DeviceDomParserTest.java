package com.kharitonov.xml.parser;

import com.kharitonov.xml.exception.DeviceParseException;
import org.testng.annotations.Test;

public class DeviceDomParserTest {
    private DeviceDomParser parser = new DeviceDomParser();

    @Test
    public void testParse() throws DeviceParseException {
        parser.parse("input/DeviceStore.xml");
    }
}