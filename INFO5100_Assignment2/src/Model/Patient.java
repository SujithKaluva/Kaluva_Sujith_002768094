/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Data.Ecosystem;
import java.util.Date;

/**
 *
 * @author sujithkaluva
 */
public class Patient extends Person {
    
    private static int patientCounter = 1;
    private String patientId;
    Ecosystem ecoSystem = Ecosystem.getInstance();

    public Patient(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, House house,String password) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, house, password);
        this.patientId = "patient"+patientCounter;
        patientCounter++;
        ecoSystem.getPatientDirectory().addPatient(this);
    }
    
}
