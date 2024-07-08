package com.example.software2.Controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddCustomerController implements Initializable {
    public TextField custID;
    public TextField custName;
    public TextField custAddress;
    public TextField custPhone;
    public ComboBox custState;
    public ComboBox custCountry;
    public TextField custPostal;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
