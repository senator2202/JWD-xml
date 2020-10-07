package com.kharitonov.xml.parser;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

class StAXStreamProcessor implements AutoCloseable {
    private static final XMLInputFactory FACTORY = XMLInputFactory.newInstance();

    private final XMLStreamReader reader;

    StAXStreamProcessor(InputStream is) throws XMLStreamException {
        reader = FACTORY.createXMLStreamReader(is);
    }

    XMLStreamReader getReader() {
        return reader;
    }

    @Override
    public void close() throws XMLStreamException {
        if (reader != null) {
            reader.close();
        }
    }
}