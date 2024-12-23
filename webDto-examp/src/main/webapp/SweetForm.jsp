<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<script>
function validateform() {
    const shopName = document.getElementById("shopName").value;
    const sweetName = document.getElementById("sweetName").value;
    const special = document.querySelector('input[name="special"]:checked');
    const quantity = document.getElementById("quantity").value;
    let isValid = true;

    // Validate shop name selection
    if (shopName === "") {
        document.getElementById("errorShopName").innerText = "Please select a shop name.";
        isValid = false;
    } else {
        document.getElementById("errorShopName").innerText = "";
    }

    // Validate sweet name selection
    if (sweetName === "") {
        document.getElementById("errorSweetName").innerText = "Please select a sweet name.";
        isValid = false;
    } else {
        document.getElementById("errorSweetName").innerText = "";
    }

    // Validate special/not special selection
    if (!special) {
        document.getElementById("errorSpecial").innerText = "Please select if the sweet is special or not.";
        isValid = false;
    } else {
        document.getElementById("errorSpecial").innerText = "";
    }

    // Validate quantity (must be greater than 0)
    if (quantity <= 0) {
        document.getElementById("errorQuantity").innerText = "Quantity must be greater than 0.";
        isValid = false;
    } else {
        document.getElementById("errorQuantity").innerText = "";
    }

    return isValid;
}

</script>
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
    <h1>Sweet Order Form</h1>

    <!-- Display the message on top -->
    <div>
        ${message}
    </div>

    <form action="sweet" method="post" name="sweetform" onsubmit=" return validateform()">
        <label for="shopName">Shop Name:</label>
        <select id="shopName" name="shopName" required>
            <option value=""></option>
            <option value="Venkateshwara Sweets">Venkateshwara Sweets</option>
            <option value="jodhpur">Jodhpur Sweets</option>
            <option value="knati sweets">Knati Sweets</option>
            <option value="patel sweets">Patel Sweets</option>
            <option value="banaras sweets">Banaras Sweets</option>
        </select><br>

        <label for="sweetName">Sweet Name:</label>
        <select id="sweetName" name="sweetName" required>
            <option value=""></option>
            <option value="Gulab jamun">Gulab Jamun</option>
            <option value="mysore pak">Mysore Pak</option>
            <option value="jalebi">Jalebi</option>
            <option value="rasgulla">Rasgulla</option>
            <option value="kaju katli">Kaju Katli</option>
            <option value="kheer">Kheer</option>
        </select><br><br>

        SPECIAL <input type="radio" id="special" name="special" value="SPECIAL"><br>
        NOT Special <input type="radio" id="special" name="special" value="not special"><br>

        <label for="quantity">Quantity:</label>
        <select id="quantity" name="quantity" required>
            <option value=""></option>
            <option value="0.5">500 grams</option>
            <option value="1">1 kg</option>
            <option value="1.5">1.5 kg</option>
            <option value="2">2 kg</option>
        </select><br>
        <input type="submit" value="submit" id="submit"/>
        <input type="reset" value="Clear"/>
    </form>
</div>

</body>
</html>
