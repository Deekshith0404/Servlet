<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<html>
<head>
</head>
<body>
Customer name : ${museumFormDto.name}<br>
Number of Adult ticket:${museumFormDto.numOfAdults} and children ticket:${museumFormDto.numOfChildren}<br>
Total cost is : ${totalCost}
</body>
</html>