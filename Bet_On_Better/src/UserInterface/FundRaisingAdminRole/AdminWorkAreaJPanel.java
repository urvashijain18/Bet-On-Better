/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FundRaisingAdminRole;

import Business.EcoSystem;
import Business.FundRaiserEvents.EventDirectory;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.FundRaiserEvents.Event;
import Business.Network.Network;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author @author Urvashi
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    private JPanel rightContainer;
    private EcoSystem system;
    private EventDirectory eventDirectory;

    public AdminWorkAreaJPanel(JPanel rightContainer, EcoSystem system) {
        initComponents();
        this.system = system;
        this.rightContainer = rightContainer;
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblLiveEvents.getModel();
        dtm.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                eventDirectory = enterprise.getEventDirectory();
                if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.FundRaiser.getValue())) {
                    for (Event event : eventDirectory.getEventList()) {
                        if (event.getStatus().equals("Verified")
                                || event.getStatus().equals("Approved")) {
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
        tblLiveEvents = new javax.swing.JTable();
        btnViewEvent = new javax.swing.JButton();
        btnTargetDate = new javax.swing.JButton();
        btnTargetAmount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tblLiveEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FundRaiser Name", "Description", "Category", "Raised By", "Requested Amount", "Raised Amount", "Creation Date", "Target Date"
            }
        ));
        jScrollPane1.setViewportView(tblLiveEvents);

        btnViewEvent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnViewEvent.setText("View Event");
        btnViewEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEventActionPerformed(evt);
            }
        });

        btnTargetDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTargetDate.setText("Target Date Reached");
        btnTargetDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTargetDateActionPerformed(evt);
            }
        });

        btnTargetAmount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTargetAmount.setText("Traget Amount Reached");
        btnTargetAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTargetAmountActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Live Fund Raising Events");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(282, 282, 282))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(698, 698, 698)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnViewEvent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTargetDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTargetAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnViewEvent)
                .addGap(41, 41, 41)
                .addComponent(btnTargetDate)
                .addGap(39, 39, 39)
                .addComponent(btnTargetAmount)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEventActionPerformed
        int selectedRow = tblLiveEvents.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Event event = (Event) tblLiveEvents.getValueAt(selectedRow, 0);
            ViewEventsJPanel panel = new ViewEventsJPanel(rightContainer, event);
            rightContainer.add("ViewDetailsJPanel", panel);
            CardLayout layout = (CardLayout) rightContainer.getLayout();
            layout.next(rightContainer);

        }      // TODO add your handling code here:
    }//GEN-LAST:event_btnViewEventActionPerformed

    private void btnTargetDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTargetDateActionPerformed
        AdminTargetDateJPanel panel = new AdminTargetDateJPanel(rightContainer, system);
        rightContainer.add("AdminTargetDateJPanel", panel);
        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.next(rightContainer);
    }//GEN-LAST:event_btnTargetDateActionPerformed

    private void btnTargetAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTargetAmountActionPerformed

        AdminAmountReachedJPanel panel = new AdminAmountReachedJPanel(rightContainer, system);
        rightContainer.add("AdminAmountReachedJPanel", panel);
        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.next(rightContainer);

    }//GEN-LAST:event_btnTargetAmountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTargetAmount;
    private javax.swing.JButton btnTargetDate;
    private javax.swing.JButton btnViewEvent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLiveEvents;
    // End of variables declaration//GEN-END:variables
}
