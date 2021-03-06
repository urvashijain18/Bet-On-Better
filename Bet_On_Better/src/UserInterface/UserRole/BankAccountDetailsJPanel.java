/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.UserRole;

import Business.EcoSystem;
import Business.EndUser.AccountDetails;
import Business.Enterprise.Enterprise;
import Business.FundRaiserEvents.EventDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.VerificationRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author devma
 */
public class BankAccountDetailsJPanel extends javax.swing.JPanel {

    private JPanel rightContainer;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private EventDirectory eventdirectory;
     private EcoSystem system;

    /**
     * Creates new form BankAccountDetailsJPanel
     * @param rightContainer
     * @param enterprise
     * @param useraccount
     * @param eventdirectory
     * @param system
     */
    public BankAccountDetailsJPanel(JPanel rightContainer, Enterprise enterprise, UserAccount useraccount, 
            EventDirectory eventdirectory, EcoSystem system) {
        initComponents();
        this.system = system;
        this.rightContainer = rightContainer;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.eventdirectory = eventdirectory;
        txtName.setText(useraccount.getName());
        //txtBankName.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBankName = new javax.swing.JTextField();
        txtAccountNumber = new javax.swing.JTextField();
        txtRoutingNumber = new javax.swing.JTextField();
        txtSwiftCode = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtBankAddress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        txtName.setEditable(false);

        jLabel1.setText("Name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Account Details");

        jLabel3.setText("Bank Name :");

        jLabel4.setText("Account Number :");

        jLabel5.setText("Routing Number :");

        jLabel6.setText("SWIFT Code :");

        txtRoutingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoutingNumberActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setText("Submit");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel7.setText("Bank Address :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("<< Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(txtBankName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccountNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRoutingNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSwiftCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBankAddress, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSwiftCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBankAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(87, 87, 87))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRoutingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoutingNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoutingNumberActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
            for (UserAccount account : enterprise.getUserAccountDirectory().getUserAccountList()) {
                if (account.getUsername().equals(useraccount.getUsername())) {
                    AccountDetails accountDetails = new AccountDetails();
                    if(txtBankName.getText() == null || txtBankName.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please provide bank name");
                        return;
                    }
                    accountDetails.setBankName(txtBankName.getText());
                    accountDetails.setName(txtName.getText());
                    if(txtAccountNumber.getText() == null || txtAccountNumber.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please provide Account Number");
                        return;
                    }
                    if(Integer.parseInt(txtAccountNumber.getText())<0){
                        JOptionPane.showMessageDialog(null, "Account Number cannot be negative");
                        return;
                    }
                    if(txtAccountNumber.getText().length()>9){
                        JOptionPane.showMessageDialog(null, "Account Number should be of 9 digits only");
                        return;
                    }
                    accountDetails.setAccountNumber(Integer.parseInt(txtAccountNumber.getText()));
                    if(txtRoutingNumber.getText() == null || txtRoutingNumber.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please provide Routing Number");
                        return;
                    }
                    if(Integer.parseInt(txtRoutingNumber.getText())<0){
                        JOptionPane.showMessageDialog(null, "Routing Number cannot be negative");
                        return;
                    }
                    if(txtAccountNumber.getText().length()>9){
                        JOptionPane.showMessageDialog(null, "Routing Number should be of 9 digits only");
                        return;
                    }
                    accountDetails.setRoutingNumber(Integer.parseInt(txtRoutingNumber.getText()));
                    if(txtSwiftCode.getText() == null || txtSwiftCode.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please provide SWIFT Code");
                        return;
                    }
                    if(Integer.parseInt(txtSwiftCode.getText())<0){
                        JOptionPane.showMessageDialog(null, "SWIFT Code cannot be negative");
                        return;
                    }
                    if(txtSwiftCode.getText().length()>8){
                        JOptionPane.showMessageDialog(null, "SWIFT Code cannot exceed 9 digits");
                        return;
                    }
                    accountDetails.setSWIFTCode(Integer.parseInt(txtSwiftCode.getText()));
                    accountDetails.setBankAddress(txtBankAddress.getText());
                    account.setAccountDetails(accountDetails);
                    txtBankName.setText("");
                    txtAccountNumber.setText("");
                    txtRoutingNumber.setText("");
                    txtSwiftCode.setText("");
                    txtName.setText("");
                    txtBankAddress.setText("");
                }
            }
        btnSave.setEnabled(true);
        VerificationRequest workRequest = new VerificationRequest();
        workRequest.setSender(useraccount);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount useracc : organization.getUserAccountDirectory().getUserAccountList()) {
                if (useracc.getUsername().equals(useraccount.getUsername())) {
                    organization.getWorkQueue().getWorkRequestList().add(workRequest);
                }
            }
        }
        JOptionPane.showMessageDialog(null, "New Initiave created successfully.");
        rightContainer.remove(this);
        CardLayout rightCardLayout = (CardLayout) rightContainer.getLayout();
        rightContainer.add("UserHomeJPanel", new UserHomeJPanel(rightContainer, system, useraccount));
        rightCardLayout.next(rightContainer);
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBankAddress;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRoutingNumber;
    private javax.swing.JTextField txtSwiftCode;
    // End of variables declaration//GEN-END:variables
}
