package com.kharitonov.xml.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _KeyBoard_QNAME = new QName("http://www.example.com/DeviceStore", "KeyBoard");
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

    public KeyBoard createKeyBoard() {
        return new KeyBoard();
    }

    @XmlElementDecl(namespace = "http://www.example.com/DeviceStore", name = "KeyBoard", substitutionHeadNamespace = "http://www.example.com/DeviceStore", substitutionHeadName = "Device")
    public JAXBElement<KeyBoard> createKeyBoard(KeyBoard value) {
        return new JAXBElement<KeyBoard>(_KeyBoard_QNAME, KeyBoard.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.example.com/DeviceStore", name = "Device")
    public JAXBElement<Device> createDevice(Device value) {
        return new JAXBElement<Device>(_Device_QNAME, Device.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.example.com/DeviceStore", name = "Monitor", substitutionHeadNamespace = "http://www.example.com/DeviceStore", substitutionHeadName = "Device")
    public JAXBElement<Monitor> createMonitor(Monitor value) {
        return new JAXBElement<Monitor>(_Monitor_QNAME, Monitor.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.example.com/DeviceStore", name = "Processor", substitutionHeadNamespace = "http://www.example.com/DeviceStore", substitutionHeadName = "Device")
    public JAXBElement<Processor> createProcessor(Processor value) {
        return new JAXBElement<Processor>(_Processor_QNAME, Processor.class, null, value);
    }

}
