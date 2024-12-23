<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>

    <title>Cricket Team Form</title>
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
            const teamName = document.getElementById("TeamName").value.trim();
            const budget =document.getElementById("budget").value;
            const noOfPlayers = document.getElementById("noOfPlayers").value;
            const sponsors = document.getElementById("sponsers").value;
            const homeGround = document.getElementById("homeGround").value.trim();
            const owner = document.getElementById("owner").value.trim();
            const iplSponsors = document.getElementById("IplSponsers").value;
            const fan = document.querySelector('input[name="fan"]:checked');
            let isValid = true;

            // Validate team name (at least 3 letters)
            if (teamName.length < 3) {
                document.getElementById("errorTeamName").innerText = "Team name must be at least 3 letters.";
                isValid = false;
            }

            // Validate budget (greater than 0)
            if ( budget <= 0) {
                document.getElementById("errorBudget").innerText = "Budget must be greater than 0.";
                isValid = false;
            }

            // Validate number of players (greater than 0)
            if (noOfPlayers <= 0) {
                document.getElementById("errorNoOfPlayers").innerText = "Number of players must be greater than 0.";
                isValid = false;
            }

            // Validate sponsors selection
            if (sponsors === "") {
                document.getElementById("errorSponsors").innerText = "Please select a sponsor.";
                isValid = false;
            }

            // Validate home ground (at least 3 letters)
            if (homeGround.length < 3) {
                document.getElementById("errorHomeGround").innerText = "Home ground must be at least 3 letters.";
                isValid = false;
            }

            // Validate owner (at least 3 letters)
            if (owner.length < 3) {
                document.getElementById("errorOwner").innerText = "Owner name must be at least 3 letters.";
                isValid = false;
            }

            // Validate IPL sponsors selection
            if (iplSponsors === "") {
                document.getElementById("errorIplSponsors").innerText = "Please select an IPL sponsor.";
                isValid = false;
            }

            // Validate fan selection
            if (!fan) {
                document.getElementById("errorFan").innerText = "Please select if you are a fan or not.";
                isValid = false;
            }

            return isValid;
        }
    </script>
</head>
<body>

<div class="form-container">
    <h1>Cricket Team Form</h1>

    <!-- Display the message on top -->
    <div>
        ${message}
    </div>

    <form action="cricket" method="post" onsubmit="return validateForm()">
        <label for="TeamName">Team Name:</label>
        <input type="text" id="TeamName" name="TeamName" required/>
        <span id="errorTeamName"></span>

        <label for="budget">Budget:</label>
        <input type="number" id="budget" name="budget" required/>
        <span id="errorBudget"></span>

        <label for="noOfPlayers">Number of Players:</label>
        <input type="number" id="noOfPlayers" name="noOfPlayers" required/>
        <span id="errorNoOfPlayers"></span>

        <label for="sponsers">Sponsors:</label>
        <select id="sponsers" name="sponsers" required>
            <option value=""></option>
            <option value="Qatar">Qatar</option>
            <option value="Coca Cola">Coca Cola</option>
            <option value="Birla">Birla</option>
        </select>
        <span id="errorSponsors"></span>

        <label for="homeGround">Home Ground:</label>
        <input type="text" id="homeGround" name="homeGround" required/>
        <span id="errorHomeGround"></span>

        <label for="owner">Owner:</label>
        <input type="text" id="owner" name="owner" required/>
        <span id="errorOwner"></span>

        <label for="IplSponsers">IPL Sponsors:</label>
        <select id="IplSponsers" name="IplSponsers" required>
            <option value=""></option>
            <option value="Tata">Tata</option>
            <option value="Vivo">Vivo</option>
            <option value="Birla">Birla</option>
        </select>
        <span id="errorIplSponsors"></span>

        <label>Fan:</label>
        <input type="radio" id="fan" name="fan" value="fan" required/> Yes
        <input type="radio" id="fan" name="fan" value="not fan" required/> No
        <span id="errorFan"></span>

        <input type="submit" value="Submit"/>
        <input type="reset" value="Clear"/>
    </form>
</div>

</body>
</html>
