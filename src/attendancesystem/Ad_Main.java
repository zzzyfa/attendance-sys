/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Ad_Main extends javax.swing.JFrame {

    /**
     * Creates new form Ad_Main1
     */
    public Ad_Main() {
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

        jLabel1 = new javax.swing.JLabel();
        butLogout = new javax.swing.JButton();
        butInbox = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        butRegS = new javax.swing.JButton();
        butViewS = new javax.swing.JButton();
        butDeleteS = new javax.swing.JButton();
        butEditS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        butModifyAtt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        butRegL1 = new javax.swing.JButton();
        butViewL1 = new javax.swing.JButton();
        butDeleteL1 = new javax.swing.JButton();
        butEditL1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Welcome, Admin!");

        butLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butLogout.setText("Logout");
        butLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLogoutActionPerformed(evt);
            }
        });

        butInbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butInbox.setText("Inbox");
        butInbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInboxActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        butRegS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butRegS.setText("Register");
        butRegS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRegSActionPerformed(evt);
            }
        });

        butViewS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butViewS.setText("View Records");
        butViewS.setMinimumSize(new java.awt.Dimension(79, 25));
        butViewS.setPreferredSize(new java.awt.Dimension(79, 25));
        butViewS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butViewSActionPerformed(evt);
            }
        });

        butDeleteS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butDeleteS.setText("Delete Student");
        butDeleteS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteSActionPerformed(evt);
            }
        });

        butEditS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butEditS.setText("Edit Details");
        butEditS.setMinimumSize(new java.awt.Dimension(79, 25));
        butEditS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEditSActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Students");

        butModifyAtt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butModifyAtt.setText("Modify Attendance");
        butModifyAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butModifyAttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(butRegS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butViewS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butEditS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butDeleteS, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(butModifyAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(butRegS, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butViewS, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butEditS, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butDeleteS, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butModifyAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        butRegL1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butRegL1.setText("Register");
        butRegL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRegL1ActionPerformed(evt);
            }
        });

        butViewL1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butViewL1.setText("View Records");
        butViewL1.setMinimumSize(new java.awt.Dimension(79, 25));
        butViewL1.setPreferredSize(new java.awt.Dimension(79, 25));
        butViewL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butViewL1ActionPerformed(evt);
            }
        });

        butDeleteL1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butDeleteL1.setText("Delete Lecturer");
        butDeleteL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteL1ActionPerformed(evt);
            }
        });

        butEditL1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butEditL1.setText("Edit Details");
        butEditL1.setMinimumSize(new java.awt.Dimension(79, 25));
        butEditL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEditL1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Lecturers");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(butRegL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butViewL1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butEditL1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butDeleteL1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(62, 62, 62))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(butRegL1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butViewL1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butEditL1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butDeleteL1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butLogout)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(104, 104, 104)
                            .addComponent(butInbox))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(butLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(butInbox))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLogoutActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?","Logout",JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            this.setVisible(false);

            LoginMain log = new LoginMain();
            log.setVisible(true);}
        // TODO add your handling code here:
    }//GEN-LAST:event_butLogoutActionPerformed

    private void butInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInboxActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Ad_InboxMsg1 adal = new Ad_InboxMsg1();
        adal.setVisible(true);
    }//GEN-LAST:event_butInboxActionPerformed

    private void butRegSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRegSActionPerformed
        this.setVisible(false);
        Ad_RegisterS adal = new Ad_RegisterS();
        adal.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_butRegSActionPerformed

    private void butViewSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butViewSActionPerformed
        this.setVisible(false);
        Ad_RecordsS adrl = new Ad_RecordsS();
        adrl.setVisible(true);
    }//GEN-LAST:event_butViewSActionPerformed

    private void butDeleteSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteSActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Ad_DeleteS adal = new Ad_DeleteS();
        adal.setVisible(true);
    }//GEN-LAST:event_butDeleteSActionPerformed

    private void butEditSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEditSActionPerformed
        this.setVisible(false);
        Ad_EditS adal = new Ad_EditS();
        adal.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_butEditSActionPerformed

    private void butModifyAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butModifyAttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butModifyAttActionPerformed

    private void butRegL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRegL1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Ad_RegisterL adal = new Ad_RegisterL();
        adal.setVisible(true);
    }//GEN-LAST:event_butRegL1ActionPerformed

    private void butViewL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butViewL1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Ad_RecordsL adal = new Ad_RecordsL();
        adal.setVisible(true);
    }//GEN-LAST:event_butViewL1ActionPerformed

    private void butDeleteL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteL1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Ad_DeleteL adal = new Ad_DeleteL();
        adal.setVisible(true);
    }//GEN-LAST:event_butDeleteL1ActionPerformed

    private void butEditL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEditL1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Ad_EditL adal = new Ad_EditL();
        adal.setVisible(true);
    }//GEN-LAST:event_butEditL1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ad_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ad_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ad_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ad_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ad_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butDeleteL1;
    private javax.swing.JButton butDeleteS;
    private javax.swing.JButton butEditL1;
    private javax.swing.JButton butEditS;
    private javax.swing.JButton butInbox;
    private javax.swing.JButton butLogout;
    private javax.swing.JButton butModifyAtt;
    private javax.swing.JButton butRegL1;
    private javax.swing.JButton butRegS;
    private javax.swing.JButton butViewL1;
    private javax.swing.JButton butViewS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
