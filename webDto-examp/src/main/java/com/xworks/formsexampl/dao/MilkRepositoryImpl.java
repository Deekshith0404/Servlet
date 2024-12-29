package com.xworks.formsexampl.dao;

import com.xworks.formsexampl.dto.MilkFormDto;
import com.xworks.formsexampl.dto.MuseumFormDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MilkRepositoryImpl implements MilkRepository {

    private String name = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/branch";
    private String username = "root";
    private String password = "root";

    @Override
    public boolean save(MilkFormDto dto) {

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connection successful");
            String url = "jdbc:mysql://localhost:3306/branch";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println(" jdbc connected succesfull");
            String insert = "insert into milk_form values(0,'" + dto.getBrand() + "','" + dto.getType() + "'," + dto.getQuantity() + "," + dto.getTotal() + ")";

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
    public List<MilkFormDto> getall() {
        Class.forName(name);
        try (Connection connection = DriverManager.getConnection(url, username, password); Statement statement = connection.createStatement();) {
            String query = "select * from milk_form";
            ResultSet resultSet = statement.executeQuery(query);
            List<MilkFormDto> list = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String brand = resultSet.getString(2);
                String type = resultSet.getString(3);
                int quantity = resultSet.getInt(4);
                Double cost = resultSet.getDouble(5);
                MilkFormDto milkFormDto = new MilkFormDto(brand, type, quantity, cost );
                milkFormDto.setId(id);

                list.add(milkFormDto);
            }
            return list;
        }
    }
}
