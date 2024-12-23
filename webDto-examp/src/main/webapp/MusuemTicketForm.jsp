<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Museum Ticket Form</title>
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
        span {
            color: red;
            display: block;
            margin-top: 5px;
        }
    </style>
    <script>
        function validateForm() {
            const name = document.getElementById("customerName").value.trim();
            const numOfAdults = parseInt(document.getElementById("numOfAdults").value);
            const numOfChildren = parseInt(document.getElementById("numOfChildren").value);
            const mobileNumber = document.getElementById("mobileNumber").value.trim();
            const email = document.getElementById("email").value.trim();
            let isValid = true;

            if (name.length < 3) {
                document.getElementById("errorName").innerText = "Name must be at least 3 letters.";
                isValid = false;
            }

            // Validate number of tickets (at least 1 in either adults or children)
            if (numOfAdults < 1 && numOfChildren < 1) {
                document.getElementById("errorTickets").innerText = "At least one ticket is required for adults or children.";
                isValid = false;
            }

            // Validate mobile number (exactly 10 digits)
            const mobileNumberPattern = /^[0-9]{10}$/;
            if (!mobileNumberPattern.test(mobileNumber)) {
                document.getElementById("errorMobile").innerText = "Mobile number must be exactly 10 digits.";
                isValid = false;
            }

            // Validate email (simple validation)
             let atPosition = email.indexOf("@");
              let dotPosition = email.lastIndexOf(".");
            if (atPosition<1||dotPosition< atPosition+2 ||dotPosition + 1 >= email.length) {
                document.getElementById("errorEmail").innerText = "Please enter a valid email address.";
                isValid = false;
            }

            return isValid;
        }
    </script>
</head>
<body>
    <div class="form-container">
        <h1>Museum Ticket Form</h1>
        <div>${message}</div>
        <form action="museum" method="post" onsubmit="return validateForm()">
            <label for="customerName">Customer Name:</label>
            <input type="text" id="customerName" name="customerName" required/><br>
            <span id="errorName"></span>

            <label for="numOfAdults">No. of Adults:</label>
            <input type="number" id="numOfAdults" name="numOfAdults" required /><br>
            <span id="errorTickets"></span>

            <label for="numOfChildren">No. of Children:</label>
            <input type="number" id="numOfChildren" name="numOfChildren" required/><br>
            <span id="errorTickets"></span>

            <label for="mobileNumber">Mobile Number:</label>
            <input type="text" id="mobileNumber" name="mobileNumber" required/><br>
            <span id="errorMobile"></span>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required/><br>
            <span id="errorEmail"></span>

            <input type="submit" value="Submit"/>
            <input type="reset" value="Clear"/>
        </form>
    </div>
</body>
</html>
