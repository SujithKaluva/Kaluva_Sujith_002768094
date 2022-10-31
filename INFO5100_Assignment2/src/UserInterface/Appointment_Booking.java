/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Data.Ecosystem;
import Model.Community;
import Model.Doctor;
import Model.Encounter;
import Model.Hospital;
import Model.Patient;
import Model.VitalSigns;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sujithkaluva
 */
public class Appointment_Booking extends javax.swing.JPanel {
Ecosystem ecoSystem = Ecosystem.getInstance();
Patient patient;
    /**
     * Creates new form Appointment_Booking
     */
    public Appointment_Booking(Patient patient) {
        initComponents();
        this.patient = patient;
        TableFilling(); 
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
        jLabel2 = new javax.swing.JLabel();
        hospital = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        doctor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Appointment Booking");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Select Hospital:");

        hospital.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hospitalItemStateChanged(evt);
            }
        });
        hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Select Doctor:");

        doctor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                doctorItemStateChanged(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Select Date:");

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hospital, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(doctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doctorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_doctorItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_doctorItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for(Doctor doctor1 : ecoSystem.getDoctorDirectory().getDoctorList()){
        if((doctor.getSelectedItem()==null?"":doctor.getSelectedItem().toString()).equals(doctor1.getFirstName())){
        VitalSigns vt = new VitalSigns(0, 0, 0, 0, 0, 0, 0);
        Encounter encounter = new Encounter(date.getDate(), "", patient, vt, doctor1); 
        //ecoSystem.getEncounterHistory().addEncounter(encounter);
         JOptionPane.showMessageDialog(this, "Appointment Booked");
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hospitalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hospitalItemStateChanged
        // TODO add your handling code here:
        DefaultComboBoxModel<String> mode1 = new DefaultComboBoxModel<String>();
        for (Doctor d : ecoSystem.getDoctorDirectory().getDoctorList()) {
            if (hospital.getSelectedItem().toString().equals(d.getHospital().getHospitalName())) {
                mode1.addElement(d.getFirstName());
            }
        }
        doctor.setModel(mode1);
    }//GEN-LAST:event_hospitalItemStateChanged

    private void hospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_hospitalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JComboBox<String> doctor;
    private javax.swing.JComboBox<String> hospital;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private void TableFilling() {
        DefaultComboBoxModel<String> mode1 = new DefaultComboBoxModel<String>();
        for (Hospital hos:ecoSystem.getHospitalList())
        { if (hos.getCommunity().getCommunity().equals(patient.getHouse().getCommunity().getCommunity()))
            
        { mode1.addElement(hos.getHospitalName());}
        }
        hospital.setModel(mode1);
        hospitalItemStateChanged(null);
    }
}