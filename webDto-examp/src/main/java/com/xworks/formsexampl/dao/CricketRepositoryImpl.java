package com.xworks.formsexampl.dao;

import com.xworks.formsexampl.dto.CricketFormDto;
import com.xworks.formsexampl.dto.MilkFormDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CricketRepositoryImpl implements CricketRepository{
    private String name = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/branch";
    private String username = "root";
    private String password = "root";
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

    @SneakyThrows
    @Override
    public List<CricketFormDto> getAll() {
        Class.forName(name);
        try (Connection connection = DriverManager.getConnection(url, username, password); Statement statement = connection.createStatement();) {
            String query = "select * from cricket_form";
            ResultSet resultSet = statement.executeQuery(query);
            List<CricketFormDto> list = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int budget = resultSet.getInt(3);
                int numOfPlayer = resultSet.getInt(4);
                String sponser = resultSet.getString(5);
                String ground = resultSet.getString(6);
                String owner = resultSet.getString(7);
                String iplsponser = resultSet.getString(8);
                String fanornot = resultSet.getString(9);
                CricketFormDto cricketFormDto=new CricketFormDto(name,fanornot,iplsponser,owner,ground,sponser,numOfPlayer,budget);
                cricketFormDto.setId(id);


                list.add(cricketFormDto);
            }
            return list;
        }
    }
}
