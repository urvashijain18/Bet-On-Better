/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdvertisingAdminRole;

import Business.AdvertisingEmployee.AdvertisingEmployeeAccountDirectory;
import Business.BankEmployee.BankEmployeeAccountDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.FundRaisingEmployee.FundRaisingEmployeeAccountDirectory;
import Business.Enterprise.Enterprise;
import Business.FundRaiserEvents.EventDirectory;
import Business.UserAccount.UserAccountDirectory;
import UserInterface.UserLogin;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author devma
 */
public class AdminAdvertisingLeftJPanel extends javax.swing.JPanel {
    private JPanel leftContainer;
    private JPanel rightContainer;
    private UserAccountDirectory userAccountDirectory; 
    private Enterprise enterprise; 
    private EventDirectory eventdirectory;
    private AdvertisingEmployeeAccountDirectory advertisingemployeeAccountDirectory;
    private BankEmployeeAccountDirectory bankemployeeAccountDirectory;
    private FundRaisingEmployeeAccountDirectory fundraisingemployeeAccountDirectory;
    private EcoSystem system;
    private DB4OUtil dB4OUtil;

    /**
     * Creates new form AdminAdvertisingLeftJPanel
     */
    public AdminAdvertisingLeftJPanel(JPanel leftContainer, JPanel rightContainer, UserAccountDirectory userAccountDirectory,
            Enterprise enterprise, EventDirectory eventdirectory,AdvertisingEmployeeAccountDirectory advertisingemployeeAccountDirectory,
            BankEmployeeAccountDirectory bankemployeeAccountDirectory, FundRaisingEmployeeAccountDirectory fundraisingemployeeAccountDirectory, 
            EcoSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.leftContainer = leftContainer;
        this.rightContainer= rightContainer;
        this.userAccountDirectory = userAccountDirectory;
        this.enterprise = enterprise;
        this.eventdirectory = eventdirectory;
        this.advertisingemployeeAccountDirectory = advertisingemployeeAccountDirectory;
        this.bankemployeeAccountDirectory = bankemployeeAccountDirectory;
        this.fundraisingemployeeAccountDirectory = fundraisingemployeeAccountDirectory;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setBackground(new java.awt.Color(0, 153, 153));

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Create New Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Create Organization");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Send E-mail");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnHome)
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(37, 37, 37)
                .addComponent(jButton4)
                .addGap(26, 26, 26)
                .addComponent(btnLogOut)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        rightContainer.remove(this);
        CardLayout rightLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("AdminAdvertisingWorkAreaJPanel", new AdminAdvertisingWorkAreaJPanel(rightContainer, enterprise, eventdirectory));
        rightLayout.next(rightContainer);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        rightContainer.remove(this);
        CardLayout rightLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("AdminCreateAdvertisingEmployeeJPanel", new AdminCreateAdvertisingEmployeeJPanel(rightContainer,leftContainer,enterprise, system));
        rightLayout.next(rightContainer);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        leftContainer.removeAll();
        CardLayout leftCardLayout = (CardLayout) leftContainer.getLayout();
        CardLayout righCardLayout = (CardLayout) rightContainer.getLayout();
        leftContainer.add("UserLogin", new UserLogin(leftContainer, rightContainer, 
                userAccountDirectory, eventdirectory, fundraisingemployeeAccountDirectory, 
                advertisingemployeeAccountDirectory, bankemployeeAccountDirectory, system, dB4OUtil));
        leftCardLayout.next(leftContainer);
        rightContainer.removeAll();
        rightContainer.add("blank", new JPanel());
        righCardLayout.next(rightContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        rightContainer.remove(this);
        CardLayout rightLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("AdminCreateAdvertisingOrganizationJPanel", new AdminCreateAdvertisingOrganizationJPanel(rightContainer, enterprise.getOrganizationDirectory()));
        rightLayout.next(rightContainer);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Email email = new Email();
        email.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        email.setSize(800,400);
        email.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
