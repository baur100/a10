package HW_AA02_L14;

import java.util.*;

public class Work {
    static public void main(String[]args) {

        Address add = new Address("111 Saratoga ave", "San Jose", "California", 95129);

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Ivan", "Ivanov", Position.PSYCHIATRIST));
        doctors.add(new Doctor("Alex", "Pupkin", Position.PHYSICIAN));
        doctors.add(new Doctor("Max", "Frolov", Position.SURGEON));
        doctors.add(new Doctor("Jhon", "Sidorov", Position.THERAPIST));


        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(1, "Emergency");
        rooms.put(2, "Surgical");
        rooms.put(3, "Restroom");
        rooms.put(4, "Dining");

        List<InsuranseCompanies> acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(InsuranseCompanies.AETNA);
        acceptedInsuranses.add(InsuranseCompanies.BLUESHILD);
        acceptedInsuranses.add(InsuranseCompanies.KAISER);
        acceptedInsuranses.add(InsuranseCompanies.ROSGOSSTRAH);

        Hospital stenford = new Hospital("Stanford", add, doctors, rooms, acceptedInsuranses);
        add.printAddress();
        stenford.printInfo();
        System.out.println(doctors);
        System.out.println(rooms);
    }
}
