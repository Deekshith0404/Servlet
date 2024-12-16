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
<form action="milk" method="post">
MilkBrand :<input type="text" name="brandName"/><br><br>
Milk Type : <select id="types" name="types" required>
<option value="SPECIAL">SPECIAL</option>
<option value="ordinary">ordinary</option>
<option value="goodLife">goodlife</option>
<option value="goodLifeLite">goodlifeLite</option>
<option value="family">family</option>
<option value="buffalo">buffalo</option>
</select><br><br>
Quantity :<input type="number" name="quantity"/><br>
<input type="submit" value="submit"/>
</form>
</body>
</html>