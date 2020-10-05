package com.kharitonov.xml.parser;

import com.kharitonov.xml.builder.DeviceBuilder;
import com.kharitonov.xml.entity.DeviceType;

public class BuilderProvider {
    private static final String NAMESPACE_PREFIX = "d:";
    private static final String BLANK = "";

    public static DeviceBuilder provide(String deviceTag) {
        String device = deviceTag.replaceFirst(NAMESPACE_PREFIX, BLANK).toUpperCase();
        DeviceType type = DeviceType.valueOf(device);
        return type.getBuilder();
    }
}
