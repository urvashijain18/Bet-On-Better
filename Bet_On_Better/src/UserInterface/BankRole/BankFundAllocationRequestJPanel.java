/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BankRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FundRaiserEvents.EventDirectory;
import Business.Network.Network;
import Business.Role.FundRaisingEmployee;
import Business.Role.UserRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkRequest.CreateEventByOrganizationEmployee;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Urvashi
 */
public class BankFundAllocationRequestJPanel extends javax.swing.JPanel {

    private JPanel rightContainer;
    private UserAccountDirectory userAccountDirectory;
    private Enterprise enterprise;
    private EventDirectory eventdirectory;
    private UserAccount userAccount;
    private EcoSystem system;

    /**
     * Creates new form BankFundAllocationRequestJPanel
     */
    BankFundAllocationRequestJPanel(JPanel rightContainer, UserAccount userAccount, EcoSystem system, Enterprise enterprise, EventDirectory eventdirectory) {
        initComponents();
        this.rightContainer = rightContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.eventdirectory = eventdirectory;
        this.system = system;

        populateTable();

    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblFundAllocationRecords.getModel();
        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getCreateEventByOrganizationEmployeeDirectory() != null) {
                    for (CreateEventByOrganizationEmployee cs : enterprise.getCreateEventByOrganizationEmployeeDirectory().getCreateEventByOrganizationEmployeeList()) {
                        if (cs.getSender().getRole().getClass().equals(FundRaisingEmployee.class) || (cs.getSender().getRole().getClass().equals(UserRole.class))) {
                            Object[] row = new Object[9];
                            row[0] = cs;
                            row[1] = cs.getSender();
                            row[2] = cs.getSender().getRole().toString();
                            row[3] = cs.getSender().getCategory();
                            row[4] = cs.getStatus();
                            row[5] = cs.getDeadline();
                            row[6] = ' ';
                            row[7] = cs.getRequestedAtm();
                            row[8] = cs.getTargetAtm();

                            model.addRow(row);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFundAllocationRecords = new javax.swing.JTable();
        btnActionTaken = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FUND ALLOCATION REQUESTS ");

        tblFundAllocationRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Created By", "Role", "Category", "Status", "Request Date", "Allocation Date", "Amount Requested", "Amount Allocated"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFundAllocationRecords);

        btnActionTaken.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActionTaken.setText("Take Action");
        btnActionTaken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionTakenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(btnActionTaken)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActionTaken)
                .addContainerGap(303, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionTakenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionTakenActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFundAllocationRecords.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            CreateEventByOrganizationEmployee workrequest = (CreateEventByOrganizationEmployee) tblFundAllocationRecords.getValueAt(selectedRow, 0);
            workrequest.setStatus("Approved By Bank Employee");
            
            JOptionPane.showConfirmDialog(null, "Request has been approved");
            rightContainer.removeAll();
            CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
            rightContainer.add("BankFundAllocationJPanel", new BankFundAllocationJPanel(rightContainer, workrequest, userAccount));
            rightCardLayout.next(rightContainer);
        }

    }//GEN-LAST:event_btnActionTakenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActionTaken;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFundAllocationRecords;
    // End of variables declaration//GEN-END:variables
}
