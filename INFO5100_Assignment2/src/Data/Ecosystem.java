/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Model.City;
import Model.Community;
import Model.Doctor;
import Model.Hospital;
import Model.House;
import Model.Patient;
import Model.Person;
import Model.Encounter;
import Model.VitalSigns;
import java.util.*;

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
    private HospitalAdminDirectory hospitalAdminDirectory;
    private CommunityAdminDirectory communityAdminDirectory;
    private ArrayList<City> cityList;
    private ArrayList<Community> communityList;
    private ArrayList<Hospital> hospitalList;

    //For Combobox
    private ArrayList<String> cityListComboBox;
    private ArrayList<String> communityListComboBox;
    private ArrayList<String> hospitalListComboBox;

    public Ecosystem() {
        personDirectory = new PersonDirectory();
        patientDirectory = new PatientDirectory();
        encounterHistory = new EncounterHistory();
        doctorDirectory = new DoctorDirectory();
        systemAdminDirectory = new SystemAdminDirectory();
        hospitalAdminDirectory = new HospitalAdminDirectory();
        communityAdminDirectory = new CommunityAdminDirectory();
        cityList = new ArrayList<>();
        communityList = new ArrayList<>();
        hospitalList = new ArrayList<>();

        cityListComboBox = new ArrayList<>();
        cityListComboBox.add("");
        communityListComboBox = new ArrayList<>();
        communityListComboBox.add("");
        hospitalListComboBox = new ArrayList<>();
        hospitalListComboBox.add("");

        //systemConfiguration();
    }

    public void systemConfiguration() {

        City city1 = new City("Boston");
        City city2 = new City("New York");
        this.cityList.add(city1);
        this.cityListComboBox.add(city1.getCity());
        this.cityList.add(city2);
        this.cityListComboBox.add(city2.getCity());

        Community community1 = new Community();
        community1.setCity(city1);
        community1.setCommunity("Roxbury");
        Community community2 = new Community();
        community2.setCity(city1);
        community2.setCommunity("Jamaica Plain");
        Community community3 = new Community();
        community3.setCity(city2);
        community3.setCommunity("Worchester");
        Community community4 = new Community();
        community4.setCity(city2);
        community4.setCommunity("Times Square");
        this.addCommunity(community1);
        this.addCommunity(community2);
        this.addCommunity(community3);
        this.addCommunity(community4);
        this.getCommunityListComboBox().add(community1.getCommunity());
        this.getCommunityListComboBox().add(community2.getCommunity());
        this.getCommunityListComboBox().add(community3.getCommunity());
        this.getCommunityListComboBox().add(community4.getCommunity());

        Hospital hosp1 = new Hospital();
        hosp1.setHospitalName("Roxbury Public Hospital");
        hosp1.setPhoneNumber(9876543210l);
        hosp1.setCity(community1.getCity());
        hosp1.setCommunity(community1);
        hosp1.setAddress("Day Street, 1");
        this.hospitalList.add(hosp1);
        this.hospitalListComboBox.add(hosp1.getHospitalName());

        Hospital hosp2 = new Hospital();
        hosp2.setHospitalName("Northeastern Hospital");
        hosp2.setPhoneNumber(9876543211l);
        hosp2.setCity(community1.getCity());
        hosp2.setCommunity(community1);
        hosp2.setAddress("John Street, 1");
        this.hospitalList.add(hosp2);
        this.hospitalListComboBox.add(hosp2.getHospitalName());

        Hospital hosp3 = new Hospital();
        hosp3.setHospitalName("JP Hospital");
        hosp3.setPhoneNumber(9876543212l);
        hosp3.setCity(community2.getCity());
        hosp3.setCommunity(community2);
        hosp3.setAddress("Mike Street, 1");
        this.hospitalList.add(hosp3);
        this.hospitalListComboBox.add(hosp3.getHospitalName());

        Hospital hosp4 = new Hospital();
        hosp4.setHospitalName("George Hospital");
        hosp4.setPhoneNumber(9876543213l);
        hosp4.setCity(community3.getCity());
        hosp4.setCommunity(community3);
        hosp4.setAddress("Ray Street, 1");
        this.hospitalList.add(hosp4);
        this.hospitalListComboBox.add(hosp4.getHospitalName());

        House house1 = new House();
        house1.setAddressLine1("75 saint alphonsus");
        house1.setAddressLine2("307");
        house1.setState("MA");
        house1.setCity(community1.getCity());
        house1.setZipCode(02120);
        house1.setCommunity(community1);

        House house2 = new House();
        house2.setAddressLine1("95 saint peters");
        house2.setAddressLine2("300");
        house2.setState("MA");
        house2.setCity(community2.getCity());
        house2.setZipCode(02120);
        house2.setCommunity(community2);

        Date dateVal = new Date();
        Patient pat = new Patient("Sujith", "Kaluva", dateVal, "sujith@gmail.com", "Male", 9876543211l, house1, "sujith");
        Patient pat1 = new Patient("Saritha", "Kaluva", dateVal, "saritha@gmail.com", "Female", 9111111111l, house2, "saritha");

        Doctor s = new Doctor("Cardiologist", "MBBS", 15, hosp1, "Jonathan", "Smith", dateVal, "jonathan@gmail.com", "Male", 4444444444l, house1, "Jonathan");
        Doctor s1 = new Doctor("Neurologist", "MBBS", 10, hosp2, "Taylor", "Swift", dateVal, "taylor@gmail.com", "Female", 1345678902l, house2, "Taylor");
        business.doctorDirectory.addDoctor(s);
        business.doctorDirectory.addDoctor(s1);

        VitalSigns vt = new VitalSigns(100, 100, 180, 180, 100, 100, 180);
        Encounter en = new Encounter(dateVal, "Amnesia", pat, vt, s);
        Encounter en1 = new Encounter(dateVal, "Heart Attack", pat1,vt, s1);
        Person p = new Person("Comm", "Admin", dateVal, "commadmin@gmail.com", "Female",1345678902l,house1, "commadmin" );
        business.getCommunityAdminDirectory().addPasswordManager(p.getEmailId(), p.getPassword());
        Person p1 = new Person("Jonathan", "Smith",dateVal, "hospadmin@gmail.com", "Male",4444444444l, house1, "hospadmin");
        business.getHospitalAdminDirectory().addPasswordManager(p1.getEmailId(), p1.getPassword());
//        Person p2 = new Person("Harshini", "Konda",dateVal, "harshini@gmail.com","Female",0000000000l, house2, "Harshini");
//        Person p3 = new Person("Vihas", "Rathna",dateVal, "vihas@gmail.com","Male",1111111111l, house2, "Vihas");
//        personDirectory.addPerson(p);
//        personDirectory.addPerson(p1);
//        personDirectory.addPerson(p2);
//        personDirectory.addPerson(p3);
    }

    public HospitalAdminDirectory getHospitalAdminDirectory() {
        return hospitalAdminDirectory;
    }

    public void setHospitalAdminDirectory(HospitalAdminDirectory hospitalAdminDirectory) {
        this.hospitalAdminDirectory = hospitalAdminDirectory;
    }

    public CommunityAdminDirectory getCommunityAdminDirectory() {
        return communityAdminDirectory;
    }

    public void setCommunityAdminDirectory(CommunityAdminDirectory communityAdminDirectory) {
        this.communityAdminDirectory = communityAdminDirectory;
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public ArrayList<String> getHospitalListComboBox() {
        return hospitalListComboBox;
    }

    public void addHospital(Hospital hObj) {
        this.getHospitalList().add(hObj);
        this.getHospitalListComboBox().add(hObj.getHospitalName());
    }

    public void deleteHospital(Hospital hObj) {
        for (Hospital h : this.hospitalList) {
            if (h.getHospitalName().equals(hObj.getHospitalName())) {
                this.hospitalList.remove(h);
                break;
            }
        }
        for (String h : this.cityListComboBox) {
            if (h.equals(hObj.getHospitalName())) {
                this.cityListComboBox.remove(h);
                break;
            }
        }
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public ArrayList<String> getCommunityListComboBox() {
        return communityListComboBox;
    }

    public void addCommunity(Community commObj) {
        this.communityList.add(commObj);
        this.communityListComboBox.add(commObj.getCommunity());
    }

    public void deleteCommunity(String commName) {
        for (Community cObj : this.communityList) {
            if (cObj.getCommunity().equals(commName)) {
                this.communityList.remove(cObj);
                break;
            }
        }
        for (String comm : communityListComboBox) {
            if (comm.equals(commName)) {
                communityListComboBox.remove(comm);
                break;
            }
        }
    }

    public ArrayList<String> getCityListComboBox() {
        return cityListComboBox;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void addCity(City city) {
        this.cityList.add(city);
        this.cityListComboBox.add(city.getCity());
    }

    public void removeCity(String cityName) {
        for (City c : cityList) {
            if (c.getCity().equals(cityName)) {
                cityList.remove(c);
                break;
            }
        }
        for (String c : cityListComboBox) {
            if (c.equals(cityName)) {
                cityListComboBox.remove(c);
                break;
            }
        }
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
            business.systemConfiguration();
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
