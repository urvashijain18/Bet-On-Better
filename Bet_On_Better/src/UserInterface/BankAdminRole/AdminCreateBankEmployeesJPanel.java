/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BankAdminRole;

import Business.BankEmployee.BankEmployeeAccountDirectory;
import Business.EcoSystem;
import Business.Enterprise.BankEnterprise;
import Business.Enterprise.Enterprise;
import Business.FundRaiserEvents.EventDirectory;
import Business.FundRaisingEmployee.FundRaisingEmployeeAccountDirectory;
import Business.Organization.AccountVerificationOrganization;
import Business.Organization.FundTransferOrganization;
import Business.Organization.Organization;
import Business.Role.AccVerificationBankEmployee;
import Business.Role.FundTransferBankEmployee;
import Business.Role.Role;
import UserInterface.FundRaisingAdminRole.AdminWorkAreaJPanel;
import UserInterface.UserLogin;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author devma
 */
public class AdminCreateBankEmployeesJPanel extends javax.swing.JPanel {
private JPanel rightContainer;
private JPanel leftContainer;
private BankEmployeeAccountDirectory bankemployeeAccountDirectory;
private Enterprise enterprise;
private EcoSystem system;
    /**
     * Creates new form AdminCreateBankEmployeesJPanel
     */
    public AdminCreateBankEmployeesJPanel(JPanel rightContainer,JPanel leftContainer,
            BankEmployeeAccountDirectory bankemployeeAccountDirectory, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.rightContainer = rightContainer;
        this.leftContainer = leftContainer;
        this.bankemployeeAccountDirectory = bankemployeeAccountDirectory;
        this.enterprise = enterprise;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrp = new javax.swing.ButtonGroup();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAccVerificationEmployee = new javax.swing.JRadioButton();
        btnFundTransferEmployee = new javax.swing.JRadioButton();
        btnCreate = new javax.swing.JButton();

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CREATE EMPLOYEE");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name : ");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("userName : ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password : ");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Confirm Password : ");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Role : ");

        btnGrp.add(btnAccVerificationEmployee);
        btnAccVerificationEmployee.setText("Account Verification Employee");

        btnGrp.add(btnFundTransferEmployee);
        btnFundTransferEmployee.setText("Fund Transfer Employee");

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserName)
                    .addComponent(txtName)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAccVerificationEmployee)
                        .addGap(18, 18, 18)
                        .addComponent(btnFundTransferEmployee))
                    .addComponent(passwordField)
                    .addComponent(confirmPasswordField))
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnCreate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnAccVerificationEmployee)
                    .addComponent(btnFundTransferEmployee))
                .addGap(37, 37, 37)
                .addComponent(btnCreate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        rightContainer.remove(this);
        CardLayout leftLayout = (CardLayout) rightContainer.getLayout();
        leftLayout.previous(rightContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String username = txtUserName.getText();
        String pwd = passwordField.getText();
        String rePwd = confirmPasswordField.getText();

        if (username == null || username.equals("")) {
            JOptionPane.showMessageDialog(null, "UserName cannot be empty");
            return;
        }

        if (!usernamePatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Username should be the form of xxx");
            return;
        }

        if (pwd == null || pwd.equals("")) {
            JOptionPane.showMessageDialog(null, "Password cannot be empty");
            return;
        }

        if (!userpasswordPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Password should contain 1 uppercase character, 1 lowercase character, 1 special character, 1 digit and should be of minimum length 6");
            return;
        }

        if (rePwd == null || rePwd.equals("")) {
            JOptionPane.showMessageDialog(null, "Confirm Password should match password");
            return;
        }

        if (!pwd.equals(rePwd)) {
            JOptionPane.showMessageDialog(null, "Confirm Password should match password");
            return;
        }

        if (btnGrp.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Please select a role");
            return;
        }
        
        Role role = null;
        if (btnAccVerificationEmployee.isSelected()) {
            role = new AccVerificationBankEmployee();
        }else if (btnFundTransferEmployee.isSelected()) {
            role = new FundTransferBankEmployee();
        }
        enterprise.getUserAccountDirectory().createUserAccount(username, pwd, role);
        
        bankemployeeAccountDirectory.createEmployeeAccount(username, pwd, role);
        JOptionPane.showMessageDialog(null, "Account Created Successfully");
        CardLayout rightLayout = (CardLayout) rightContainer.getLayout();        
        rightContainer.add("AdminWorkAreaJPanel", new AdminBankWorkAreaJPanel(rightContainer, system));
        rightLayout.next(rightContainer);
 }                                         

    
    private boolean usernamePatternCorrect() {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher m = p.matcher(txtUserName.getText());
        boolean b = m.matches();
        return b;
    }

    private boolean userpasswordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[&#$])[A-Za-z\\d&#$]{6,}$");
        Matcher m = p.matcher(passwordField.getText());
        boolean b = m.matches();
        return b;
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAccVerificationEmployee;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JRadioButton btnFundTransferEmployee;
    private javax.swing.ButtonGroup btnGrp;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
