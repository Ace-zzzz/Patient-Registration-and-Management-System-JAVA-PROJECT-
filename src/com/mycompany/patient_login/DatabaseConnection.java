/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patient_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * This class handles database connection logic.
 *
 * @author escob
 */
public class DatabaseConnection 
{
    /**
   * Establishes a connection to the patient_account database.
   *
   * @return a Connection object representing the connection to the database, or null if connection fails.
   * @throws SQLException if an error occurs while connecting to the database.
   */   
    Connection DBConnection()
   {
        Connection connection = null;

        try 
        {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/patient_accountDB", 
                    "root", // Username
                    "admin123" // Password
            );
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }

        return connection;
   }
/**
   * It's a placeholder for future functionality to prepare SQL statements.
   *
   * @param sql the SQL statement to prepare
   * @throws UnsupportedOperationException always thrown to indicate this method is not yet implemented.
   */
    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
