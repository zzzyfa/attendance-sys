/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import javax.swing.*;
import java.util.regex.*;
/**
 *
 * @author User
 */
public class Ad_RegisterL extends javax.swing.JFrame {
    private int check = 0;
    private int a = 0;
    private int b = 0;
    private String gender;
    /**
     * Creates new form Ad_RegisterL1
     */
    public Ad_RegisterL() {
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

        genderGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        txtUserID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtRePass = new javax.swing.JTextField();
        BackBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FRB = new javax.swing.JRadioButton();
        MRB = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comIntake1 = new javax.swing.JComboBox<>();
        comIntake2 = new javax.swing.JComboBox<>();
        comModule1 = new javax.swing.JComboBox<>();
        comModule2 = new javax.swing.JComboBox<>();
        SaveBut = new javax.swing.JButton();
        butClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel8.setText("Password:");

        txtPass.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        txtUserID.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel6.setText("UserID:");

        jLabel11.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel11.setText("Retype Password:");

        txtRePass.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserID)
                    .addComponent(txtRePass, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtRePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        BackBut.setFont(new java.awt.Font("Monospac821 BT", 0, 13)); // NOI18N
        BackBut.setText("Back");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("AR DESTINE", 0, 24)); // NOI18N
        jLabel1.setText("Register New Lecturer");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNat.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel5.setText("Email Address:");

        txtEmail.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel3.setText("Name:");

        jLabel7.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel7.setText("Gender: ");

        txtName.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel4.setText("Nationality:");

