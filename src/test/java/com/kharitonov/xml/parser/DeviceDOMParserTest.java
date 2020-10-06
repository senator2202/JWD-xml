package com.kharitonov.xml.parser;

import com.kharitonov.xml.exception.DeviceParseException;
import org.testng.annotations.Test;

public class DeviceDOMParserTest {
    private DeviceDOMParser parser = new DeviceDOMParser();

    @Test
    public void testParse() throws DeviceParseException {
        parser.parse("input/deviceStore.xml");
    }
}