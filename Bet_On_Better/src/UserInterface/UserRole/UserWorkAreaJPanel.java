/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.UserRole;

import Business.Enterprise.Enterprise;
import Business.FundRaiserEvents.EventDirectory;
import Business.UserAccount.UserAccountDirectory;
import UserInterface.UserLogin;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author @author Urvashi
 */
public class UserWorkAreaJPanel extends javax.swing.JPanel {

     private JPanel leftContainer;
    private JPanel rightContainer;
    private UserAccountDirectory userAccountDirectory; 
    private Enterprise enterprise; 
    private EventDirectory eventdirectory;
        
    /**
     * Creates new form ReceiverWorkAreaJPanel
     */
    public UserWorkAreaJPanel(JPanel leftContainer, JPanel rightContainer,UserAccountDirectory userAccountDirectory,Enterprise enterprise,EventDirectory eventdirectory) {
        initComponents();
        this.leftContainer = leftContainer;
        this.rightContainer = rightContainer;
        this.enterprise = enterprise;
        this.userAccountDirectory = userAccountDirectory;
        this.eventdirectory = eventdirectory;
        
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

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnDashboard.setText("Dashboard");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnPromote.setText("Promote");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome)
                    .addComponent(btnDashboard)
                    .addComponent(btnPromote)
                    .addComponent(btnLogOut))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addGap(49, 49, 49)
                .addComponent(btnDashboard)
                .addGap(65, 65, 65)
                .addComponent(btnPromote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        rightContainer.remove(this);
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("UserHomeJPanel", new UserHomeJPanel(leftContainer, rightContainer,  enterprise, eventdirectory));
        rightCardLayout.next(rightContainer);
        Component [] components = rightContainer.getComponents();
        for(Component c : components){
             
        }
        
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        rightContainer.remove(this);
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("UserDashboardJPanel", new UserDashboardJPanel(leftContainer, rightContainer, userAccountDirectory, enterprise, eventdirectory));
        rightCardLayout.next(rightContainer);
        Component [] components = rightContainer.getComponents();
        for(Component c : components){
//              
        }
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        leftContainer.remove(this);
        CardLayout leftCardLayout = (CardLayout) leftContainer.getLayout();
        leftContainer.add("UserLogin", new UserLogin(leftContainer, rightContainer, userAccountDirectory, enterprise, eventdirectory));
        leftCardLayout.next(leftContainer);
        Component [] components = rightContainer.getComponents();
        for(Component c : components){
        rightContainer.remove(c);        
        }
    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPromote;
    // End of variables declaration//GEN-END:variables
}
