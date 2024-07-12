/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patient_login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DoctorSide 
{
    private String license;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String birthday;
    private String password;
    private String specialty;
 /**
 * This class represents the Doctor side functionalities of the application.
 * It provides methods for doctor user management, information retrieval, and patient interaction.
 *
 * @author escob
 */
void createUser(String license, String firstName, String lastName, String email, String phone, String address, String birthday, String password1, String password2, String specialty, Connection connection) {
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    
    System.out.println("hello");
    try {
        // Check if passwords match
        if (!password1.equals(password2)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match. Please re-enter passwords.");
            return; // Exit method if passwords do not match
        }
        
        // Check if username already exists
        String checkUsernameQuery = "SELECT COUNT(*) AS count FROM doctor_tbl WHERE DoctorLicense = ?";
        preparedStatement = connection.prepareStatement(checkUsernameQuery);
        preparedStatement.setString(1, license);
        resultSet = preparedStatement.executeQuery();
        
        if (resultSet.next()) {
            int count = resultSet.getInt("count");
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "license already exists. Please choose a different license.");
                return; // Exit method if username exists
            }
        }
        
        // Proceed to insert new user
        String insertUserQuery = "INSERT INTO doctor_tbl (DoctorLicense, FirstName, LastName, Email, Phone, Address, Birthday, Password, Specialty) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        preparedStatement = connection.prepareStatement(insertUserQuery);
        preparedStatement.setString(1, license);
        preparedStatement.setString(2, firstName);
        preparedStatement.setString(3, lastName);
        preparedStatement.setString(4, email);
        preparedStatement.setString(5, phone);
        preparedStatement.setString(6, address);
        preparedStatement.setString(7, birthday);
        preparedStatement.setString(8, password1);
        preparedStatement.setString(9, specialty); // Assuming password1 is correct
        
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "User created successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "User creation failed.");
        }
        
    } catch (SQLException e) {
        System.out.println("Error occurred: " + e.getMessage());
    } finally {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException e) {
            System.out.println("Error closing resources: " + e.getMessage());
        }
    }
}
  /**
   * Attempts to log in a doctor using the provided license ID and password.
   *
   */
    boolean  loginDoctor(Connection connection, String DoctorLicense, String Password) {
        boolean loginFlag =  false;

        try {
            String sql = "SELECT * FROM doctor_tbl WHERE License = ? AND Password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, DoctorLicense);
            preparedStatement.setString(2, Password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) 
            {
                loginFlag = true;
                return loginFlag;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "invalid Doctor's license or password");
            }
           
            resultSet.close();
            preparedStatement.close();

        }
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        
        return loginFlag;
    }
  /**
   * Sets the doctor's specialty.
   *
   * @param specialty the doctor's specialty
   */
    void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }
   /**
   * Retrieves the doctor's specialty from the database based on the provided license ID.
   *
   */   
    void specialty(Connection connection, String license)
    {
        try {
            String sql = "SELECT * FROM doctorlicense WHERE License_NO = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, license);
        

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next())
            {
                String specialty = resultSet.getString("Specialty");
                setSpecialty(specialty);
            }
            else
                System.err.println("Doctor not found");
           
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("Invalid Account");
        }
    }
  /**
   * Sets the doctor's information based on the retrieved data from the database.
   *
   */    
    void setInfo(String license, String firstName, String lastName, String email, String contact_no, String address, String birthday, String password)
    {
        this.license = license;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email   = email;
        this.phone   = contact_no;
        this.address = address;
        this.birthday = birthday;
        this.password =  password;
    }
  /**
   * Retrieves the doctor's first name.
   *
   * @return the doctor's first name
   */
    String getFirstName()
    {
        return firstName;
    }
   /**
   * Retrieves the doctor's last name.
   *
   * @return the doctor's last name
   */   
    String getLastName()
    {
        return lastName;
    }
  /**
   * Retrieves the doctor's email address.
   *
   * @return the doctor's email address
   */
    String getEmail()
    {
        return email;
    }
  /**
   * Retrieves the doctor's phone number.
   *
   * @return the doctor's phone number
   */
    String getPhone()
    {
        return phone;
    }
  /**
   * Retrieves the doctor's address.
   *
   * @return the doctor's address
   */    
    String getAddress()
    {
        return address;
    }
  /**
   * Retrieves the doctor's birthday.
   *
   * @return the doctor's birthday
   */
    String getBirthtday()
    {
        return birthday;
    }
  /**
   * Retrieves the doctor's specialty.
   *
   * @return the doctor's specialty
   */    
    String getSpecialty()
    {
        return specialty;
    }
   /**
   * Retrieves the doctor's information from the database based on the provided license ID.
   *
   */   
    boolean showInfo(Connection connection, String license) 
    {
        try {
            String sql = "SELECT * FROM doctor_tbl WHERE License = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, license);
        

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next())
            {
                String license_no    = resultSet.getString("License");
                String firstName  = resultSet.getString("FirstName");
                String lastName   = resultSet.getString("LastName");
                String email      = resultSet.getString("Email");
                String contact_no = resultSet.getString("Phone");
                String address    = resultSet.getString("Address");
                String Birthday   = resultSet.getString("Birthday");
                String password   = resultSet.getString("Password");
                
                setInfo(license_no, firstName, lastName, email, contact_no, address, Birthday, password);
                return true;
            }
            else
                System.err.println("Doctor not found");
           
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("Invalid Account");
        }
        
        return true;
    }
  /**
   * Assigns a patient to the doctor. Updates the doctor ID in the patient's table based on the provided patient and doctor IDs.
   *
   * @param connection a connection to the database
   * @param patient_ID the ID of the patient
   * @param doctor_ID the ID of the doctor
   * @return true if the patient is successfully assigned to the doctor, false otherwise
   * @throws SQLException if a database error occurs
   */    
    boolean patient(Connection connection, String patient_ID, String doctor_ID) 
    {
        PreparedStatement preparedStatement = null;

        try {
            // Assuming Doctor_ID is the column you want to update
            String updateUserQuery = "UPDATE patient_tbl SET Doctor_ID = ? WHERE Patient_ID = ?";
            preparedStatement = connection.prepareStatement(updateUserQuery);

            // Set parameters
            preparedStatement.setString(1, doctor_ID);  // Assuming doctor_ID is a variable containing the doctor ID
            preparedStatement.setString(2, patient_ID); // Set patient ID

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No rows updated");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DoctorSide.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Close resources in a finally block
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DoctorSide.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return false;
    }
   /**
   * Creates a new prescription for a patient in the database.
   *
   * @param connection a connection to the database
   * @param patient_ID the ID of the patient
   * @param disease the patient's disease
   * @param prescription the medication prescribed for the patient
   * @throws SQLException if a database error occurs
   */   
    void prescribe(Connection connection, String patient_ID, String disease, String prescription)
    {
        PreparedStatement preparedStatement = null;

        try 
        {
            String insertPrescribeQuery = "INSERT INTO health_status(Patient_ID, Disease, Prescription, DATE)  VALUES (?, ?, ?, NOW())";
            preparedStatement = connection.prepareStatement(insertPrescribeQuery);
            preparedStatement.setString(1, patient_ID);
            preparedStatement.setString(2, disease);
            preparedStatement.setString(3, prescription);
            
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Prescription succesfully added");
            } else {
                JOptionPane.showMessageDialog(null, "Failed.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorSide.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    void schedule(int patient_ID, String sched, Connection connection)
    {
        PreparedStatement preparedStatement = null;

        try 
        {
            String insertPrescribeQuery = "INSERT INTO appointments(Patient_ID, Appointment_date, Created_at)  VALUES (?, ?, NOW())";
            preparedStatement = connection.prepareStatement(insertPrescribeQuery);
            preparedStatement.setInt(1, patient_ID);
            preparedStatement.setString(2, sched);
            
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Schedule succesfully Created");
            } else {
                JOptionPane.showMessageDialog(null, "Failed.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorSide.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 }
