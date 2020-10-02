package com.kharitonov.xml.parser;

import com.kharitonov.xml.exception.ProjectXmlParserException;
import org.testng.annotations.Test;

public class XmlDomParserTest {
    private final XmlDomParser parser = new XmlDomParser();

    @Test
    public void testParse() throws ProjectXmlParserException {
        parser.parse("input/DeviceStore.xml");
    }
}