        genderGroup.add(FRB);
        FRB.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        FRB.setText("Female");
        FRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FRBActionPerformed(evt);
            }
        });

        genderGroup.add(MRB);
        MRB.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        MRB.setText("Male");
        MRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRBActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel12.setText("Contact Number:");

        txtContact.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel13.setText("Assigned Intakes:");

        jLabel14.setFont(new java.awt.Font("Monospac821 BT", 0, 14)); // NOI18N
        jLabel14.setText("Assigned Modules:");

        comIntake1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UC1F1701IT", "UCDF1509BIT", "UC1F1702BIS", "UC3F1609ISS", "UC1F1703EBM", "UCDF1611BF" }));
        comIntake1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comIntake1ActionPerformed(evt);
            }
        });

        comIntake2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UC1F1701IT", "UCDF1509BIT", "UC1F1702BIS", "UC3F1609ISS", "UC1F1703EBM", "UCDF1611BF" }));

        comModule1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VBN", "MTK", "NS", "PSMOD", "BSTAT", "ACC" }));
        comModule1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comModule1ActionPerformed(evt);
            }
        });

        comModule2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VBN", "MTK", "NS", "PSMOD", "BSTAT", "ACC" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comModule1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comModule2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel5))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comIntake1, 0, 122, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comIntake2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContact, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MRB)
                        .addGap(18, 18, 18)
                        .addComponent(FRB)
                        .addGap(78, 78, 78))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
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
                    .addComponent(MRB)
                    .addComponent(FRB))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(comIntake1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comIntake2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(comModule1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comModule2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        SaveBut.setFont(new java.awt.Font("Monospac821 BT", 0, 13)); // NOI18N
        SaveBut.setText("Create User");
        SaveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButActionPerformed(evt);
            }
        });

        butClear.setFont(new java.awt.Font("Monospac821 BT", 0, 13)); // NOI18N
        butClear.setText("Clear");
        butClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackBut)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(SaveBut)
                                        .addGap(18, 18, 18)
                                        .addComponent(butClear))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(BackBut)
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butClear)
                            .addComponent(SaveBut)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        Ad_Main admenu = new Ad_Main();
        admenu.dispose();
        admenu.setUndecorated(true);
        admenu.setVisible(true);
        this.hide();
    }//GEN-LAST:event_BackButActionPerformed

    private void FRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FRBActionPerformed
        gender = "Female";
        check = 1;
    }//GEN-LAST:event_FRBActionPerformed

    private void MRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRBActionPerformed
        gender = "Male";
        check = 1;
    }//GEN-LAST:event_MRBActionPerformed

    private void comIntake1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comIntake1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comIntake1ActionPerformed

    private void comModule1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comModule1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comModule1ActionPerformed

    private void SaveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButActionPerformed
        Lecturer login = new Lecturer();
        login.username = txtUserID.getText();
        login.password = txtPass.getText();

        login.rp = txtRePass.getText();
        //login.intake = txtIntakes.getText();
        login.intake = comIntake1.getSelectedItem().toString() + ", " + comIntake2.getSelectedItem().toString();
        login.module = comModule1.getSelectedItem().toString() + ", " + comModule2.getSelectedItem().toString();
        login.name = txtName.getText();
        login.nat = txtNat.getText();
        login.con = txtContact.getText();
        login.email = txtEmail.getText();
        int a = 0;
        int b = 0;
        int flag = 0;

        try
        {
            File lect = new File("Lecturer_Records.txt");
            if (!lect.exists())
            {
                lect.createNewFile();
            }
        }
        catch (IOException File_Not_Created)
        {
            System.out.println(File_Not_Created);
        }

        try {
            FileWriter file = new FileWriter("Lecturer_Records.txt",true);
            BufferedWriter in = new BufferedWriter(file);

            if (login.username.length()>=1 && login.password.length()>=1 && login.name.length()>=1 &&
                login.email.length()>=1 && login.con.length()>=1 && check>0 ){
                flag = 1;

                if (flag==1 && !login.password.equals(login.rp)){
                    JOptionPane.showMessageDialog(null,"Password fields must be the same","Error",JOptionPane.ERROR_MESSAGE);
                }

                else if (flag==1 && !(Pattern.matches("^[0-9]+$",login.con))) {
                    JOptionPane.showMessageDialog(null,
                    "Please enter a phone number in digits only","Error",
                    JOptionPane.ERROR_MESSAGE);
                }

                else if (flag==1 && !(Pattern.matches(
                        "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$",
                        login.email))){
                            JOptionPane.showMessageDialog(null,
                            "Please enter a valid email address","Error",
                            JOptionPane.ERROR_MESSAGE);
                }

                else if (flag==1 && (comIntake1.getSelectedItem().toString().equals(comIntake2.getSelectedItem().toString()))){
                    JOptionPane.showMessageDialog(null,"Lecturer cannot handle the same 2 intakes","Error",JOptionPane.ERROR_MESSAGE);
                }

                else{
                    in.write(login.username + ";" + login.password + ";" + login.name + ";" + login.nat + ";" +
                        gender + ";" + login.con + ";" + login.email + ";" + login.intake + ";" + login.module + "\n");
                    in.close();
                    JOptionPane.showMessageDialog(null, "New user successfully created","Success",JOptionPane.INFORMATION_MESSAGE);
                    txtName.setText("");
                    txtNat.setText("");
                    genderGroup.clearSelection();
                    txtContact.setText("");
                    txtEmail.setText("");
                    comIntake1.setSelectedIndex(0);
                    comIntake2.setSelectedIndex(0);
                    comModule1.setSelectedIndex(0);
                    comModule2.setSelectedIndex(0);
                    txtUserID.setText("");
                    txtPass.setText("");
                    txtRePass.setText("");
                }

            }
            if (flag==0)
            {
                JOptionPane.showMessageDialog(this, "Please fill in every section", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null,"Can't find a text file");
        }
    }//GEN-LAST:event_SaveButActionPerformed

    private void butClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClearActionPerformed
        txtName.setText("");
        txtNat.setText("");
        genderGroup.clearSelection();
        txtContact.setText("");
        txtEmail.setText("");
        comIntake1.setSelectedIndex(0);
        comIntake2.setSelectedIndex(0);
        comModule1.setSelectedIndex(0);
        comModule2.setSelectedIndex(0);
        txtUserID.setText("");
        txtPass.setText("");
        txtRePass.setText("");
    }//GEN-LAST:event_butClearActionPerformed

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
            java.util.logging.Logger.getLogger(Ad_RegisterL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ad_RegisterL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ad_RegisterL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ad_RegisterL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ad_RegisterL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JRadioButton FRB;
    private javax.swing.JRadioButton MRB;
    private javax.swing.JButton SaveBut;
    private javax.swing.JButton butClear;
    private javax.swing.JComboBox<String> comIntake1;
    private javax.swing.JComboBox<String> comIntake2;
    private javax.swing.JComboBox<String> comModule1;
    private javax.swing.JComboBox<String> comModule2;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNat;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtRePass;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
