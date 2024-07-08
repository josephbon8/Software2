package com.example.software2.Controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddAppointmentController implements Initializable {
    public TextField appID;
    public TextField appTitle;
    public TextField appType;
    public TextField appDesc;
    public TextField appLocation;
    public DatePicker appStartDate;
    public DatePicker appEndDate;
    public ComboBox appStartTime;
    public ComboBox appEndTime;
    public ComboBox appUserID;
    public ComboBox appCustID;
    public ComboBox appContact;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
