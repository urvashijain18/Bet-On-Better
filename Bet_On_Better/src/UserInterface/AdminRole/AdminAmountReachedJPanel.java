/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRole;

import Business.FundRaiserEvents.Event;
import Business.FundRaiserEvents.EventDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devma
 */
public class AdminAmountReachedJPanel extends javax.swing.JPanel {
    private JPanel leftContainer;
    private JPanel rightContainer;
    private EventDirectory eventdirectory;
    /**
     * Creates new form AdminAmountReachedJPanel
     */
    public AdminAmountReachedJPanel(JPanel rightContainer, EventDirectory eventdirectory) {
        initComponents();
        this.rightContainer = rightContainer;
    this.eventdirectory = eventdirectory;
    populateAmountTable();
    }
    
    private void populateAmountTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblTargetAmountReached.getModel();
        dtm.setRowCount(0);
        for(Event event: eventdirectory.getEventDirectory()){
            if(event.getRaisedAmt().equals(event.getRequestAmt())){
           Object[] row= new Object[9]; 
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTargetAmountReached = new javax.swing.JTable();
        btnDeleteEvent = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Fund Raising Events with Target Amount Reached");

        tblTargetAmountReached.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FundRaiser Name", "Description", "Category", "Raised By", "Requested Amount", "Raised Amount", "Creation Date", "Target Date"
            }
        ));
        jScrollPane1.setViewportView(tblTargetAmountReached);

        btnDeleteEvent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDeleteEvent.setText("Delete Event");
        btnDeleteEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEventActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(263, 263, 263))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(btnDeleteEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnDeleteEvent)
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
rightContainer.remove(this);
        CardLayout leftLayout = (CardLayout) leftContainer.getLayout();
        leftLayout.previous(leftContainer);         // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEventActionPerformed
int selectedRow = tblTargetAmountReached.getSelectedRow();
    if(selectedRow >=0)
    {
    int dialogButton = JOptionPane.YES_NO_OPTION;
    int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete?", "Warning", dialogButton);
    if(dialogResult == JOptionPane.YES_OPTION){
    Event event = (Event) tblTargetAmountReached.getValueAt(selectedRow, 0);
    eventdirectory.deleteEvent(event);
    populateAmountTable();
    }
    }
    else{
    JOptionPane.showMessageDialog(null, "Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
    }         // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteEventActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteEvent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTargetAmountReached;
    // End of variables declaration//GEN-END:variables
}
