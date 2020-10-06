<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<select name="locale" id="slct">
    <option selected disabled>Choose parse method</option>
    <option value="dom">DOM Parser</option>
    <option value="sax">SAX Parser</option>
    <option value="stax">StAX Parser</option>
</select>
<form action="/mainController">
    <input type="submit" value="parse">
</form>
<p/>
<table border="2">
    <caption><h4>Parse results:</h4></caption>
    <tr>
        <th id="id">Type</th>
        <th id="point1">Id</th>
        <th id="point2">Manufacture Date</th>
        <th id="point3">Manufacturer</th>
        <th id="area">Model</th>
        <th id="perimeter">Price</th>
    </tr>
    <c:forEach items="devices" var="device">
        <tr>
            <td>${device.getClass()}</td>
            <td>${device.id}</td>
            <td>${device.manufactureDate}</td>
            <td>${device.manufacturer}</td>
            <td>${device.model}</td>
            <td>${device.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
