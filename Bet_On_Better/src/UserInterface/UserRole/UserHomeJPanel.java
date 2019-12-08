/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.UserRole;

import Business.EcoSystem;
import Business.EndUser.Donation;
import Business.Enterprise.Enterprise;
import Business.FundRaiserEvents.Event;
import Business.FundRaiserEvents.EventDirectory;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkRequest.VerificationRequest;
import UserInterface.UserLogin;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MMI
 */
public class UserHomeJPanel extends javax.swing.JPanel {

    private JPanel rightContainer;
    private EventDirectory eventdirectory;
    private UserAccount useraccount;
    private EcoSystem system;

    /**
     * Creates new form UserHomeJPanel
     */
    public UserHomeJPanel(JPanel rightContainer, EcoSystem system, UserAccount useraccount) {
        initComponents();
        this.rightContainer = rightContainer;
        this.system = system;
        this.useraccount = useraccount;
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblEventsAvailable.getModel();
        dtm.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                eventdirectory = enterprise.getEventDirectory();
                if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.FundRaiser.getValue())) {
                    for (Event event : eventdirectory.getEventList()) {
                        if (event.getStatus().equals("Verified")
                                || event.getStatus().equals("Allocated")
                                || event.getStatus().equals("Approved")
                                || event.getStatus().equals("Assigned")) {
                            Object[] row = new Object[9];
                            row[0] = event;
                            row[1] = event.getEventName();
                            row[2] = event.getDescription();
                            row[3] = event.getCategory();
                            row[4] = event.getRaisedBy();
                            row[5] = event.getRequestAmt();
                            row[6] = event.getRaisedAmt();
                            row[7] = event.getCreateDate();
                            row[8] = event.getTargetDate();
                            dtm.addRow(row);
                        }
                    }
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEventsAvailable = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();
        btnDonate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        tblEventsAvailable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fundraiser Name", "Raised By", "Target Amount", "Raised Amount", "Target Date", "Raised Date"
            }
        ));
        jScrollPane1.setViewportView(tblEventsAvailable);

        btnDetails.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDetails.setText("Details");

        btnDonate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDonate.setText("Donate");
        btnDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDonate))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetails)
                    .addComponent(btnDonate))
                .addGap(73, 73, 73))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateActionPerformed
        int selectedRow = tblEventsAvailable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Event event = (Event) tblEventsAvailable.getValueAt(selectedRow, 0);
            rightContainer.remove(this);
            Donation d = null;
            CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
            rightContainer.add("DonateJPanel", new DonateJPanel(rightContainer, event, useraccount, system, d));
            rightCardLayout.next(rightContainer);
        }
    }//GEN-LAST:event_btnDonateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnDonate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEventsAvailable;
    // End of variables declaration//GEN-END:variables
}
