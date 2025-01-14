/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.patient_login;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 * This class handles the UI of Dashboard
 *
 * @author escob
 */
public class DashBoard extends javax.swing.JFrame {

   private static String userName;
   private static String doc_id;
   private static int patient_id;
    
    public DashBoard(String userName, String doc_id) {
       initComponents();
       setLocationRelativeTo(null); 
       this.userName = userName;
       this.doc_id =  doc_id;
       initializeDashboard();
    }

    DashBoard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void initializeDashboard() 
    {
        DatabaseConnection database = new DatabaseConnection();
        UserSide user = new UserSide();
        user.showInfo(database.DBConnection(), userName);

        String balance = user.getUsername();
        welcomeLabel.setText("Welcome " + balance);
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
        jSeparator1 = new javax.swing.JSeparator();
        Schedule = new javax.swing.JButton();
        prescription_btn = new javax.swing.JButton();
        doctorButton = new javax.swing.JButton();
        health_ConditionBTN = new javax.swing.JButton();
        mainPane = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(253, 254, 254));

        welcomeLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        Schedule.setBackground(new java.awt.Color(253, 254, 254));
        Schedule.setText("Schedule");
        Schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleActionPerformed(evt);
            }
        });

        prescription_btn.setBackground(new java.awt.Color(253, 254, 254));
        prescription_btn.setText("Prescription");
        prescription_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescription_btnActionPerformed(evt);
            }
        });

        doctorButton.setBackground(new java.awt.Color(253, 254, 254));
        doctorButton.setText("Doctor");
        doctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorButtonActionPerformed(evt);
            }
        });

        health_ConditionBTN.setBackground(new java.awt.Color(253, 254, 254));
        health_ConditionBTN.setText("Health Condition");
        health_ConditionBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                health_ConditionBTNActionPerformed(evt);
            }
        });

        mainPane.setBackground(new java.awt.Color(248, 249, 249));
        mainPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        label1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        label2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        label4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        label5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        label6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        label7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/patient_login/Icons/logout.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/patient_login/Icons/userLogin.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/patient_login/Icons/prescribtion.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/patient_login/Icons/schedule.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/patient_login/Icons/doctor.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/patient_login/Icons/condition.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 74, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(health_ConditionBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prescription_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prescription_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(doctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(health_ConditionBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(123, 123, 123))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorButtonActionPerformed
        // TODO add your handling code here:
        DoctorSide           doctor = new DoctorSide();
        DatabaseConnection database = new DatabaseConnection();
        

        
        if(doc_id != null)
        {
            doctor.showInfo(database.DBConnection(), doc_id);
            doctor.specialty(database.DBConnection(), doc_id);
            
            String firstName  = doctor.getFirstName();
            String lastName   = doctor.getLastName();
            String email      = doctor.getEmail();
            String phone      = doctor.getPhone();
            String address    = doctor.getAddress();
            String birthday   = doctor.getBirthtday();
            String specialty  = doctor.getSpecialty();
            
            Border border = BorderFactory.createLineBorder(Color.BLACK);  // Example border, you can customize this
            label1.setBorder(border);
            label2.setBorder(border);
            label3.setBorder(border);
            label4.setBorder(border);
            label5.setBorder(border);
            label6.setBorder(border);
            label7.setBorder(border);
            
            label1.setText("License no: " + doc_id);
            label2.setText("Name: " + firstName + " " + lastName);
            label3.setText("Email: " + email);
            label4.setText("Phone: " + phone);
            label5.setText("Address: " + address);
            label6.setText("Birthday: " + birthday);
            label7.setText("Specialty: " + specialty);
        }
        else
            JOptionPane.showMessageDialog(null, "NO DOCTOR ASSIGN TO YO YET");
    }//GEN-LAST:event_doctorButtonActionPerformed

    private void prescription_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescription_btnActionPerformed
        // TODO add your handling code here:
        UserSide user = new UserSide();
        DatabaseConnection DB = new DatabaseConnection();
       // Connection connection = null;
        
       if(userName != null)
       {
           user.showInfo(DB.DBConnection(), userName);
           patient_id = user.getPatientID();
           user.prescription(DB.DBConnection(),patient_id );
          
           if(user.getPrescription() == null)
           {
                label1.setText(null);
           
                label2.setBorder(null);
                label3.setBorder(null);
                label4.setBorder(null);
                label5.setBorder(null);
                label6.setBorder(null);
                label7.setBorder(null);

                label2.setText(null);
                label3.setText(null);
                label4.setText(null);
                label5.setText(null);
                label6.setText(null);
                label7.setText(null);
           }
           
           else
           {
                label1.setText("You prescribe to take: " + user.getPrescription());

                Border border = BorderFactory.createLineBorder(Color.BLACK);  // Example border, you can customize this
                label1.setBorder(border);

                label2.setBorder(null);
                label3.setBorder(null);
                label4.setBorder(null);
                label5.setBorder(null);
                label6.setBorder(null);
                label7.setBorder(null);

                label2.setText(null);
                label3.setText(null);
                label4.setText(null);
                label5.setText(null);
                label6.setText(null);
                label7.setText(null); 
           }
       }
       else
            JOptionPane.showMessageDialog(null, "No Medicine prescribe to you");
    }//GEN-LAST:event_prescription_btnActionPerformed

    private void health_ConditionBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_health_ConditionBTNActionPerformed
       // TODO add your handling code here
        UserSide user = new UserSide();
        DatabaseConnection DB = new DatabaseConnection();
        if(userName != null)
        {
            user.showInfo(DB.DBConnection(), userName);
            patient_id = user.getPatientID();
            user.prescription(DB.DBConnection(),patient_id );
            String priscribe = user.getCondition();
            
            if(priscribe == null)
            {
                label2.setBorder(null);
                label3.setBorder(null);
                label4.setBorder(null);
                label5.setBorder(null);
                label6.setBorder(null);
                label7.setBorder(null);

                label1.setText(null);
                label2.setText(null);
                label3.setText(null);
                label4.setText(null);
                label5.setText(null);
                label6.setText(null);
                label7.setText(null);
            }
           else
            {
                label1.setText("You have: " + priscribe);
            
                Border border = BorderFactory.createLineBorder(Color.BLACK);  // Example border, you can customize this
                label1.setBorder(border);

                label2.setBorder(null);
                label3.setBorder(null);
                label4.setBorder(null);
                label5.setBorder(null);
                label6.setBorder(null);
                label7.setBorder(null);

                label2.setText(null);
                label3.setText(null);
                label4.setText(null);
                label5.setText(null);
                label6.setText(null);
                label7.setText(null);
            }
        }
        else
            JOptionPane.showMessageDialog(null, "No Condtion given to you yet!");
    }//GEN-LAST:event_health_ConditionBTNActionPerformed

    private void ScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleActionPerformed
        // TODO add your handling code here:
        UserSide user = new UserSide();
        DatabaseConnection DB = new DatabaseConnection();
        if(userName != null)
        {
            user.showInfo(DB.DBConnection(), userName);
            patient_id = user.getPatientID();
            user.mySched(DB.DBConnection(), patient_id);
            String sched = user.getAppointment();
            
            if(sched == null)
            {
                label1.setText(null);
            
                label2.setBorder(null);
                label3.setBorder(null);
                label4.setBorder(null);
                label5.setBorder(null);
                label6.setBorder(null);
                label7.setBorder(null);

                label2.setText(null);
                label3.setText(null);
                label4.setText(null);
                label5.setText(null);
                label6.setText(null);
                label7.setText(null);
            }
            
            else
            {
                label1.setText("Schedule: " + sched);
            
                Border border = BorderFactory.createLineBorder(Color.BLACK);  // Example border, you can customize this
                label1.setBorder(border);

                label2.setBorder(null);
                label3.setBorder(null);
                label4.setBorder(null);
                label5.setBorder(null);
                label6.setBorder(null);
                label7.setBorder(null);

                label2.setText(null);
                label3.setText(null);
                label4.setText(null);
                label5.setText(null);
                label6.setText(null);
                label7.setText(null);
            }
            
        }
        else
            JOptionPane.showMessageDialog(null, "No Condtion given to you yet!");
    }//GEN-LAST:event_ScheduleActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard(userName, doc_id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Schedule;
    private javax.swing.JButton doctorButton;
    private javax.swing.JButton health_ConditionBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JPanel mainPane;
    private javax.swing.JButton prescription_btn;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
