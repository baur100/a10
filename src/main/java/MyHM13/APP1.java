package MyHM13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class APP1 {
    public static void main(String[] args) {

        Address a1 = new Address(" 6600 Bruceville Rd", "Sacramento", "CA", 95283);
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("James", "Smith", Position.CARDIOLOGIST));
        doctors.add(new Doctor("Carlos", "Adams", Position.ANESTHESIOLOGIST));
        doctors.add(new Doctor("Jessica", "o'Neel", Position.PHYSICIAN));

        for (Doctor str: doctors){
            System.out.println(str);

        //    System.out.println(doctors);

        List<InsuranceCompanies> insurances = new ArrayList<>();
        insurances.add(InsuranceCompanies.AETNA);
        insurances.add(InsuranceCompanies.BlueCross);
        insurances.add(InsuranceCompanies.KAISER);
        insurances.add(InsuranceCompanies.BlueShield);
        insurances.add(InsuranceCompanies.OSCAR);

        //   System.out.println(insurances);


        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(1, "Emergency");
        rooms.put(2, "Delivery");
        rooms.put(3, "CheckRoom");
        rooms.put(4, "GeneralHospitalRoom");

        Hospital h1 = new Hospital("Kaiser", a1, doctors, rooms, insurances);
        System.out.println(h1.getHospitalName());
         System.out.println(a1.getStreetAddress() + " " + a1.getZip() + " "+ a1.getTown() + a1.getState() );
         System.out.println(h1.acceptedInsurances);
          System.out.println(rooms);


    }
    }
    }