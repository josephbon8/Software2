package com.example.software2.Controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ModifyAppointmentController implements Initializable {
    public TextField modifyID;
    public TextField modifyTitle;
    public TextField modifyType;
    public TextField modifyDesc;
    public TextField modifyLocation;
    public DatePicker modifyStartDate;
    public DatePicker modifyEndDate;
    public ComboBox modifyStartTime;
    public ComboBox modifyEndTime;
    public ComboBox modifyUserID;
    public ComboBox modifyCustomerID;
    public ComboBox modifyContact;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
