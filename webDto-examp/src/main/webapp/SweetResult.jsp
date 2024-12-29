<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Sweet List</title>
    <style>
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
            <th>ID</th>
            <th>Shop Name</th>
            <th>Sweet Name</th>
            <th>Special</th>
            <th>Quantity</th>
            <th>Price</th>
        </tr>
        <c:forEach var="sweet" items="${list}">
            <tr>
                <td>${sweet.id}</td>
                <td>${sweet.shopName}</td>
                <td>${sweet.sweetName}</td>
                <td>${sweet.special}</td>
                <td>${sweet.quantity}</td>
                <td>${sweet.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
