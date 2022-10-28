/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Data.Ecosystem;

/**
 *
 * @author sujithkaluva
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    
   Ecosystem ecoSys = Ecosystem.getInstance();
           
    
    public Home() {
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

        mainPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signUpBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        userRole = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setBackground(new java.awt.Color(102, 204, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/hospital.png"))); // NOI18N

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel3)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rightPanel.setBackground(new java.awt.Color(204, 204, 204));
        rightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(153, 204, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setToolTipText("Username");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        rightPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 252, 32));

        jPasswordField1.setBackground(new java.awt.Color(153, 204, 255));
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setToolTipText("Password");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        rightPanel.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 252, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/padlock.png"))); // NOI18N
        rightPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/user.png"))); // NOI18N
        rightPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 30, 30));

        signUpBtn.setBackground(new java.awt.Color(0, 102, 204));
        signUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        signUpBtn.setText("Sign Up");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        rightPanel.add(signUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        loginBtn.setBackground(new java.awt.Color(0, 102, 204));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        rightPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        userRole.setBackground(new java.awt.Color(153, 204, 255));
        userRole.setForeground(new java.awt.Color(0, 0, 0));
        userRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctor", "Community Admin", "Hospital Admin", "System Admin" }));
        rightPanel.add(userRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 163, 250, 30));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
                                                                                                                // TODO add your handling code here:
        System.out.println("UserInterface.Home.signUpBtnActionPerformed()");
        CreatePatientPanel createPatientCmp = new CreatePatientPanel();
        this.setContentPane(createPatientCmp);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JComboBox<String> userRole;
    // End of variables declaration//GEN-END:variables
}
