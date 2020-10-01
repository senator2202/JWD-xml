package com.kharitonov.xml.validator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class XmlValidatorTest {
    private final XmlValidator validator = new XmlValidator();

    @Test
    public void testValidate() {
        validator.validate("input/devices.xml");
    }
}