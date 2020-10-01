package com.kharitonov.xml.handler;

import org.xml.sax.ContentHandler;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

public class SimpleHandler implements ContentHandler {
    @Override
    public void setDocumentLocator(Locator locator) {

    }

    @Override
    public void startDocument() throws SAXException {

    }

    @Override
    public void endDocument() throws SAXException {

    }

    @Override
    public void startPrefixMapping(String prefix, String uri) throws SAXException {

    }

    @Override
    public void endPrefixMapping(String prefix) throws SAXException {

    }

    @Override
    public void startElement(String uri, String localName,
                             String qName, Attributes attrs) {
        String s = qName;
//получение и вывод информации об атрибутах элемента
        for (int i = 0; i < attrs.getLength(); i++) {
            s += " " + attrs.getQName(i) + "="
                    + attrs.getValue(i) + " ";
        }
        System.out.print(s.trim());
    }

    @Override
    public void characters(char[] ch,
                           int start, int length) {
        System.out.print(new String(ch, start, length));
    }

    @Override
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {

    }

    @Override
    public void processingInstruction(String target, String data) throws SAXException {

    }

    @Override
    public void skippedEntity(String name) throws SAXException {

    }

    @Override
    public void endElement(String uri,
                           String localName, String qName) {
        System.out.print(qName);
    }
}