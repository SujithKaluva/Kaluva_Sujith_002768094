/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userInterface;

/**
 *
 * @author sujithkaluva
 */
public class EmployeeForm extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeForm
     */
    public EmployeeForm() {
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

        mainHeader = new javax.swing.JLabel();
        createEmployeeBtn = new javax.swing.JButton();
        viewEmployeeBtn = new javax.swing.JButton();
        updateEmployeeBtn = new javax.swing.JButton();
        deleteEmployeeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));

        mainHeader.setBackground(new java.awt.Color(255, 255, 204));
        mainHeader.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        mainHeader.setForeground(new java.awt.Color(255, 255, 204));
        mainHeader.setText("Employee Management System");

        createEmployeeBtn.setBackground(new java.awt.Color(0, 153, 204));
        createEmployeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        createEmployeeBtn.setText("Create Employee");
        createEmployeeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEmployeeBtnActionPerformed(evt);
            }
        });

        viewEmployeeBtn.setBackground(new java.awt.Color(0, 153, 204));
        viewEmployeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewEmployeeBtn.setText("View Employee");
        viewEmployeeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmployeeBtnActionPerformed(evt);
            }
        });

        updateEmployeeBtn.setBackground(new java.awt.Color(0, 153, 204));
        updateEmployeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateEmployeeBtn.setText("Update Employee");
        updateEmployeeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeeBtnActionPerformed(evt);
            }
        });

        deleteEmployeeBtn.setBackground(new java.awt.Color(0, 153, 204));
        deleteEmployeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteEmployeeBtn.setText("Delete Employee");
        deleteEmployeeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(227, Short.MAX_VALUE)
                        .addComponent(updateEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteEmployeeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewEmployeeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(237, 237, 237))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(mainHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(mainHeader)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createEmployeeBtn)
                    .addComponent(viewEmployeeBtn))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteEmployeeBtn)
                    .addComponent(updateEmployeeBtn))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEmployeeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createEmployeeBtnActionPerformed

    private void viewEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmployeeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewEmployeeBtnActionPerformed

    private void updateEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateEmployeeBtnActionPerformed

    private void deleteEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteEmployeeBtnActionPerformed

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
    private javax.swing.JButton createEmployeeBtn;
    private javax.swing.JButton deleteEmployeeBtn;
    private javax.swing.JLabel mainHeader;
    private javax.swing.JButton updateEmployeeBtn;
    private javax.swing.JButton viewEmployeeBtn;
    // End of variables declaration//GEN-END:variables
}
