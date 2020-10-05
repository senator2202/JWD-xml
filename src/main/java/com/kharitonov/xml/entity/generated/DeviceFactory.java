package com.kharitonov.xml.entity.generated;

public class DeviceFactory {
    private static DeviceFactory deviceFactoryInstance;

    private DeviceFactory() {
    }

    public static DeviceFactory getInstance() {
        if (deviceFactoryInstance == null) {
            deviceFactoryInstance = new DeviceFactory();
        }
        return deviceFactoryInstance;
    }

    public Device getDevice(DeviceEnum deviceEnum) {
        switch (deviceEnum) {
            case MONITOR: {
                return new Monitor();
            }
            case PROCESSOR: {
                return new Processor();
            }
            case KEY_BOARD: {
                return new Keyboard();
            }
            default: {
                return null;
            }
        }
    }
}