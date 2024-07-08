package com.example.software2.DAO;

import com.example.software2.helper.JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FirstLevelDivisionDAO {

    public String getStateByDivisionID(int id){
        String query="SELECT Division FROM first_level_divisions WHERE Division_ID = "+id;
        String division;
        try(PreparedStatement ps = JDBC.connection.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery();) {
            while(resultSet.next()) {
                division = resultSet.getString("Division");
                return division;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
   return null; }
}
