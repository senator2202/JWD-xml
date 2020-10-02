package com.kharitonov.xml.creator;

import com.kharitonov.xml.entity.generated.Device;
import org.w3c.dom.Node;

public interface DeviceCreator {
    Device create(Node node);
}
