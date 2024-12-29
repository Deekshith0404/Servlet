package com.xworks.formsexampl.dao;

import com.xworks.formsexampl.dto.SweetFormDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SweetRepositoryImpl implements SweetRepository{

    private String name="com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/branch";
    private String username = "root";
    private String password = "root";
    @Override
    public boolean save(SweetFormDto sweetFormDto) {
        Connection connection = null;
        try {
            Class.forName(name);
            System.out.println("connection successful");

            connection = DriverManager.getConnection(url, username, password);
            System.out.println(" jdbc connected succesfull");
            String insert = "insert into sweet_form values(0,'"+sweetFormDto.getShopName()+"','"+sweetFormDto.getSweetName()+"','"+sweetFormDto.getSpecial()+"',"+sweetFormDto.getQuantity()+","+sweetFormDto.getPrice()+")";

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
    public List<SweetFormDto> getAll() {


        Class.forName(name);
        try (Connection connection = DriverManager.getConnection(url, username, password);Statement statement = connection.createStatement();){
            String query="select * from sweet_form";
            ResultSet resultSet=statement.executeQuery(query);
            List<SweetFormDto> list=new ArrayList<>();
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String shopName=resultSet.getString(2);
                String sweetName=resultSet.getString(3);
                String type=resultSet.getString(4);
                Double quatity=resultSet.getDouble(5);
                Double price=resultSet.getDouble(6);

                SweetFormDto sweetFormDto=new SweetFormDto(shopName,sweetName,type,quatity,price);
                sweetFormDto.setId(id);
                list.add(sweetFormDto);

            }
            return list;


        }
    }
}
