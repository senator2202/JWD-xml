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
<p/>
</form>
</body>
</html>
