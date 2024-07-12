
package com.mycompany.patient_login;

/**
 *
 * @author escob
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**

* This class represents a doctor's dashboard for a patient management system.

* It allows doctors to view available patients, assign patients to themselves,

* prescribe medications, and schedule appointments.
*/

public class DoctorDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form DoctorDashBoard
     */
    private static String license;
    private static String patient_id = "";
    private static String firstName = "";
    private static String lastName = "";
    private static String email =  "";
    private static String contact = "";
    private static String address = "";
    private static String birthday = "";
    private static String date = "";
    
    public DoctorDashBoard(String license) {
       initComponents();
       setLocationRelativeTo(null); 
       this.license = license;
       initializeDoctorDashboard();
    }
    
    DoctorDashBoard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    private void initializeDoctorDashboard() 
    {
        yourPatient.setVisible(false);
        addPatient.setVisible(true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patient_tbl = new javax.swing.JTable();
        available_patients = new javax.swing.JButton();
        addPatient = new javax.swing.JButton();
        showUrPatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        yourPatient = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        disease_text = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        prescribe_text = new javax.swing.JTextField();
        prescribe = new javax.swing.JButton();
        Month = new javax.swing.JComboBox<>();
        Day = new javax.swing.JComboBox<>();
        schedule_BTN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(253, 254, 254));

        patient_tbl.setBackground(new java.awt.Color(253, 254, 254));
        patient_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient_ID", "First Name", "Last Name", "Email", "Contact No.", "Address", "Birthday", "Date"
            }
        ));
        jScrollPane2.setViewportView(patient_tbl);

        available_patients.setBackground(new java.awt.Color(253, 254, 254));
        available_patients.setText("Show available patient");
        available_patients.setActionCommand("");
        available_patients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                available_patientsMouseClicked(evt);
            }
        });
        available_patients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                available_patientsActionPerformed(evt);
            }
        });

        addPatient.setBackground(new java.awt.Color(253, 254, 254));
        addPatient.setText("Add Patient");
        addPatient.setActionCommand("");
        addPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientActionPerformed(evt);
            }
        });

        showUrPatient.setBackground(new java.awt.Color(253, 254, 254));
        showUrPatient.setText("Show your patients");
        showUrPatient.setActionCommand("");
        showUrPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUrPatientActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/patient_login/Icons/logout.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/patient_login/Icons/patient.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/patient_login/Icons/yourPatient.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/patient_login/Icons/add.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/patient_login/Icons/logout.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        yourPatient.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Disease");

        disease_text.setBackground(new java.awt.Color(253, 254, 254));
        disease_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                disease_textFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                disease_textFocusLost(evt);
            }
        });
        disease_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disease_textActionPerformed(evt);
            }
        });

        jLabel7.setText("Prescription");

        prescribe_text.setBackground(new java.awt.Color(253, 254, 254));
        prescribe_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                prescribe_textFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                prescribe_textFocusLost(evt);
            }
        });

        prescribe.setBackground(new java.awt.Color(253, 254, 254));
        prescribe.setText("prescribe");
        prescribe.setActionCommand("");
        prescribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescribeActionPerformed(evt);
            }
        });

        Month.setBackground(new java.awt.Color(253, 254, 254));
        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August ", "September", "Octorber", "November", "Devember", " " }));

        Day.setBackground(new java.awt.Color(253, 254, 254));
        Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayActionPerformed(evt);
            }
        });

        schedule_BTN.setBackground(new java.awt.Color(253, 254, 254));
        schedule_BTN.setText("Schedule");
        schedule_BTN.setActionCommand("");
        schedule_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schedule_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout yourPatientLayout = new javax.swing.GroupLayout(yourPatient);
        yourPatient.setLayout(yourPatientLayout);
        yourPatientLayout.setHorizontalGroup(
            yourPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yourPatientLayout.createSequentialGroup()
                .addGroup(yourPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(yourPatientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(yourPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(120, 120, 120))
                    .addComponent(disease_text)
                    .addComponent(prescribe_text)
                    .addComponent(prescribe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(yourPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(yourPatientLayout.createSequentialGroup()
                        .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(schedule_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        yourPatientLayout.setVerticalGroup(
            yourPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yourPatientLayout.createSequentialGroup()
                .addGroup(yourPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(yourPatientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(yourPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(disease_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(yourPatientLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(yourPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prescribe_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(schedule_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(prescribe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Log Out");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(645, 645, 645)
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(available_patients)
                                    .addComponent(addPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showUrPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(803, 803, 803))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(yourPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(available_patients, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addComponent(showUrPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(yourPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Fetches a list of available patients (patients without a assigned doctor)
     * and populates the patient table in the UI.
     * Also shows the "Add Patient" button and hides other UI elements.
     */    
    private void showTable()
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
        
        try {
            
            DefaultTableModel tblPatient = (DefaultTableModel) patient_tbl.getModel();
            tblPatient.setRowCount(0); 
        
            String sql = "SELECT Patient_ID, FirstName, LastName, Email, Contact_No, Address, Birthday, Date FROM patient_tbl WHERE Doctor_id IS NULL";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            tblPatient = (DefaultTableModel) patient_tbl.getModel();

            while (resultSet.next()) {
                patient_id = resultSet.getString("Patient_ID");
                firstName = resultSet.getString("FirstName");
                lastName = resultSet.getString("LastName");
                email = resultSet.getString("Email");
                contact = resultSet.getString("Contact_No");
                address = resultSet.getString("Address");
                birthday = resultSet.getString("Birthday");
                date = resultSet.getString("Date");

                String[] patientData = {patient_id, firstName, lastName, email, contact, address, birthday, date};
                tblPatient.addRow(patientData);
            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
    /**
    * Fetches a list of patients assigned to the current doctor
    * and populates the patient table in the UI.
    */   
    private void yourpatient()
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
        
        try {
            
            DefaultTableModel tblPatient = (DefaultTableModel) patient_tbl.getModel();
            tblPatient.setRowCount(0); 
        
            String sql = "SELECT Patient_ID, FirstName, LastName, Email, Contact_No, Address, Birthday FROM patient_tbl WHERE Doctor_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, license);
            ResultSet resultSet = preparedStatement.executeQuery();

            tblPatient = (DefaultTableModel) patient_tbl.getModel();

            while (resultSet.next()) {
                patient_id = resultSet.getString("Patient_ID");
                firstName = resultSet.getString("FirstName");
                lastName = resultSet.getString("LastName");
                email = resultSet.getString("Email");
                contact = resultSet.getString("Contact_No");
                address = resultSet.getString("Address");
                birthday = resultSet.getString("Birthday");

                String[] patientData = {patient_id, firstName, lastName, email, contact, address, birthday};
                tblPatient.addRow(patientData);
            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
    /**
     * Handles the click event on the "Available Patients" button.
     *
     * */
    private void available_patientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_available_patientsActionPerformed
        // TODO add your handling code here:
       showTable();
       yourPatient.setVisible(false);
       addPatient.setVisible(true);
    }//GEN-LAST:event_available_patientsActionPerformed
    /**
     * This method attempts to update a patient's license information in the database.
     * It retrieves the selected patient ID from the patient table and calls the DoctorSide.patient() method
     * to update the license. If successful, it displays a confirmation message and refreshes the table.
     * Otherwise, it displays a message indicating no patient was selected.
     *
     * @param evt the ActionEvent object
     */
    private void addPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientActionPerformed
        // TODO add your handling code here:
        DoctorSide add       = new DoctorSide();
        DatabaseConnection database = new DatabaseConnection();
        
        int rowIndex = patient_tbl.getSelectedRow();
        
        if (rowIndex != -1) {
            String patient_Id = patient_tbl.getValueAt(rowIndex, 0).toString();

            if (add.patient(database.DBConnection(), patient_Id, license)) {
                JOptionPane.showMessageDialog(null, "Patient " + patient_Id + " successfully updated");
                showTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No patient selected. Please select a patient.");
        }
    }//GEN-LAST:event_addPatientActionPerformed

    private void available_patientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_available_patientsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_available_patientsMouseClicked
    /**
     * Hides the "Your Patient" panel and shows panels for prescribing medication and scheduling appointments.
     */
    private void showUrPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUrPatientActionPerformed
        // TODO add your handling code here:
        yourpatient();
        addPatient.setVisible(false);
        yourPatient.setVisible(true);
        
    }//GEN-LAST:event_showUrPatientActionPerformed
    /**
     * Prescribes medication to a selected patient after checking for required information (disease and prescription).
     */
    private void prescribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescribeActionPerformed
        // TODO add your handling code here:
        DoctorSide doctor = new DoctorSide();
        DatabaseConnection database = new DatabaseConnection();

        int rowIndex = patient_tbl.getSelectedRow();

        // Check if a row is selected
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Please select a patient from the table.",
                    "No Patient Selected", JOptionPane.WARNING_MESSAGE);
        } else {
            String patient_Id = patient_tbl.getValueAt(rowIndex, 0).toString();
            String disease = disease_text.getText();
            String prescription = prescribe_text.getText();

            // Check if disease or prescription is empty
            if (disease.isEmpty() || prescription.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter both disease and prescription information.",
                        "Incomplete Information", JOptionPane.WARNING_MESSAGE);
            } else {
                doctor.prescribe(database.DBConnection(), patient_Id, disease, prescription);
            }
        }
    }//GEN-LAST:event_prescribeActionPerformed
    /**
    * Schedules an appointment for a selected patient after checking the chosen date and validating user input.
    */
    private void schedule_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schedule_BTNActionPerformed
        // TODO add your handling code here:
        DoctorSide make = new DoctorSide();
        DatabaseConnection database = new DatabaseConnection();
        String monthh = "";
        // Check if there is a selected row in patient_tbl
        int rowIndex = patient_tbl.getSelectedRow();
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Please select a patient from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String patientIDString = patient_tbl.getValueAt(rowIndex, 0).toString();
            int patient_ID = Integer.parseInt(patientIDString);

            String year = "2024";
            String month = (String) Month.getSelectedItem();
            String day = (String) Day.getSelectedItem();
            
            switch(month)
            {
                case "january": 
                    monthh = "1";
                    break;
                case "February": 
                    monthh = "2";
                    break;
                case "March": 
                    monthh = "3";
                    break;
                case "April": 
                    monthh = "4";
                    break;
                case "May": 
                    monthh = "5";
                    break;
                case "June": 
                    monthh = "6";
                    break;
                case "July": 
                    monthh = "7";
                    break;
                case "August": 
                    monthh = "8";
                    break;
                case "September": 
                    monthh = "9";
                    break;
                case "October": 
                    monthh = "10";
                    break;
                case "November": 
                    monthh = "11";
                    break;
                case "December": 
                    monthh = "12";
                    break;
            }

            // Check if any of the fields are empty
            if (month.equals("Month") || day.equals("Day")) {
                JOptionPane.showMessageDialog(null, "Please select all date fields.", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                String Birthday = year + "-" + monthh + "-" + day;
                make.schedule(patient_ID, Birthday, database.DBConnection());
            }
        }

    }//GEN-LAST:event_schedule_BTNActionPerformed
    /**
    * Prompts the user for confirmation before logging out of the application.
    * 
    * (Choose the appropriate method name based on your code)
    */
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
    
        // Check user's choice
        if (choice == JOptionPane.YES_OPTION) {
            // User clicked Yes, perform logout actions here
            // For example, close the current window or navigate to the logout page
            // Replace the comment with actual code for logging out
            new Login().setVisible(true);
            this.setVisible(false);
        } else {
            // User clicked No or closed the dialog, do nothing (cancel logout)
            System.out.println("Logout cancelled.");
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void disease_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disease_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disease_textActionPerformed

    private void DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DayActionPerformed

    private void disease_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disease_textFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_disease_textFocusGained

    private void disease_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disease_textFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_disease_textFocusLost

    private void prescribe_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prescribe_textFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_prescribe_textFocusGained

    private void prescribe_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prescribe_textFocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_prescribe_textFocusLost
    /**
     * Handles the mouse click event on the jLabel5 component.
     * Prompts the user for confirmation before logging out.
     * 
     * @param evt the mouse event object
     */
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
    
        // Check user's choice
        if (choice == JOptionPane.YES_OPTION) {
            // User clicked Yes, perform logout actions here
            // For example, close the current window or navigate to the logout page
            // Replace the comment with actual code for logging out
            new Login().setVisible(true);
            this.setVisible(false);
        } else {
            // User clicked No or closed the dialog, do nothing (cancel logout)
            System.out.println("Logout cancelled.");
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoctorDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDashBoard(license).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Day;
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JButton addPatient;
    private javax.swing.JButton available_patients;
    private javax.swing.JTextField disease_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patient_tbl;
    private javax.swing.JButton prescribe;
    private javax.swing.JTextField prescribe_text;
    private javax.swing.JButton schedule_BTN;
    private javax.swing.JButton showUrPatient;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JPanel yourPatient;
    // End of variables declaration//GEN-END:variables
}