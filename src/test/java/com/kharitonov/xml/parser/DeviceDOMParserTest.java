package com.kharitonov.xml.parser;

import com.kharitonov.xml.data_provider.StaticDataProvider;
import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.entity.Monitor;
import com.kharitonov.xml.exception.DeviceParseException;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class DeviceDOMParserTest {
    private final DeviceDOMParser parser = new DeviceDOMParser();

    @Test
    public void testParse() throws DeviceParseException {
        List<Device> actual = parser.parse(StaticDataProvider.XML_FILE_PATH);
        List<Device> expected = StaticDataProvider.PARSED_LIST;
        assertEquals(actual,expected);
    }

    @Test(expectedExceptions = DeviceParseException.class)
    public void testParseException() throws DeviceParseException {
        parser.parse(StaticDataProvider.WRONG_FILE_PATH);
    }
}