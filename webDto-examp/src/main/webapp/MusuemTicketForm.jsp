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

input[type="submit"] {
    margin-top: 20px;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    background-color: #4CAF50;
    color: white;
    cursor: pointer;
}

input[type="submit"]:hover {
    background-color: #45a049;
}
</style>
</head>
<body>
<form action="museum" method="post">
Customer Name : <input type="text" name="customerName"/><br><br>
No/of Adults :<input type="number" name="numOfAdults"/><br><br>
No/of children :<input type="number" name="numOfChildren"/><br><br>
Mobile Number : <input type="number" name="mobileNumber"/><br><br>
Email : <input type="email" name="email"/><br><br>
<input type="submit" value="submit">
</form>
</body>
</html>
