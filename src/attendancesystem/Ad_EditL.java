/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.*;

/**
 *
 * @author User
 */
public class Ad_EditL extends javax.swing.JFrame {

    /**
     * Creates new form Ad_EditL
     */
    public Ad_EditL() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        UserTxt = new javax.swing.JTextField();
        butSearch1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNat = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtModules = new javax.swing.JTextField();
        txtIntakes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BackBut = new javax.swing.JButton();
        butUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel6.setText("UserID: ");

        UserTxt.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        butSearch1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butSearch1.setText("Search");
        butSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butSearch1)
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(UserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butSearch1))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel3.setText("Name:");

        txtEmail.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel9.setText("Assigned Intakes:");

        jLabel5.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel5.setText("Email Address:");

        txtName.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel7.setText("Contact Number:");

        jLabel10.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel10.setText("Assigned Modules:");

        jLabel4.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel4.setText("Nationality:");

        txtNat.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        txtContact.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        txtModules.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        txtIntakes.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNat)
                    .addComponent(txtName)
                    .addComponent(txtIntakes, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModules)
                    .addComponent(txtEmail)
                    .addComponent(txtContact))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtIntakes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtModules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("AR DESTINE", 0, 24)); // NOI18N
        jLabel1.setText("Edit Lecturer Details");

        BackBut.setFont(new java.awt.Font("Monospac821 BT", 0, 13)); // NOI18N
        BackBut.setText("Back");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        butUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butUpdate.setText("Update");
        butUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butUpdate)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(BackBut))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BackBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
           this.setVisible(false);
        
        Ad_Main log = new Ad_Main();
        log.setVisible(true);   
    }//GEN-LAST:event_BackButActionPerformed

    private void butSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSearch1ActionPerformed
        // TODO add your handling code here:
        String id = UserTxt.getText();
        String line;
        String[] records;
        int flag = 0;

        File lect = new File("Lecturer_Records.txt");
        FileReader file = null;
        try {
            file = new FileReader(lect);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ad_EditL.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader in = new BufferedReader(file);

        try {
            while ((line = in.readLine()) != null) {
                records = line.split(";");
                String ID = records[0];
                String name = records[2];
                String nat = records[3];
                String con = records[5];
                String email = records[6];
                String intake = records[7];
                String module = records[8];

                if (ID.equals(id)) {
                    flag = 1;
                    txtName.setText(name);
                    txtNat.setText(nat);
                    txtContact.setText(con);
                    txtEmail.setText(email);
                    txtIntakes.setText(intake);
                    txtModules.setText(module);
                }

                
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Ad_EditL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_butSearch1ActionPerformed

    private void butUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUpdateActionPerformed
        // TODO add your handling code here:
        String id = UserTxt.getText();
        String line;
        String[] records;
        int flag = 0;
        int b = 0;
        String newName = txtName.getText();
        String newNat = txtNat.getText();
        String newCon = txtContact.getText();
        String newEm = txtEmail.getText();
        String newIntake = txtIntakes.getText();
        String newModule = txtModules.getText();

        ArrayList<String> tempArray = new ArrayList<>();

        try {
            File lect = new File("Lecturer_Records.txt");
            FileReader file = new FileReader(lect);
            BufferedReader in = new BufferedReader(file);

            while ((line = in.readLine()) != null) {
                records = line.split(";");
                if (newIntake.equals(records[7])) {
                    b = 1;
                }
            }
            in.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cant find text file", "Error", JOptionPane.ERROR_MESSAGE);
        }

        try {
            File lect = new File("Lecturer_Records.txt");
            FileReader file = new FileReader(lect);
            BufferedReader in = new BufferedReader(file);

            while ((line = in.readLine()) != null) {
                records = line.split(";");
                String ID = records[0];

                if (ID.equals(id)) {
                    flag = 1;

                    if (flag == 1 && !(Pattern.matches("^[-0-9]+$", newCon))) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid phone number.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (flag == 1 && !(Pattern.matches("^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$", newEm))) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid email.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        int reply = JOptionPane.showConfirmDialog(null, "Modify Information?", "Modify", JOptionPane.YES_NO_OPTION);
                        if (reply == JOptionPane.YES_OPTION) {

                            tempArray.add(records[0] + ";" + records[1] + ";" + newName + ";"
                                    + newNat + ";" + records[4] + ";" + newCon + ";" + newEm + ";" + newIntake + ";" + newModule + "\n");

                            JOptionPane.showMessageDialog(null, "Successfully Modified", "Modified", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                } else {
                    tempArray.add(line);
                }
            }
            in.close();
            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "Please input an ID first", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Can't find a text file");
        }

        try {
            try (PrintWriter pr = new PrintWriter("Lecturer_Records.txt")) {

                for (String str : tempArray) {
                    pr.println(str);
                }
                pr.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Can't find a text file");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Can't find a text file");
        }
    }//GEN-LAST:event_butUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Ad_EditL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ad_EditL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ad_EditL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ad_EditL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ad_EditL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JTextField UserTxt;
    private javax.swing.JButton butSearch1;
    private javax.swing.JButton butUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIntakes;
    private javax.swing.JTextField txtModules;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNat;
    // End of variables declaration//GEN-END:variables
}
