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
<form action="sweet" method="post">
<label for="shopName">Shop Name:</label>
<select id="shopName" name="shopName" required>
<option value=""></option>
<option value="Venkateshwara Sweets">Venkateshwara Sweets</option>
<option value="jodhpur">jodhpur Sweets</option>
<option value="knati sweets">knati sweets</option>
<option value="patel sweets">patel sweets</option>
<option value="banaras sweets">banaras sweets</option>
</select><br>
<label for="sweetName">Sweet Name:</label>
<select id="sweetName" name="sweetName" required>
<option value=""></option>
<option value="Gulab jamun">Gulab jamun</option>
<option value="mysore pak">mysore pak</option>
<option value="jalebi">jalebi</option>
<option value="rasgulla">rasgulla</option>
<option value="kaju katli">kaju katli</option>
<option value="kheer">kheer</option>
</select><br><br>
 SPECIAL<input type="radio" id="special" name="special" value="SPECIAL"> <br>NOT Special
 <input type="radio" id="special" name="special" value="not special"><br>

 <label for="quantity">Quantity:</label>
 <select id="quantity" name="quantity" required>
 <option value=""></option>
 <option value="0.5">500 grams</option>
 <option value="1">1 kg</option>
 <option value="1.5">1.5 kg</option>
 <option value="2">2 kg</option>
 </select><br>
<input type="submit" value="submit"/>
</form>
</body>
</html>