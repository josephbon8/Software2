package com.example.software2.helper;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Modality;
import javafx.stage.StageStyle;

import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

public class LoginAlert extends Alert {

    private String title;
    private String message;

    public LoginAlert(String title, String message, ResourceBundle rb){
        super(AlertType.ERROR);
        this.message=message;
        this.title=title;

        Locale locale= Locale.getDefault();


    setTitle(rb.getString(title));
    setHeaderText(rb.getString(title));
    setContentText(rb.getString(message));
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void callAlert(){
        Alert alert= new Alert(AlertType.INFORMATION);
        alert.initStyle(StageStyle.UTILITY);
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.setTitle(title);
        alert.setHeaderText(title);
        alert.setContentText(message);
        ButtonType okButton= new ButtonType("OK");
        ButtonType cancelButton=new ButtonType("Cancel", ButtonType.CANCEL.getButtonData());
        alert.getButtonTypes().setAll(okButton,cancelButton);
        Optional<ButtonType> result=alert.showAndWait();
        if(result.isPresent()&& result.get() == okButton) {

        }
    }
}
