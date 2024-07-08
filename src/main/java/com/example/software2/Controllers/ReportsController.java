package com.example.software2.Controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class ReportsController implements Initializable {
    public  TableColumn custID;
    public TableView divisionTable;
    public TableView customerTable;
    public TableColumn customerTitle;
    public TableColumn customerType;
    public TableColumn customerDesc;
    public TableColumn customerLocation;
    public TableColumn customerStartDate;
    public TableColumn customerEndDate;
    public TableColumn customerID;
    public TableView appointmentTable;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
