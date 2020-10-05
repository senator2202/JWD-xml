package com.kharitonov.xml.entity;

import com.kharitonov.xml.analyzer.DeviceXmlAnalyzer;
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

    public DeviceBuilder getBuilder() {
        return builder;
    }
}
