/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BankRole;

/**
 *
 * @author @author Urvashi
 */
public class BankDashBoardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BankDashBoard
     */
    public BankDashBoardJPanel() {
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

        btnVerifRequest = new javax.swing.JButton();
        btnApprovedRequest = new javax.swing.JButton();
        btnFundAllocationRequest = new javax.swing.JButton();

        btnVerifRequest.setText("Verification Request");

        btnApprovedRequest.setText("Approved Request");
        btnApprovedRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovedRequestActionPerformed(evt);
            }
        });

        btnFundAllocationRequest.setText("Fund Allocation Request");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnVerifRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnApprovedRequest)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFundAllocationRequest)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerifRequest)
                    .addComponent(btnApprovedRequest))
                .addGap(18, 18, 18)
                .addComponent(btnFundAllocationRequest)
                .addContainerGap(171, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApprovedRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovedRequestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApprovedRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprovedRequest;
    private javax.swing.JButton btnFundAllocationRequest;
    private javax.swing.JButton btnVerifRequest;
    // End of variables declaration//GEN-END:variables
}
