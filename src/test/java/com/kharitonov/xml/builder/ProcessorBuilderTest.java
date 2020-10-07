package com.kharitonov.xml.builder;

import com.kharitonov.xml.data_provider.StaticDataProvider;
import com.kharitonov.xml.entity.Processor;
import org.apache.commons.collections4.MultiValuedMap;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ProcessorBuilderTest {
    private final DeviceBuilder builder = new ProcessorBuilder();

    @Test
    public void testBuild() {
        MultiValuedMap<String, String> map = StaticDataProvider.PROCESSOR_MAP;
        Processor actual = (Processor) builder.build(map);
        Processor expected = StaticDataProvider.BUILT_PROCESSOR;
        assertEquals(actual, expected);
    }
}