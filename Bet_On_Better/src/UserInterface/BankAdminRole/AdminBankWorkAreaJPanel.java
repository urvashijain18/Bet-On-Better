/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BankAdminRole;

import Business.Enterprise.Enterprise;
import Business.FundRaiserEvents.EventDirectory;
import javax.swing.JPanel;

/**
 *
 * @author devma
 */
public class AdminBankWorkAreaJPanel extends javax.swing.JPanel {
private JPanel rightContainer;
private Enterprise enterprise;
private EventDirectory eventdirectory;
    /**
     * Creates new form AdminBankWorkAreaJPanel
     */
    public AdminBankWorkAreaJPanel(JPanel rightContainer,Enterprise enterprise,EventDirectory eventdirectory) {
        initComponents();
        this.rightContainer = rightContainer;
        this.enterprise = enterprise;
        this.eventdirectory = eventdirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
