package com.kharitonov.xml.controller;

import com.kharitonov.xml.entity.Device;
import com.kharitonov.xml.exception.DeviceParseException;
import com.kharitonov.xml.parser.DeviceDOMParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/mainController")
public class MainServlet extends javax.servlet.http.HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger(MainServlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DeviceDOMParser parser = new DeviceDOMParser();
        try {
            List<Device> devices = parser.parse("deviceStore.xml");
            request.setAttribute("devices", devices);
        } catch (DeviceParseException e) {
            LOGGER.error(e);
        }
        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher("/result.jsp");
        dispatcher.forward(request, response);
    }
}
