package com.example.software2.DAO;

import com.example.software2.Models.Users;
import com.example.software2.helper.JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static String select_users_query= "SELECT User_ID, User_Name ,Password FROM users";

    public List<Users> getUsers(){
        ArrayList<Users> users= new ArrayList<>();

        try(PreparedStatement ps= JDBC.connection.prepareStatement(select_users_query);
            ResultSet resultSet= ps.executeQuery();){

            while(resultSet.next()){
                int id= resultSet.getInt("User_ID");
                String username= resultSet.getString("User_Name");
                String password= resultSet.getString("Password");
                Users user= new Users(id,username,password);
                users.add(user);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

}
