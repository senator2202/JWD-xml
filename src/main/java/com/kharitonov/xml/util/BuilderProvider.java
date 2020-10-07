package com.kharitonov.xml.util;

import com.kharitonov.xml.builder.DeviceBuilder;
import com.kharitonov.xml.entity.DeviceType;

public class BuilderProvider {
    private BuilderProvider() {

    }

    public static DeviceBuilder provide(String device) {
        DeviceType type = DeviceType.valueOf(device.toUpperCase());
        return type.getBuilder();
    }
}
