package com.kharitonov.xml.entity.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _Keyboard_QNAME = new QName("http://www.example.com/DeviceStore", "Keyboard");
    private final static QName _Device_QNAME = new QName("http://www.example.com/DeviceStore", "Device");
    private final static QName _Monitor_QNAME = new QName("http://www.example.com/DeviceStore", "Monitor");
    private final static QName _Processor_QNAME = new QName("http://www.example.com/DeviceStore", "Processor");

    public DeviceStore createDeviceStore() {
        return new DeviceStore();
    }

    public Device createDevice() {
        return new Device();
    }

    public Monitor createMonitor() {
        return new Monitor();
    }

    public Processor createProcessor() {
        return new Processor();
    }

    public Keyboard createKeyboard() {
        return new Keyboard();
    }

    @XmlElementDecl(namespace = "http://www.example.com/DeviceStore", name = "Keyboard", substitutionHeadNamespace = "http://www.example.com/DeviceStore", substitutionHeadName = "Device")
    public JAXBElement<Keyboard> createKeyboard(Keyboard value) {
        return new JAXBElement<>(_Keyboard_QNAME, Keyboard.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.example.com/DeviceStore", name = "Device")
    public JAXBElement<Device> createDevice(Device value) {
        return new JAXBElement<>(_Device_QNAME, Device.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.example.com/DeviceStore", name = "Monitor", substitutionHeadNamespace = "http://www.example.com/DeviceStore", substitutionHeadName = "Device")
    public JAXBElement<Monitor> createMonitor(Monitor value) {
        return new JAXBElement<>(_Monitor_QNAME, Monitor.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.example.com/DeviceStore", name = "Processor", substitutionHeadNamespace = "http://www.example.com/DeviceStore", substitutionHeadName = "Device")
    public JAXBElement<Processor> createProcessor(Processor value) {
        return new JAXBElement<>(_Processor_QNAME, Processor.class, null, value);
    }

}
