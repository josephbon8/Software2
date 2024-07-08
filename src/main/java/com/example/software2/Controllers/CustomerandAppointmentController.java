package com.example.software2.Controllers;

import com.example.software2.DAO.AppointmentsDAO;
import com.example.software2.DAO.CustomerDAO;
import com.example.software2.Models.Customers;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CustomerandAppointmentController implements Initializable {


    public TableView<Customers> customersTable;
    public TableColumn customersID;
    public TableColumn customersName;
    public TableColumn customersAddress;
    public TableColumn customersPhone;
    public TableColumn customersState;
    public TableColumn customersPostal;
    public TableView appointmentsTable;
    public TableColumn appointmentsID;
    public TableColumn appointmentsTitle;
    public TableColumn appointmentsType;
    public TableColumn appointmentsDesc;
    public TableColumn appointmentsStartTime;
    public TableColumn appointmentsEndTime;
    public TableColumn appointmentsContact;
    public TableColumn appointmentsUserID;
    public TableColumn appointmentsCustomerID;
    public RadioButton weekButton;
    public RadioButton monthButton;
    public RadioButton allButton;
    public TableColumn customersDivision;
    public TableColumn customersDivisionID;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CustomerDAO customerDAO=new CustomerDAO();

        customersTable.setItems(customerDAO.getAllCustomers());

        customersID.setCellValueFactory(new PropertyValueFactory<>("Customer_ID"));
        customersName.setCellValueFactory(new PropertyValueFactory<>("Customer_Name"));
        customersAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));
        customersPhone.setCellValueFactory(new PropertyValueFactory<>("Phone"));
        customersPostal.setCellValueFactory(new PropertyValueFactory<>("Postal_Code"));
        customersDivision.setCellValueFactory(new PropertyValueFactory<>("division"));
        customersDivisionID.setCellValueFactory(new PropertyValueFactory<>("division_id"));

        AppointmentsDAO appDao= new AppointmentsDAO();
        appointmentsTable.setItems(appDao.getAllAppointments());
        appointmentsID.setCellValueFactory(new PropertyValueFactory<>("id"));
        appointmentsTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
        appointmentsDesc.setCellValueFactory(new PropertyValueFactory<>("Description"));
        appointmentsContact.setCellValueFactory(new PropertyValueFactory<>("contact_id"));
        appointmentsCustomerID.setCellValueFactory(new PropertyValueFactory<>("customer_id"));
        appointmentsUserID.setCellValueFactory(new PropertyValueFactory<>("user_id"));
        appointmentsType.setCellValueFactory(new PropertyValueFactory<>("Type"));
        appointmentsStartTime.setCellValueFactory(new PropertyValueFactory<>("Start"));
        appointmentsEndTime.setCellValueFactory(new PropertyValueFactory<>("End"));
    }


    public void addAppointmentHandler(ActionEvent actionEvent) throws IOException {
            try{
                Parent root= FXMLLoader.load(getClass().getResource("/com/example/software/AddAppointment.fxml"));

                Stage stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                Scene scene= new Scene(root);
                stage.setTitle("Add Appointment");
                stage.setScene(scene);
                stage.show();
            }
            catch (IOException e){
                e.printStackTrace();
            }
    }

    public void addCustomerHandler(ActionEvent actionEvent){
        try{
            Parent root= FXMLLoader.load(getClass().getResource("/com/example/software/AddCustomer.fxml"));

            Stage stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            Scene scene= new Scene(root);
            stage.setTitle("Add Customer");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void modifyAppointmentHandler(ActionEvent actionEvent){

    }

    public void modifyCustomerHandler(ActionEvent actionEvent){

    }

    public void deleteAppointmentHandler(ActionEvent actionEvent){

    }

    public void deleteCustomerHandler(ActionEvent actionEvent){

    }

    public void filterAppointmentsByWeek(ActionEvent actionEvent){

    }

    public void filterAppointmentsByMonth(ActionEvent actionEvent){

    }

    public void viewAllAppointments(ActionEvent actionEvent){

    }

    public void viewReports(ActionEvent actionEvent){

    }

    public void logoutHandler(ActionEvent actionEvent){

    }
}
