/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author sujithkaluva
 */
public class Ecosystem {
    
    public static Ecosystem business;
    private PersonDirectory personDirectory;
    private PatientDirectory patientDirectory;
    private EncounterHistory encounterHistory;
    private DoctorDirectory doctorDirectory;
    private SystemAdminDirectory systemAdminDirectory;

    public Ecosystem(){
        personDirectory = new PersonDirectory();
        patientDirectory = new PatientDirectory();
        encounterHistory = new EncounterHistory();
        doctorDirectory = new DoctorDirectory();
        systemAdminDirectory = new SystemAdminDirectory();
    }

    public SystemAdminDirectory getSystemAdminDirectory() {
        return systemAdminDirectory;
    }

    public void setSystemAdminDirectory(SystemAdminDirectory systemAdminDirectory) {
        this.systemAdminDirectory = systemAdminDirectory;
    }
    
    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }
    
    public static Ecosystem getBusiness() {
        return business;
    }

    public static void setBusiness(Ecosystem business) {
        Ecosystem.business = business;
    }
    
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    
    
}
