package homework14AF18;


import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer,String> rooms;
    private List<InsuranseCompamies> acceptedInsuranses;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranseCompamies> acceptedInsuranses) {
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

    public List<InsuranseCompamies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(List<InsuranseCompamies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public void printInfo(){
        System.out.println("The "+hospitalName+"."+"\nAddress: "+address+"."
        +"\nAccepted insurance companies: "+acceptedInsuranses+".");
    }

    public void printDoctors(){
        for(Doctor v: doctors){
            System.out.println(v);
        }
    }
    public void printRooms() {
        for (Map.Entry<Integer, String> v : rooms.entrySet()) {
            System.out.println("number = " + v.getKey() + "; room = " + v.getValue());
        }
    }
    public void printInsurance(List<InsuranseCompamies> insuranseCompamies){
        for(InsuranseCompamies v: insuranseCompamies){
            System.out.println(v);
        }
    }
}
