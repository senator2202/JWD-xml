package com.kharitonov.xml.builder;

import com.kharitonov.xml.data_provider.StaticDataProvider;
import com.kharitonov.xml.entity.Keyboard;
import org.apache.commons.collections4.MultiValuedMap;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyboardBuilderTest {
    private final DeviceBuilder builder = new KeyboardBuilder();

    @Test
    public void testBuild() {
        MultiValuedMap<String, String> map = StaticDataProvider.KEYBOARD_MAP;
        Keyboard actual = (Keyboard) builder.build(map);
        Keyboard expected = StaticDataProvider.BUILT_KEYBOARD;
        assertEquals(actual, expected);
    }
}