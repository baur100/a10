package HomeWork13;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, String> rooms;
    private List<InsuranceCompanies> acceptedInsuranses;


    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranceCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Map<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(Map<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public List<InsuranceCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(List<InsuranceCompanies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public void printInfo() {
        System.out.println(hospitalName+" is located at "+address+" and accepts "+acceptedInsuranses.toString());
    }

    public void printDoctors() {
        System.out.println(doctors);
    }

    public void printRooms() {
        System.out.println(rooms);
    }

}
