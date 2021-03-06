/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.UserRole;

import Business.AdvertisingEmployee.AdvertisingEmployeeAccountDirectory;
import Business.BankEmployee.BankEmployeeAccountDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.FundRaisingEmployee.FundRaisingEmployeeAccountDirectory;
import Business.Enterprise.Enterprise;
import Business.FundRaiserEvents.EventDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import UserInterface.UserLogin;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author @author Urvashi
 */
public class UserWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel leftContainer;
    private JPanel rightContainer;
    private UserAccountDirectory userAccountDirectory; 
    private EventDirectory eventdirectory;
    private BankEmployeeAccountDirectory bankemployeeAccountDirectory;
    private FundRaisingEmployeeAccountDirectory fundraisingemployeeAccountDirectory;
    private AdvertisingEmployeeAccountDirectory advertisingemployeeAccountDirectory;
    private EcoSystem system;
    private DB4OUtil dB4OUtil;
    private UserAccount useraccount;
    private Enterprise enterprise;
        
    /**
     * Creates new form ReceiverWorkAreaJPanel
     */
    public UserWorkAreaJPanel(JPanel leftContainer, JPanel rightContainer,UserAccountDirectory userAccountDirectory,
            EventDirectory eventdirectory, BankEmployeeAccountDirectory bankemployeeAccountDirectory,            
            FundRaisingEmployeeAccountDirectory fundraisingemployeeAccountDirectory, 
            AdvertisingEmployeeAccountDirectory advertisingemployeeAccountDirectory, EcoSystem system,
            DB4OUtil dB4OUtil,UserAccount useraccount, Enterprise enterprise) {
        initComponents();
        this.leftContainer = leftContainer;
        this.rightContainer = rightContainer;
        this.userAccountDirectory = userAccountDirectory;
        this.eventdirectory = eventdirectory;
        this.bankemployeeAccountDirectory = bankemployeeAccountDirectory;
        this.advertisingemployeeAccountDirectory = advertisingemployeeAccountDirectory;
        this.fundraisingemployeeAccountDirectory = fundraisingemployeeAccountDirectory;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        this.useraccount = useraccount;
        this.enterprise = enterprise;
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHome = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnPromote = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnDashboard.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnPromote.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPromote.setText("Promote");
        btnPromote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromoteActionPerformed(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDashboard)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPromote, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addGap(57, 57, 57)
                .addComponent(btnDashboard)
                .addGap(73, 73, 73)
                .addComponent(btnPromote)
                .addGap(72, 72, 72)
                .addComponent(btnLogOut)
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        rightContainer.remove(this);
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("UserHomeJPanel", new UserHomeJPanel(rightContainer, system, useraccount));
        rightCardLayout.next(rightContainer);        
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        rightContainer.remove(this);
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("UserDashboardJPanel", new UserDashboardJPanel(leftContainer, rightContainer, 
                userAccountDirectory, eventdirectory, useraccount, system, enterprise));
        rightCardLayout.next(rightContainer);
    }//GEN-LAST:event_btnDashboardActionPerformed

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

    private void btnPromoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPromoteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPromote;
    // End of variables declaration//GEN-END:variables
}
