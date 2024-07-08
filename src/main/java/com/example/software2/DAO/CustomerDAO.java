package com.example.software2.DAO;

import com.example.software2.Models.Customers;
import com.example.software2.helper.JDBC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomerDAO {

    private String getAllQuery = "SELECT c.Customer_ID, c.Customer_Name, c.Address, c.Postal_Code, c.Phone, c.Create_Date, c.Created_By, c.Last_Update, c.Last_Updated_By, c.Division_ID, d.Division" +
            " FROM customers c JOIN first_level_divisions d ON c.Division_ID= d.Division_ID";

    public ObservableList<Customers> getAllCustomers() {
        ObservableList<Customers> customers = FXCollections.observableArrayList();

        try (PreparedStatement ps = JDBC.connection.prepareStatement(getAllQuery);
             ResultSet resultSet = ps.executeQuery();) {

            while (resultSet.next()) {
                int id = resultSet.getInt("Customer_ID");
                String name = resultSet.getString("Customer_Name");
                String address = resultSet.getString("Address");
                String postalCode = resultSet.getString("Postal_Code");
                String phone = resultSet.getString("Phone");
                String createDate = String.valueOf(resultSet.getString("Create_Date"));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime createDateLocalDateTime = LocalDateTime.parse(createDate, formatter);
                String createdBy = resultSet.getString("Created_By");
                String lastUpdate = String.valueOf(resultSet.getString("Last_Update"));
                LocalDateTime lastUpdateLocalDateTime = LocalDateTime.parse(lastUpdate, formatter);

                String lastUpdatedBy = resultSet.getString("Last_Updated_By");
                int divisionID=resultSet.getInt("Division_ID");

                String division= resultSet.getString("Division");

                   Customers customer= new Customers(id,name,address,postalCode,division,phone,createDateLocalDateTime,createdBy,lastUpdateLocalDateTime,lastUpdatedBy,divisionID);
                    customer.setCountry(divisionID);
                 customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


  return customers;  }
}
