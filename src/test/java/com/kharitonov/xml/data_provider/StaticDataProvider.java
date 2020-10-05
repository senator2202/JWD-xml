package com.kharitonov.xml.data_provider;

import com.kharitonov.xml.exception.XmlReaderException;
import com.kharitonov.xml.reader.XmlDocumentReader;
import org.w3c.dom.Document;

public class StaticDataProvider {
    public static final Document DOCUMENT;

    static {
        try {
            DOCUMENT = new XmlDocumentReader().read("input/DeviceStore.xml");
        } catch (XmlReaderException e) {
            throw new RuntimeException("Document creation error!", e);
        }
    }

}
