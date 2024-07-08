package com.example.software2.Models;


import javafx.fxml.Initializable;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public class Customers implements Initializable {

    private int Customer_ID=2;
    private String Customer_Name;
    private String Address;
    private String Postal_Code;
    private String Phone;
    private LocalDateTime Create_Date;
    private String Created_By;
    private LocalDateTime Last_Update;
    private String Last_Updated_By;

    private String division;
    private int division_id;

    private String country;

    public Customers(int id,String customer_Name, String address, String postal_Code,String division, String phone, LocalDateTime create_Date, String created_By, LocalDateTime last_Update, String last_Updated_By, int divison_id) {
        this.Customer_ID=id;
        Customer_Name = customer_Name;
        Address = address;
        Postal_Code = postal_Code;
        Phone = phone;
        Create_Date = create_Date;
        Created_By = created_By;
        Last_Update = last_Update;
        Last_Updated_By = last_Updated_By;
        this.division_id=divison_id;
        this.division=division;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(int division_id) {

        if(division_id >=1 && division_id <=54){
            this.country="US";
        }
       else if(division_id >54 && division_id <=72){
            this.country="Canada";
        }
       else if(division_id >72 && division_id <=104){
            this.country="United Kingdom";
        }
        else{
            throw new IllegalArgumentException("Invalid ID "+ division_id );
        }
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getDivision_id() {
        return division_id;
    }

    public void setDivision_id(int division_id) {
        this.division_id = division_id;
    }

    public  int getCustomer_ID() {
        return Customer_ID;
    }

    public  void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPostal_Code() {
        return Postal_Code;
    }

    public void setPostal_Code(String postal_Code) {
        Postal_Code = postal_Code;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public LocalDateTime getCreate_Date() {
        return Create_Date;
    }

    public void setCreate_Date(LocalDateTime create_Date) {
        Create_Date = create_Date;
    }

    public String getCreated_By() {
        return Created_By;
    }

    public void setCreated_By(String created_By) {
        Created_By = created_By;
    }

    public LocalDateTime getLast_Update() {
        return Last_Update;
    }

    public void setLast_Update(LocalDateTime last_Update) {
        Last_Update = last_Update;
    }

    public String getLast_Updated_By() {
        return Last_Updated_By;
    }

    public void setLast_Updated_By(String last_Updated_By) {
        Last_Updated_By = last_Updated_By;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "Customer_ID=" + Customer_ID +
                ", Customer_Name='" + Customer_Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Postal_Code='" + Postal_Code + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Create_Date=" + Create_Date +
                ", Created_By='" + Created_By + '\'' +
                ", Last_Update=" + Last_Update +
                ", Last_Updated_By='" + Last_Updated_By + '\'' +
                ", division='" + division + '\'' +
                ", division_id=" + division_id +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
