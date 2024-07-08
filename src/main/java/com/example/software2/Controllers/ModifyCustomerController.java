package com.example.software2.Controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ModifyCustomerController implements Initializable {
    public TextField modifyID;
    public TextField modifyName;
    public TextField modifyAddress;
    public TextField modifyPhone;
    public ComboBox modifyState;
    public ComboBox modifyCountry;
    public TextField modifyPostal;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
