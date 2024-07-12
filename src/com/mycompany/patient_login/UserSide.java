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


/**
 *
 * @author escob
 */
public class UserSide 
{
    private String firstName;
    private String lastName;
    private String email;
    private String contact_no;
    private String address;
    private String birthday;
    private String userName;
    private String password;
    private String doctor_ID;
    private String disease;
    private String prescribe;
    private String appointment;
    private int patient_id;

void createUser(String firstName, String lastName, String email, String contact_no, String address, String birthday, String userName, String password1, String password2, Connection connection) {
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    
    try {
        // Check if passwords match
        if (!password1.equals(password2)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match. Please re-enter passwords.");
            return; // Exit method if passwords do not match
        }
        
        // Check if username already exists
        String checkUsernameQuery = "SELECT COUNT(*) AS count FROM Patient_TBL WHERE userName = ?";
        preparedStatement = connection.prepareStatement(checkUsernameQuery);
        preparedStatement.setString(1, userName);
        resultSet = preparedStatement.executeQuery();
        
        if (resultSet.next()) {
            int count = resultSet.getInt("count");
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Username already exists. Please choose a different username.");
                return; // Exit method if username exists
            }
        }
        
        // Proceed to insert new user
        String insertUserQuery = "INSERT INTO Patient_TBL (FirstName, LastName, Email, Contact_No, Address, Birthday, userName, password, Date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, CURRENT_DATE())";
        preparedStatement = connection.prepareStatement(insertUserQuery);
        preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, lastName);
        preparedStatement.setString(3, email);
        preparedStatement.setString(4, contact_no);
        preparedStatement.setString(5, address);
        preparedStatement.setString(6, birthday);
        preparedStatement.setString(7, userName);
        preparedStatement.setString(8, password1); // Assuming password1 is correct
        
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

    boolean  loginUser(Connection connection, String UserName, String Password) {
        boolean loginFlag =  false;

        try {
            String sql = "SELECT * FROM Patient_TBL WHERE UserName = ? AND Password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, UserName);
            preparedStatement.setString(2, Password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) 
            {
                loginFlag = true;
                return loginFlag;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "invalid username or password");
            }
           
            resultSet.close();
            preparedStatement.close();

        }
        catch (SQLException e) 
        {
            System.out.println("no birthday");
        }
        
        return loginFlag;
    }

    void setInfo(int patient_id, String firstName, String lastName, String email, String contact_no, String address, String birthday, String userName, String password, String doctor_ID)
    {
        this.patient_id = patient_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contact_no = contact_no;
        this.address = address;
        this.birthday = birthday;
        this.userName = userName;
        this.password =  password;
        this.doctor_ID = doctor_ID;
    }

    String getUsername()
    {
        return userName;
    }
    
    int getPatientID()
    {
        return patient_id;
    }
    
    String getDocID()
    {
        return doctor_ID;
    }
    
    void showInfo(Connection connection, String UserName) 
    {
        try {
            String sql = "SELECT * FROM Patient_TBL WHERE UserName = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, UserName);
        

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                int patientId     = resultSet.getInt("Patient_ID");
                String firstName  = resultSet.getString("FirstName");
                String lastName   = resultSet.getString("LastName");
                String email      = resultSet.getString("Email");
                String contact_no = resultSet.getString("Contact_No");
                String address    = resultSet.getString("Address");
                String Birthday   = resultSet.getString("Birthday");
                String userName   = resultSet.getString("UserName");
                String password   = resultSet.getString("Password");
                String doctor_ID  = resultSet.getString("Doctor_ID");

                setInfo(patientId, firstName, lastName, email, contact_no, address, Birthday, userName, password, doctor_ID);
            }
            else
                JOptionPane.showMessageDialog(null, "USER NOT FOUND");
           
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("Invalid Account");
        }
    }
    
    void setPriscription(String disease, String prescribe)
    {
        this.disease = disease;
        this.prescribe = prescribe;
    }
    
    String getPrescription()
    {
        return prescribe;
    }
    
    String getCondition()
    {
        return disease;
    }
    
    void prescription(Connection connection, int patientId)
    {
        try {
            String sql = "SELECT Disease, Prescription FROM health_status WHERE Patient_ID = ? ORDER BY date DESC";    
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, patientId);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                String disease     = resultSet.getString("Disease");
                String prescribe   = resultSet.getString("Prescription");

                setPriscription(disease, prescribe);
            }
            else
                JOptionPane.showMessageDialog(null, "NO PRESCRIPTION YET/CONDITION GIVE TO YOU");
           
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("Invalid Account");
        }
    }
    
    void setAppointment(String date)
    {
        this.appointment = date;
    }
    
    String getAppointment()
    {
        return appointment;
    }
    
    void mySched(Connection connection, int patient_id)
    {
        try {
            String sql = "SELECT Appointment_date FROM appointments WHERE Patient_ID = ? ORDER BY Created_at DESC";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, patient_id);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                String mySchedule  = resultSet.getString("Appointment_Date");

                setAppointment(mySchedule);
            }
            else
                JOptionPane.showMessageDialog(null, "YOU DONT HAVE AN APPOINTMENT SCHEDULE");
           
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "YOU DONT HAVE AN APPOINTMENT SCHEDULE");
        }
    }
    
    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 }
