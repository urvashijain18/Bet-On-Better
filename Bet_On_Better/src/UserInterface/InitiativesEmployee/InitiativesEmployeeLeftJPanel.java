/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.InitiativesEmployee;

import Business.AdvertisingEmployee.AdvertisingEmployeeAccountDirectory;
import Business.BankEmployee.BankEmployeeAccountDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FundRaisingEmployee.FundRaisingEmployeeAccountDirectory;
import Business.FundRaiserEvents.EventDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.CreateEventByOrganizationEmployeeDirectory;
import UserInterface.UserLogin;
import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author MMI
 */
public class InitiativesEmployeeLeftJPanel extends javax.swing.JPanel {

    private JPanel leftContainer;
    private JPanel rightContainer;
    private UserAccountDirectory userAccountDirectory; 
    private EventDirectory eventdirectory;
    private BankEmployeeAccountDirectory bankemployeeAccountDirectory;
    private FundRaisingEmployeeAccountDirectory fundraisingemployeeAccountDirectory;
    private AdvertisingEmployeeAccountDirectory advertisingemployeeAccountDirectory;
    private EcoSystem system;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private Enterprise enterprise;
     private CreateEventByOrganizationEmployeeDirectory createEventByOrganizationEmployeeDirectory;
    
    /**
     * Creates new form FundraisingEmployeeRightJPanel
     */

    

    public InitiativesEmployeeLeftJPanel(JPanel leftContainer, JPanel rightContainer, UserAccount account, UserAccountDirectory userAccountDirectory, EventDirectory eventdirectory, BankEmployeeAccountDirectory bankemployeeAccountDirectory, FundRaisingEmployeeAccountDirectory fundraisingemployeeAccountDirectory, AdvertisingEmployeeAccountDirectory advertisingemployeeAccountDirectory, EcoSystem business, DB4OUtil dB4OUtil, Enterprise enterprise) {
     initComponents();
       this.leftContainer = leftContainer;
        this.rightContainer = rightContainer;
        this.userAccountDirectory = userAccountDirectory;
        this.eventdirectory = eventdirectory;
        this.bankemployeeAccountDirectory = bankemployeeAccountDirectory;
        this.advertisingemployeeAccountDirectory = advertisingemployeeAccountDirectory;
        this.fundraisingemployeeAccountDirectory = fundraisingemployeeAccountDirectory;
        this.createEventByOrganizationEmployeeDirectory =  new CreateEventByOrganizationEmployeeDirectory();
        this.dB4OUtil = dB4OUtil;
        this.enterprise = enterprise;
        this.system = business;
        this.userAccount = account;    
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
        btnPendingRequests = new javax.swing.JButton();
        btnApprovedRequests = new javax.swing.JButton();
        btnNewRequest = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnPendingRequests.setText("Pending Requests");
        btnPendingRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendingRequestsActionPerformed(evt);
            }
        });

        btnApprovedRequests.setText("Approved Requests");
        btnApprovedRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovedRequestsActionPerformed(evt);
            }
        });

        btnNewRequest.setText("Create New Work Request");
        btnNewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRequestActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome)
                    .addComponent(btnPendingRequests)
                    .addComponent(btnApprovedRequests)
                    .addComponent(btnNewRequest)
                    .addComponent(btnLogout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnHome)
                .addGap(51, 51, 51)
                .addComponent(btnPendingRequests)
                .addGap(53, 53, 53)
                .addComponent(btnApprovedRequests)
                .addGap(53, 53, 53)
                .addComponent(btnNewRequest)
                .addGap(47, 47, 47)
                .addComponent(btnLogout)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        rightContainer.remove(this);
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("InitiativesEmployeeHomePanel", new InitiativesEmployeeHomePanel(rightContainer, eventdirectory));
        rightCardLayout.next(rightContainer);    
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPendingRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendingRequestsActionPerformed
        rightContainer.remove(this);
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("InitiativesEmployeePendingRequests", new InitiativesEmployeePendingRequests(rightContainer, enterprise, userAccount));
        rightCardLayout.next(rightContainer);  
    }//GEN-LAST:event_btnPendingRequestsActionPerformed

    private void btnApprovedRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovedRequestsActionPerformed
        // TODO add your handling code here:
        rightContainer.remove(this);
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("InitiativeEmployeeApprovedRequests", new InitiativeEmployeeApprovedRequests(rightContainer, eventdirectory));
        rightCardLayout.next(rightContainer); 
        
    }//GEN-LAST:event_btnApprovedRequestsActionPerformed

    private void btnNewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRequestActionPerformed
        // TODO add your handling code here:
        rightContainer.remove(this);
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("Test", new InitiativesEmployeeNewWorkRequest(rightContainer,eventdirectory,createEventByOrganizationEmployeeDirectory,enterprise,userAccount));
         rightCardLayout.next(rightContainer);
        
    }//GEN-LAST:event_btnNewRequestActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        leftContainer.removeAll();
        CardLayout leftCardLayout = (CardLayout) leftContainer.getLayout();
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        leftContainer.add("UserLogin", new UserLogin(leftContainer, rightContainer, 
                userAccountDirectory, eventdirectory, fundraisingemployeeAccountDirectory, 
                advertisingemployeeAccountDirectory, bankemployeeAccountDirectory, system, dB4OUtil));
        leftCardLayout.next(leftContainer);
        rightContainer.removeAll();
        rightContainer.add("blank", new JPanel());
        rightCardLayout.next(rightContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprovedRequests;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNewRequest;
    private javax.swing.JButton btnPendingRequests;
    // End of variables declaration//GEN-END:variables
}
