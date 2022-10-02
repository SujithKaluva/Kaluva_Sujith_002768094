/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userInterface;
import java.util.*;
import employeeDetails.EmployeeProfile;
/**
 *
 * @author sujithkaluva
 */
public class EmployeeForm extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeForm
     */
    EmployeeProfile emp;
    public EmployeeForm() {
        initComponents();
        emp = new EmployeeProfile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JSplitPane();
        rightPanel = new javax.swing.JPanel();
        mainLabel = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        createEmpBtn = new javax.swing.JButton();
        editEmpBtn = new javax.swing.JButton();
        deleteEmpBtn = new javax.swing.JButton();
        empDirectoryBtn = new javax.swing.JButton();
        searchEmpBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(102, 102, 102));

        rightPanel.setBackground(new java.awt.Color(51, 51, 51));

        mainLabel.setBackground(new java.awt.Color(255, 255, 255));
        mainLabel.setFont(new java.awt.Font("Charter", 0, 18)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainLabel.setText("Employee Management System");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(mainLabel)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        mainPanel.setRightComponent(rightPanel);

        leftPanel.setBackground(new java.awt.Color(204, 204, 204));
        leftPanel.setForeground(new java.awt.Color(0, 204, 0));

        createEmpBtn.setBackground(new java.awt.Color(0, 153, 204));
        createEmpBtn.setForeground(new java.awt.Color(255, 255, 255));
        createEmpBtn.setText("Create Employee");
        createEmpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEmpBtnActionPerformed(evt);
            }
        });

        editEmpBtn.setBackground(new java.awt.Color(0, 153, 204));
        editEmpBtn.setForeground(new java.awt.Color(255, 255, 255));
        editEmpBtn.setText("Edit Employee");
        editEmpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmpBtnActionPerformed(evt);
            }
        });

        deleteEmpBtn.setBackground(new java.awt.Color(0, 153, 204));
        deleteEmpBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteEmpBtn.setText("Delete Employee");
        deleteEmpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        empDirectoryBtn.setBackground(new java.awt.Color(0, 153, 204));
        empDirectoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        empDirectoryBtn.setText("Employee Directory");
        empDirectoryBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empDirectoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empDirectoryBtnActionPerformed(evt);
            }
        });

        searchEmpBtn.setBackground(new java.awt.Color(0, 153, 204));
        searchEmpBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchEmpBtn.setText("Search Employee");
        searchEmpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empDirectoryBtn)
                    .addComponent(deleteEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(createEmpBtn)
                .addGap(18, 18, 18)
                .addComponent(editEmpBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteEmpBtn)
                .addGap(18, 18, 18)
                .addComponent(empDirectoryBtn)
                .addGap(18, 18, 18)
                .addComponent(searchEmpBtn)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        mainPanel.setLeftComponent(leftPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmpBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editEmpBtnActionPerformed

    private void empDirectoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empDirectoryBtnActionPerformed
        // TODO add your handling code here:
        EmployeeDirectory empDir = new EmployeeDirectory();
        mainPanel.setRightComponent(empDir);
    }//GEN-LAST:event_empDirectoryBtnActionPerformed

    private void createEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEmpBtnActionPerformed
        // TODO add your handling code here:
        createEmployee createEmp = new createEmployee(emp);
        mainPanel.setRightComponent(createEmp);
    }//GEN-LAST:event_createEmpBtnActionPerformed

    private void searchEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmpBtnActionPerformed
        // TODO add your handling code here:
        searchEmployee searchPane = new searchEmployee();
        mainPanel.setRightComponent(searchPane);
    }//GEN-LAST:event_searchEmpBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createEmpBtn;
    private javax.swing.JButton deleteEmpBtn;
    private javax.swing.JButton editEmpBtn;
    private javax.swing.JButton empDirectoryBtn;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JSplitPane mainPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton searchEmpBtn;
    // End of variables declaration//GEN-END:variables
}
