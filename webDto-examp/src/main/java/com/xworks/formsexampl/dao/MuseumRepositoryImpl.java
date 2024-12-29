package com.xworks.formsexampl.dao;

import com.xworks.formsexampl.dto.MuseumFormDto;
import com.xworks.formsexampl.dto.SweetFormDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MuseumRepositoryImpl implements MuseumRepository{
    private String name="com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/branch";
    private String username = "root";
    private String password = "root";

    @Override
    public boolean save(MuseumFormDto museumFormDto) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connection successful");
            String url = "jdbc:mysql://localhost:3306/branch";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println(" jdbc connected succesfull");
            String insert = "insert into museum_form values(0,'"+museumFormDto.getName()+"',"+museumFormDto.getNumOfAdults()+","+museumFormDto.getNumOfChildren()+","+museumFormDto.getMobileNumber()+",'"+museumFormDto.getEmail()+"',"+museumFormDto.getPrice()+")";

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
    public List<MuseumFormDto> getall() {
        Class.forName(name);
        try (Connection connection = DriverManager.getConnection(url, username, password); Statement statement = connection.createStatement();) {
            String query = "select * from museum_form";
            ResultSet resultSet = statement.executeQuery(query);
            List<MuseumFormDto> list = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int noOfAdult = resultSet.getInt(3);
                int noOfChild = resultSet.getInt(4);
                Long custNum = resultSet.getLong(5);
                String email = resultSet.getString(6);
                Double price = resultSet.getDouble(7);
                MuseumFormDto museumFormDto=new MuseumFormDto(name,noOfAdult,noOfChild,custNum,email,price);
                museumFormDto.setId(id);

                list.add(museumFormDto);
            }
            return list;


        }
    }
}
