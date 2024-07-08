package com.example.software2.Models;

import java.time.LocalDateTime;

public class Countries {

    private int Country_ID;
    private String Country;

    private LocalDateTime Create_Date;
    private String Created_By;
    private LocalDateTime Last_Update;
    private String Last_Updated_By;


    public Countries(int country_ID, String country, LocalDateTime create_Date, String created_By, LocalDateTime last_Update, String last_Updated_By) {
        Country_ID = country_ID;
        Country = country;
        Create_Date = create_Date;
        Created_By = created_By;
        Last_Update = last_Update;
        Last_Updated_By = last_Updated_By;
    }
}
