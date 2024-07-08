package com.example.software2.DAO;

import com.example.software2.Models.Contacts;
import com.example.software2.helper.JDBC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactDAO {


    public ObservableList<Contacts> getAllContact() {
        ObservableList<Contacts> contactsList = FXCollections.observableArrayList();
        String query="SELECT Contact_ID, Contact_Name, Email FROM contacts";
        try (PreparedStatement ps = JDBC.connection.prepareStatement(query);
             ResultSet resultSet = ps.executeQuery();) {

            while (resultSet.next()) {
                int id = resultSet.getInt("Contact_ID");
                String name = resultSet.getString("Contact_Name");
                String email = resultSet.getString("Email");

                Contacts contact= new Contacts(id,name,email);
                contactsList.add(contact);
            }
        } catch (SQLException e) {

        }
   return contactsList; }
}