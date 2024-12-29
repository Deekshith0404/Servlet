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
                  <th>Team Name</th>
                  <th>IPL sponser</th>
                  <th>Fan or not</th>
                  <th>Owner</th>
                  <th>home Ground</th>
                  <th>Sponser</th>
                  <th>Num of players</th>
                  <th>Budget</th>
              </tr>
              <c:forEach var="crick" items="${list}">
                  <tr>
                      <td>${crick.id}</td>
                      <td>${crick.teamName}</td>
                      <td>${crick.iplSponser}</td>
                      <td>${crick.fanOrNot}</td>
                      <td>${crick.owner}</td>
                      <td>${crick.homeGround}</td>
                      <td>${crick.sponsers}</td>
                      <td>${crick.noOfPlayers}</td>
                      <td>${crick.budget}</td>
                  </tr>
              </c:forEach>
          </table>
      </body>
      </html>

</body>
</html>