package com.kharitonov.xml.parser;

import com.kharitonov.xml.data_provider.StaticDataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.Document;

import static org.testng.Assert.*;

public class XmlDomParserTest {
    private XmlDomParser parser = new XmlDomParser();

    @Test
    public void testParse() {
        Document document = StaticDataProvider.DOCUMENT;
        parser.parse(document);
    }

    @Test
    public void testFromXmlToObject() {
        parser.fromXmlToObject("input/DeviceStore.xml");
    }
}