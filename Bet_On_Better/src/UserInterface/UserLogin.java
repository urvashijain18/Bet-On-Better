/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.UserAccount.UserAccountDirectory;
import javax.swing.JPanel;

/**
 *
 * @author @author Urvashi
 */
public class UserLogin extends javax.swing.JPanel {
    private JPanel leftContainer;
    private JPanel rightContainer;
    private UserAccountDirectory userAccountDirectory;
    /**
     * Creates new form UserLogin
     */
    
    public UserLogin(JPanel leftContainer, JPanel rightContainer, UserAccountDirectory userAccountDirectory) {
        initComponents();
        this.leftContainer= leftContainer;
        this.rightContainer=rightContainer;
        this.userAccountDirectory=userAccountDirectory;
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
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnNewUSer = new javax.swing.JButton();

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnNewUSer.setText("New User?");
        btnNewUSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUSerActionPerformed(evt);
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
                        .addComponent(btnNewUSer)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 80, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnNewUSer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO
        String userName = txtUserName.getText();
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        boolean flag = false;
        //TravelAgent admin ;
        //Airliner airliner;
//        admin = travelAgentDirectory.authenticateAdminUser(userName, password);
//        airliner = airlinerDirectory.authenticateAirlinerUser(userName, password);
//        if (admin != null) {
//            CardLayout layout = (CardLayout) leftContainer.getLayout();
//            AccountWorkAreaJPanel accountWorkAreaJPanel = new AccountWorkAreaJPanel(leftContainer, rightContainer, airlinerDirectory, travelAgentDirectory, admin);
//            leftContainer.add("AccountWorkAreaJPanel", accountWorkAreaJPanel);
//            layout.next(leftContainer);
//            flag = true;
//        }else if (airliner != null) {
//            CardLayout layout = (CardLayout) leftContainer.getLayout();
//            AirlinerWorkAreaJPanel airlinerWorkAreaJPanel = new AirlinerWorkAreaJPanel(leftContainer, rightContainer, airlinerDirectory, travelAgentDirectory, airliner);
//            leftContainer.add("AirlinerWorkAreaJPanel", airlinerWorkAreaJPanel);
//            layout.next(leftContainer);
//            flag = true;
//        }
//        if(!flag){
//            JOptionPane.showMessageDialog(null, "Invalid UserName/Password");
//            return;
//        }
//        btnLogin.setEnabled(false);
//        btnNewUSer.setEnabled(false);
//        txtUserName.setEnabled(false);
//        txtPassword.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnNewUSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUSerActionPerformed
        // TODO add your handling code here:
//        CardLayout layout = (CardLayout) rightContainer.getLayout();
//        CreateUserAccount createUserAccount = new CreateUserAccount(leftContainer, rightContainer);
//        rightContainer.add("CreateUserAccount", createUserAccount);
//        layout.next(rightContainer);
//        refreshLeftContainer();
    }//GEN-LAST:event_btnNewUSerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNewUSer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
