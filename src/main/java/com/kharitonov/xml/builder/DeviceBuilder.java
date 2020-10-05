package com.kharitonov.xml.builder;

import com.kharitonov.xml.entity.Device;
import org.w3c.dom.Element;

import java.util.Calendar;

public abstract class DeviceBuilder {
    private static final String DASH = "-";
    private static final int YEAR_INDEX = 0;
    private static final int MONTH_INDEX = 1;
    private static final int DAY_INDEX = 2;
    static final int FIRST_INDEX = 0;
    Device device;

    void buildParent(Element element) {
        String id = element.getAttribute(TagName.ID);
        String serial = element.getAttribute(TagName.SERIAL);
        String manufactureDate = element.getAttribute(TagName.MANUFACTURE_DATE);
        Calendar calendar = initCalendar(manufactureDate);
        String manufacturer = element.getElementsByTagName(TagName.MANUFACTURER).item(FIRST_INDEX).getTextContent();
        String model = element.getElementsByTagName(TagName.MODEL).item(FIRST_INDEX).getTextContent();
        String price = element.getElementsByTagName(TagName.PRICE).item(FIRST_INDEX).getTextContent();
        device.setId(id);
        device.setSerial(serial);
        device.setManufactureDate(calendar);
        device.setManufacturer(manufacturer);
        device.setModel(model);
        device.setPrice(Double.parseDouble(price));
    }

    private Calendar initCalendar(String attribute) {
        if (attribute.isEmpty()) {
            return null;
        }
        String[] date = attribute.split(DASH);
        int year = Integer.parseInt(date[YEAR_INDEX]);
        int month = Integer.parseInt(date[MONTH_INDEX]);
        int day = Integer.parseInt(date[DAY_INDEX]);
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar;
    }

    public abstract Device build(Element element);


}
