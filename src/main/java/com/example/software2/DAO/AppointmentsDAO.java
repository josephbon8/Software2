package com.example.software2.DAO;

import com.example.software2.Models.Appointments;
import com.example.software2.helper.JDBC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppointmentsDAO {


    public ObservableList<Appointments> getAllAppointments() {
        ObservableList<Appointments> appointmentsList = FXCollections.observableArrayList();
        String query = "SELECT Appointment_ID,Title,Description,Location,Type,Start,End,Create_Date,Created_By," +
                "Last_Update,Last_Updated_By,Customer_ID, User_ID,Contact_ID FROM appointments";

        try (PreparedStatement ps = JDBC.connection.prepareStatement(query);
             ResultSet resultSet = ps.executeQuery();) {

            while (resultSet.next()) {
                int id = resultSet.getInt("Appointment_ID");
                String title = resultSet.getString("Title");
                String desc = resultSet.getString("Description");
                String location = resultSet.getString("Location");
                String Type = resultSet.getString("Type");
                String Start = String.valueOf(resultSet.getString("Start"));
                System.out.println(Start);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime startLocalDateTime = LocalDateTime.parse(Start, formatter);

                String end = resultSet.getString("End");
                LocalDateTime endLocalDateTime = LocalDateTime.parse(end, formatter);

                String Create_Date = String.valueOf(resultSet.getString("Create_Date"));
                LocalDateTime createLocalDateTime = LocalDateTime.parse(Create_Date, formatter);

                String Created_By = resultSet.getString("Created_By");
                String last_update = resultSet.getString("Last_Update");
                LocalDateTime lastupdateLocalDateTime = LocalDateTime.parse(last_update, formatter);

                String last_update_by = resultSet.getString("Last_Updated_By");
                int customerID = resultSet.getInt("Customer_ID");
                int userID = resultSet.getInt("User_ID");
                int contactID = resultSet.getInt("Contact_ID");

                Appointments appointment = new Appointments(id, title, desc, location, Type, startLocalDateTime, endLocalDateTime, createLocalDateTime, Created_By, lastupdateLocalDateTime, last_update_by, customerID, userID, contactID);
                appointmentsList.add(appointment);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return appointmentsList;
    }
}