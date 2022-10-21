/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author sujithkaluva
 */
public class Patient extends Person {
    
    private static int patientCounter = 1;
    private String patientId;

    public Patient(String patientId, String personId, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, House house) {
        super(personId, firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, house);
        this.patientId = patientId;
    }
    
}
