package com.kharitonov.xml.reader;

import com.kharitonov.xml.exception.XmlReaderException;
import org.testng.annotations.Test;
import org.w3c.dom.Document;

public class XmlDocumentReaderTest {
    private final XmlDocumentReader parser = new XmlDocumentReader();

    @Test
    public void testParse() throws XmlReaderException {
        Document document = parser.read("input/DeviceStore.xml");
    }
}