/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.AdvertisingEmployee.AdvertisingEmployeeAccountDirectory;
import Business.BankEmployee.BankEmployeeAccountDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.FundRaisingEmployee.FundRaisingEmployeeAccountDirectory;
import Business.Enterprise.Enterprise;
import Business.FundRaiserEvents.EventDirectory;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;

/**
 *
 * @author Urvashi
 */
public class MainFrame extends javax.swing.JFrame {
    private UserAccountDirectory userAccountDirectory;
    private Enterprise enterprise;
    private EventDirectory eventdirectory;
    private FundRaisingEmployeeAccountDirectory fundraisingemployeeAccountDirectory;
    private AdvertisingEmployeeAccountDirectory advertisingemployeeAccountDirectory;
    private BankEmployeeAccountDirectory bankemployeeAccountDirectory;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
        this.userAccountDirectory = new UserAccountDirectory();
        this.eventdirectory = new EventDirectory();
        this.fundraisingemployeeAccountDirectory = new FundRaisingEmployeeAccountDirectory();
        this.bankemployeeAccountDirectory = new BankEmployeeAccountDirectory();
        CardLayout leftLayout = (CardLayout) leftContainer.getLayout();
        UserLogin userLogin = new UserLogin(leftContainer, rightContainer, userAccountDirectory, eventdirectory, 
                fundraisingemployeeAccountDirectory, advertisingemployeeAccountDirectory, bankemployeeAccountDirectory,
                system, dB4OUtil);
        leftContainer.add("UserLogin", userLogin);
        leftLayout.next(leftContainer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftContainer = new javax.swing.JPanel();
        rightContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setLeftComponent(leftContainer);

        rightContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftContainer;
    private javax.swing.JPanel rightContainer;
    // End of variables declaration//GEN-END:variables
}
