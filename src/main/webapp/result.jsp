<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
	<title>Title</title>
</head>
<body>
<form>
	<table border="2">
		<caption><h4>Parse results:</h4></caption>
		<tr>
			<th id="type">Type</th>
			<th id="id">Id</th>
			<th id="manufactureDate">Manufacture Date</th>
			<th id="manufacturer">Manufacturer</th>
			<th id="model">Model</th>
			<th id="price">Price</th>
		</tr>
		<c:forEach items="${devices}" var="device">
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
</form>
</body>
</html>
