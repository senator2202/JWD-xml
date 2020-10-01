package com.kharitonov.xml.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mypackage package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _KeyBoard_QNAME = new QName("http://www.example.com/DeviceStore", "KeyBoard");
    private final static QName _Device_QNAME = new QName("http://www.example.com/DeviceStore", "Device");
    private final static QName _Monitor_QNAME = new QName("http://www.example.com/DeviceStore", "Monitor");
    private final static QName _Processor_QNAME = new QName("http://www.example.com/DeviceStore", "Processor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeviceStore }
     */
    public DeviceStore createDeviceStore() {
        return new DeviceStore();
    }

    /**
     * Create an instance of {@link Device }
     */
    public Device createDevice() {
        return new Device();
    }

    /**
     * Create an instance of {@link Monitor }
     */
    public Monitor createMonitor() {
        return new Monitor();
    }

    /**
     * Create an instance of {@link Processor }
     */
    public Processor createProcessor() {
        return new Processor();
    }

    /**
     * Create an instance of {@link KeyBoard }
     */
    public KeyBoard createKeyBoard() {
        return new KeyBoard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyBoard }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.example.com/DeviceStore", name = "KeyBoard", substitutionHeadNamespace = "http://www.example.com/DeviceStore", substitutionHeadName = "Device")
    public JAXBElement<KeyBoard> createKeyBoard(KeyBoard value) {
        return new JAXBElement<KeyBoard>(_KeyBoard_QNAME, KeyBoard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Device }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.example.com/DeviceStore", name = "Device")
    public JAXBElement<Device> createDevice(Device value) {
        return new JAXBElement<Device>(_Device_QNAME, Device.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Monitor }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.example.com/DeviceStore", name = "Monitor", substitutionHeadNamespace = "http://www.example.com/DeviceStore", substitutionHeadName = "Device")
    public JAXBElement<Monitor> createMonitor(Monitor value) {
        return new JAXBElement<Monitor>(_Monitor_QNAME, Monitor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Processor }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.example.com/DeviceStore", name = "Processor", substitutionHeadNamespace = "http://www.example.com/DeviceStore", substitutionHeadName = "Device")
    public JAXBElement<Processor> createProcessor(Processor value) {
        return new JAXBElement<Processor>(_Processor_QNAME, Processor.class, null, value);
    }

}
