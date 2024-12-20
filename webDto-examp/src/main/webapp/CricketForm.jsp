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
    <h1>Cricket Team Form</h1>

    <!-- Display the message on top -->
    <div>
        ${message}
    </div>

    <form action="cricket" method="post">
        <label for="TeamName">Team Name:</label>
        <input type="text" id="TeamName" name="TeamName" required/><br>

        <label for="budget">Budget:</label>
        <input type="number" id="budget" name="budget" required/><br>

        <label for="noOfPlayers">Number of Players:</label>
        <input type="number" id="noOfPlayers" name="noOfPlayers" required/><br>

        <label for="sponsers">Sponsors:</label>
        <select id="sponsers" name="sponsers" required>
            <option value=""></option>
            <option value="Qatar">Qatar</option>
            <option value="Coca Cola">Coca Cola</option>
            <option value="Birla">Birla</option>
        </select><br>

        <label for="homeGround">Home Ground:</label>
        <input type="text" id="homeGround" name="homeGround" required/><br>

        <label for="owner">Owner:</label>
        <input type="text" id="owner" name="owner" required/><br>

        <label for="IplSponsers">IPL Sponsors:</label>
        <select id="IplSponsers" name="IplSponsers" required>
            <option value=""></option>
            <option value="Tata">Tata</option>
            <option value="Vivo">Vivo</option>
            <option value="Birla">Birla</option>
        </select><br>

        <label>Fan:</label>
        <input type="radio" id="fan" name="fan" value="fan" required/> Yes<br>
        <input type="radio" id="fan" name="fan" value="not fan" required/> No<br>

        <input type="submit" value="Submit"/>
        <input type="reset" value="Clear"/>
    </form>
</div>

</body>
</html>
