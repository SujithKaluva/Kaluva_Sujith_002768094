/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Data.Ecosystem;
import java.util.*;

/**
 *
 * @author sujithkaluva
 */
public class Encounter {
    
    private static int encounterCounter = 1;
    private String encounterId;
    private Date encounterDate;
    private String diagnosis;
    private Patient patient;
    private VitalSigns vitalSign;
    private Doctor doctor;
    Ecosystem ecoSystem = Ecosystem.getInstance();

    public Encounter(Date encounterDate, String diagnosis, Patient patient, VitalSigns vitalSign, Doctor doctor) {
        this.encounterDate = encounterDate;
        this.diagnosis = diagnosis;
        this.patient = patient;
        this.vitalSign = vitalSign;
        this.doctor = doctor;
        this.encounterId = "encounter"+encounterCounter;
        encounterCounter++;
        ecoSystem.getEncounterHistory().addEncounter(this);
    }

    public String getEncounterId() {
        return encounterId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }
    
    
    
}
