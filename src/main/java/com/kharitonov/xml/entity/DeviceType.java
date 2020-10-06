package com.kharitonov.xml.entity;

import com.kharitonov.xml.builder.DeviceBuilder;
import com.kharitonov.xml.builder.KeyboardBuilder;
import com.kharitonov.xml.builder.MonitorBuilder;
import com.kharitonov.xml.builder.ProcessorBuilder;

public enum DeviceType {
    MONITOR(new MonitorBuilder()),
    PROCESSOR(new ProcessorBuilder()),
    KEYBOARD(new KeyboardBuilder());

    private DeviceBuilder builder;

    DeviceType(DeviceBuilder builder) {
        this.builder = builder;
    }

    public static boolean contains(String type) {
        boolean result;
        try {
            DeviceType.valueOf(type.toUpperCase());
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }
        return result;
    }

    public DeviceBuilder getBuilder() {
        return builder;
    }
}
