package com.kharitonov.xml.builder;

import com.kharitonov.xml.data_provider.StaticDataProvider;
import com.kharitonov.xml.entity.Monitor;
import org.apache.commons.collections4.MultiValuedMap;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MonitorBuilderTest {
    private final DeviceBuilder builder = new MonitorBuilder();

    @Test
    public void testBuild() {
        MultiValuedMap<String, String> map = StaticDataProvider.MONITOR_MAP;
        Monitor actual = (Monitor) builder.build(map);
        Monitor expected = StaticDataProvider.BUILT_MONITOR;
        assertEquals(actual, expected);
    }
}