<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<style>
body {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
    font-family: Arial, sans-serif;
}

.form-container {
    border: 1px solid #ccc;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    background-color: #f9f9f9;
    text-align: center;
    width: 300px;
}

h1 {
    margin-bottom: 20px;
}

label {
    display: block;
    margin-top: 10px;
}

input[type="submit"],
input[type="reset"] {
    margin-top: 20px;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    color: white;
}

input[type="submit"] {
    background-color: #4CAF50;
}

input[type="submit"]:hover {
    background-color: #45a049;
}

input[type="reset"] {
    background-color: #f44336;
    margin-left: 10px;
}

input[type="reset"]:hover {
    background-color: #e53935;
}
</style>
</head>
<body>
<div class="form-container">
    <h1>Museum Ticket Form</h1>

    <!-- Display the message on top -->
    <div>
        ${message}
    </div>

    <form action="museum" method="post">
        <label for="customerName">Customer Name:</label>
        <input type="text" id="customerName" name="customerName" required/><br><br>

        <label for="numOfAdults">No. of Adults:</label>
        <input type="number" id="numOfAdults" name="numOfAdults" required/><br><br>

        <label for="numOfChildren">No. of Children:</label>
        <input type="number" id="numOfChildren" name="numOfChildren" required/><br><br>

        <label for="mobileNumber">Mobile Number:</label>
        <input type="text" id="mobileNumber" name="mobileNumber" required/><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required/><br><br>

        <input type="submit" value="Submit"/>
        <input type="reset" value="Clear"/>
    </form>
</div>
</body>
</html>
