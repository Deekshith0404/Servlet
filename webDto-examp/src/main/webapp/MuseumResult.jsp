<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<style>
<style>
        body{
        align-items:center;
        }

        table {
            width: 80%;
            margin: auto;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: center;
        }
        th {
            background-color: lightgray;
        }
    </style>
</head>
<body>
    <h2 style="text-align: center;">Sweet List</h2>
    <table>
    <tr>
        <th>Id</th>
        <th>Customer Name</th>
        <th>Adults ticket</th>
        <th>Children ticket</th>
        <th>Number</th>
        <th>Email</th>
        <th>Total Price</th>
     </tr>
     <c:forEach var="museum" items="${list}">
     <tr>
        <td>${museum.id}</td>
        <td>${museum.name}</td>
        <td>${museum.numOfAdults}</td>
        <td>${museum.numOfChildren}</td>
        <td>${museum.mobileNumber}</td>
        <td>${museum.email}</td>
        <td>${museum.price}</td>
     </tr>
     </c:forEach>
 </table>

</body>
</html>