package com.example.software2.Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Users {
            private int id;
            private String User_Name;
            private String Password;

            private ObservableList<Users> allUsers= FXCollections.observableArrayList();

            public Users(int id,String User_Name, String password){
                this.id=id;
                this.User_Name=User_Name;
                this.Password=password;
            }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String user_Name) {
        User_Name = user_Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", User_Name='" + User_Name + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
