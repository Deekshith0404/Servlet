    <%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
    <%@ page isELIgnored="false" %>
    <html>
    <head>
     <script>
     function validateform() {
         const brandName = document.getElementById("brandName").value.trim();
         const quantity = document.getElementById("quantity").value;
         const milkType = document.getElementById("types").value;
         let isValid = true;


         if (brandName.length < 3) {
             document.getElementById("errormess").innerText = "Brand Name must be at least 3 words.";
             isValid = false;
         }

         // Validate quantity (positive number)
         if (quantity <= 0) {
             document.getElementById("errornum").innerText = "Quantity must be a positive number.";
             isValid = false;
         }
         if (milkType === "") {
             document.getElementById("erroropt").innerText = "Please select a milk type.";
              isValid = false;
          }
         return isValid;
     }

     </script>
    <style>
    body {
    display: flex;
     justify-content: center;
     align-items: center;
     height: 100vh; margin: 0;
     font-family: Arial, sans-serif;
     }
     .form-container
     {
      border: 1px solid #ccc;
      padding: 20px;
      border-radius: 10px;
       box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
       background-color: #f9f9f9;
       text-align: center; width: 300px;
        }
         h1
      {
       margin-bottom: 20px;
        }
        label
        {
         display: block;
         margin-top: 10px;
         }
      input[type="submit"], input[type="reset"]
      {
      margin-top: 20px;
      padding: 10px 20px;
      border: none;
      border-radius: 5px;
      cursor: pointer;
       color: white;
       }
        input[type="submit"]
        {
        background-color: #4CAF50;
        }
        input[type="submit"]:hover
        {
        background-color: #45a049;
         }
         input[type="reset"]
         {
         background-color: #f44336;
          margin-left: 10px;
     }
     span
     {
     color :red;
     }
      </style>

    </head>
    <body>
    <div class="form-container">
    <h1>Milk Order Form</h1>
    <div> ${message} </div>
    <form action="milk" method="post" name="formname" onsubmit="return validateform()">
    <label for="brandName">Milk Brand:</label>
    <input type="text" id="brandName" name="brandName" /><br><br>
    <span id="errormess"></span>
     <label for="types">Milk Type:</label>
      <select id="types" name="types" required>
        <option value=""></option>
      <option value="SPECIAL">SPECIAL</option>
       <option value="ordinary">ordinary</option>
        <option value="goodLife">goodlife</option>
        <option value="goodLifeLite">goodlifeLite</option>
         <option value="family">family</option>
          <option value="buffalo">buffalo</option>
           </select><br><br>
           <span id="erroropt"></span>
     <label for="quantity">Quantity:</label>
      <input type="number" id="quantity" name="quantity" required/><br>
      <span id="errornum"></span>
       <input type="submit" value="submit"/>
       <input type="reset" value="Clear"/>
        </form>
        </div>
        </body>
        </html>