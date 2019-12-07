/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FundraisingEventEmployee;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FundRaiserEvents.EventDirectory;
import Business.Role.Role;
import Business.WorkQueue.CreateEventByOrganizationEmployeeDirectory;
import Business.WorkRequest.CreateEventByOrganizationEmployee;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.UserAccount.UserAccount;


/**
 *
 * @author MMI
 */
public class FundraisingEventAssignedWorkPanel extends javax.swing.JPanel {

     private JPanel rightContainer;
    private EcoSystem system;
    private EventDirectory eventDirectory;
    private CreateEventByOrganizationEmployeeDirectory createEventByOrganizationEmployeeDirectory;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form FundraisingEventAssignedWorkPanel
     */
    

  

    FundraisingEventAssignedWorkPanel(JPanel rightContainer, Enterprise enterprise, UserAccount userAccount) {
    initComponents();   
     this.rightContainer = rightContainer;
     this.enterprise = enterprise;
     this.userAccount = userAccount;
 
    populateTable();    
    
    jLabel2.setVisible(false);
    txtRequestAmt.setVisible(false);
    btnSet.setVisible(false);
           
    
    }

    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblAssignedRequest.getModel();
        model.setRowCount(0);
       
        for (CreateEventByOrganizationEmployee cs : enterprise.getCreateEventByOrganizationEmployeeDirectory().getCreateEventByOrganizationEmployeeList()) {
            if(cs.getReceiver()!=null){
            if(userAccount.getUsername().equals(cs.getReceiver().getUsername())){
            Object[] row = new Object[9];
            row[0] = cs;
            row[1] = cs.getTitle();
            row[2] = cs.getDescription();
            row[3] = cs.getSender();
            row[4] = cs.getSender().getRole();
            row[5] = cs.getSender().getCategory();
            row[6] = cs.getDeadline();
            row[7] = cs.getLocation();
            row[8] = ' ';

            model.addRow(row);
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
        tblAssignedRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtRequestAmt = new javax.swing.JTextField();
        btnSet = new javax.swing.JButton();

        tblAssignedRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Event Name", "Description", "Created By", "Role", "Category", "Date of Event", "Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAssignedRequest);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Assigned Work Requests");

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jLabel2.setText("Request Amount :");

        btnSet.setText("Set");
        btnSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(331, 331, 331)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(194, 194, 194)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtRequestAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnApprove)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReject)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(btnSet))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnReject))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRequestAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSet)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAssignedRequest.getSelectedRow();
        Role role = null;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            CreateEventByOrganizationEmployee workrequest = (CreateEventByOrganizationEmployee) tblAssignedRequest.getValueAt(selectedRow, 0);
            role = workrequest.getSender().getRole();
        }
        if (role.equals(Role.RoleType.User)){
            // ADD this row in event directory
            
        } else{
            
        jLabel2.setVisible(true);
        txtRequestAmt.setVisible(true);
        btnSet.setVisible(true);
            
        
              
        }
           
//            
//        rightContainer.remove(this);
//        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
//        rightContainer.add("FundraisingEventAssignedWorkPanel", new FundraisingEventAssignedWorkPanel(rightContainer, enterprise, userAccount));
//        rightCardLayout.next(rightContainer);
            
        

    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAssignedRequest.getSelectedRow();
        CreateEventByOrganizationEmployee workrequest = (CreateEventByOrganizationEmployee) tblAssignedRequest.getValueAt(selectedRow, 0);
        workrequest.setSender(userAccount);
        workrequest.setRequestedAtm(Integer.parseInt(txtRequestAmt.getText()));
        
    }//GEN-LAST:event_btnSetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnSet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAssignedRequest;
    private javax.swing.JTextField txtRequestAmt;
    // End of variables declaration//GEN-END:variables
}
