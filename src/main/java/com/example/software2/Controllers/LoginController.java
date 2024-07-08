package com.example.software2.Controllers;

import com.example.software2.DAO.UserDao;
import com.example.software2.Models.Users;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.time.ZoneId;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    public Button loginButton;
    @FXML
    public TextField passwordField;
    @FXML
    public TextField usernameField;
    @FXML
    public Label timezoneLabel;
    @FXML
    public Label userNameLabel;
    @FXML
    public Label passwordLabel;
    @FXML
    public Label zoneIDLabel;
    @FXML
    public Label headerLabel;

    Locale de= Locale.getDefault();

    ResourceBundle rb = ResourceBundle.getBundle("log",de);

    @Override
     public void initialize(URL url,ResourceBundle resourceBundle){
            timezoneLabel.setText(String.valueOf(ZoneId.systemDefault()));



        zoneIDLabel.setText(rb.getString("zoneIDLabel"));
        headerLabel.setText(rb.getString("headerLabel"));
        userNameLabel.setText(rb.getString("userNameLabel"));
        passwordLabel.setText(rb.getString("passwordLabel"));
        loginButton.setText(rb.getString("loginButton"));
           System.out.println(rb.getString("title"));


        System.out.println(rb.getString("title"));


    }

    public void checkUserNameandPasswordHandler(ActionEvent actionEvent) throws IOException {
        UserDao userDao= new UserDao();
        List<Users> userList= userDao.getUsers();
        String username= usernameField.getText();
        String password= passwordField.getText();
        if(username.isEmpty()||password.isEmpty()){
            Alert alert= new Alert(Alert.AlertType.ERROR);
            alert.initStyle(StageStyle.UTILITY);
            alert.initModality(Modality.APPLICATION_MODAL);
            alert.setTitle(rb.getString("missinguserorpass"));
            alert.setHeaderText(rb.getString("missinguserorpass"));
            alert.setContentText(rb.getString("missingMessage"));
            ButtonType okButton= new ButtonType("OK");
            alert.showAndWait();
        }
        boolean match=false;
        for (Users user: userList){
            System.out.println(username);
            System.out.println(user.getUser_Name());


            if (user.getPassword().equals(password) && user.getUser_Name().equals(username)) {
                match = true;
                System.out.println(match);
                break;
            }

            }
        if(match){
            try{
                Parent root= FXMLLoader.load(getClass().getResource("/com/example/software/Appointments.fxml"));

                Stage stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                Scene scene= new Scene(root);
                stage.setTitle("Customer/Appointments");
                stage.setScene(scene);
                stage.show();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }

        if(!match){
            Alert alert= new Alert(Alert.AlertType.ERROR);
            alert.initStyle(StageStyle.UTILITY);
            alert.initModality(Modality.APPLICATION_MODAL);
            alert.setTitle(rb.getString("title"));
            alert.setHeaderText(rb.getString("title"));
            alert.setContentText(rb.getString("message"));
            ButtonType okButton= new ButtonType("OK");
            alert.showAndWait();
        }
    }


}