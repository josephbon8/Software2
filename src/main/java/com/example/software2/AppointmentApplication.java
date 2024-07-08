package com.example.software2;

import com.example.software2.DAO.ContactDAO;
import com.example.software2.DAO.CustomerDAO;
import com.example.software2.Models.Contacts;
import com.example.software2.Models.Customers;
import com.example.software2.helper.JDBC;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class AppointmentApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Locale fr= new Locale("fr");
        // ResourceBundle resourceBundle = ResourceBundle.getBundle("log", fr);
        FXMLLoader fxmlLoader = new FXMLLoader(AppointmentApplication.class.getResource("/com/example/software2/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Appointment Scheduler");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        JDBC.openConnection();
        launch();

        CustomerDAO customerDAO= new CustomerDAO();
        ObservableList<Customers> customersList= customerDAO.getAllCustomers();
        for(Customers customer: customersList){
            System.out.println(customer);
        }

        ContactDAO contactDAO= new ContactDAO();
        List<Contacts> contactList=contactDAO.getAllContact();
        for(Contacts contact: contactList){
            System.out.println(contact);
        }
        JDBC.closeConnection();
    }
}