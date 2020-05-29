<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${devices.brandName } Devices</title>
</head>
<body>
<h3>List of ${devices.brandName} devices</h3>
<hr>
<ul>
<c:forEach var="device" items="${devices.devices }">
<li>Name: ${device.deviceName } -> Category:${device.deviceType }</li><br/>
</c:forEach>
</ul>
</body>
</html>