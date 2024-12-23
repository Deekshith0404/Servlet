package com.xworks.formsexampl.repository;

import com.xworks.formsexampl.dto.CricketFormDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CricketRepositoryImpl implements CricketRepository{
    @Override
    public boolean save(CricketFormDto cricketFormDto) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connection successful");
            String url = "jdbc:mysql://localhost:3306/branch";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println(" jdbc connected succesfull");
            String insert = "insert into cricket_form values(0,'"+cricketFormDto.getTeamName()+"',"+cricketFormDto.getBudget()+","+cricketFormDto.getNoOfPlayers()+",'"+cricketFormDto.getSponsers()+"','"+cricketFormDto.getHomeGround()+"','"+cricketFormDto.getOwner()+"','"+cricketFormDto.getIplSponser()+"','"+cricketFormDto.getFanOrNot()+"')";

            Statement statement = connection.createStatement();

            int row = statement.executeUpdate(insert);
            System.out.println("no of rows inserted :" + row);


        } catch (ClassNotFoundException | SQLException c) {
            System.out.println("jdbc class not found" + c.getMessage());

        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        return true;
    }
}
