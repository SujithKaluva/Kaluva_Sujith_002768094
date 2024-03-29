/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Model.Person;

/**
 *
 * @author sujithkaluva
 */
public class CommunityAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminWorkArea
     */
    public CommunityAdminWorkArea(Person commAdmin) {
        initComponents();
        this.commAdminName.setText(commAdmin.getFirstName()+" "+commAdmin.getLastName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        logOutAdmin = new javax.swing.JButton();
        cityPanel = new javax.swing.JButton();
        communityPanel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        commAdminName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        logOutAdmin.setBackground(new java.awt.Color(204, 204, 204));
        logOutAdmin.setForeground(new java.awt.Color(0, 0, 0));
        logOutAdmin.setText("Logout");
        logOutAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutAdminActionPerformed(evt);
            }
        });

        cityPanel.setBackground(new java.awt.Color(255, 255, 204));
        cityPanel.setForeground(new java.awt.Color(0, 0, 0));
        cityPanel.setText("Cities");
        cityPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityPanelActionPerformed(evt);
            }
        });

        communityPanel.setBackground(new java.awt.Color(255, 255, 204));
        communityPanel.setForeground(new java.awt.Color(0, 0, 0));
        communityPanel.setText("Communities");
        communityPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOutAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(communityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(communityPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cityPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutAdmin)
                .addGap(14, 14, 14))
        );

        mainPanel.setLeftComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        commAdminName.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        commAdminName.setForeground(new java.awt.Color(0, 51, 102));
        commAdminName.setText("Community Admin");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Hello,");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(commAdminName))
                .addGap(167, 167, 167))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commAdminName)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        mainPanel.setRightComponent(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logOutAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutAdminActionPerformed
        // TODO add your handling code here:

        Home home = new Home();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        home.setVisible(true);
    }//GEN-LAST:event_logOutAdminActionPerformed

    private void cityPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityPanelActionPerformed
        // TODO add your handling code here:
        CitiesPanel citypanel = new CitiesPanel();
        mainPanel.setRightComponent(citypanel);
    }//GEN-LAST:event_cityPanelActionPerformed

    private void communityPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityPanelActionPerformed
        // TODO add your handling code here:
        CommunityPanelForCommAdmin commpanel = new CommunityPanelForCommAdmin();
        mainPanel.setRightComponent(commpanel);
    }//GEN-LAST:event_communityPanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cityPanel;
    private javax.swing.JLabel commAdminName;
    private javax.swing.JButton communityPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logOutAdmin;
    private javax.swing.JSplitPane mainPanel;
    // End of variables declaration//GEN-END:variables
}
