package com.gsv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Con {

            /*
        Run these in MySQL Workbench before executing this class:

        CREATE DATABASE bankSystem;
        USE bankSystem;

        CREATE TABLE signup ( 
            form_no VARCHAR(30), 
            name VARCHAR(30),
            father_name VARCHAR(30), 
            dob VARCHAR(30),
            gender VARCHAR(30), 
            email VARCHAR(60), 
            marital VARCHAR(30), 
            address VARCHAR(70),
            city VARCHAR(30), 
            pincode VARCHAR(30),
            state VARCHAR(30)
        );
        */
    Connection con;
    Statement statement;

    public Con() {
        String url = "jdbc:mysql://localhost:3306/bankSystem"; // ✅ include DB name
        String user = "aryan";                                 // your MySQL username
        String password = "";                                   // your MySQL password

        try {
            // optional, but ensures driver is loaded
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);
            statement = con.createStatement();

        } catch (Exception e) {
            // ❌ removed e.printStackTrace()
            // ✅ show user-friendly message instead
            JOptionPane.showMessageDialog(null,
                    "Database connection failed!\n" + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        Con c = new Con();
        if (c.statement != null) {
            JOptionPane.showMessageDialog(null, "✅ Connected to Database successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "❌ Failed to connect to Database!");
        }
    }
}
