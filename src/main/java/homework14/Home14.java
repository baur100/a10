package homework14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Home14 {
    public static void main(String[] args) {

        Address address1 = new Address("28 Orange pic", "Naples", "FL", 33213);

        Doctor doctor1 = new Doctor("Jone", "Moore",Position.ANASTESIOLOGIST);
        Doctor doctor2 = new Doctor("Bob", "Smith", Position.DENTIST);
        Doctor doctor3 = new Doctor("lily", "Jones", Position.PEDIATRIC);
        Doctor doctor4 = new Doctor("Kim", "Mort", Position.PHYSICIAN);

        List <Doctor> doctors = new ArrayList<>();
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);


        Map<Integer,String> rooms = new HashMap<>();
        rooms.put(22, "ANASTESIOLOGIST");
        rooms.put(34, "DENTIST");
        rooms.put(11, "PHYSICIAN");
        rooms.put(67, "PEDIATRIC");

        List <InsuranseCompanies> insuranseCompanies = new ArrayList<>();
        insuranseCompanies.add(InsuranseCompanies.AETNA);
        insuranseCompanies.add(InsuranseCompanies.UnitedHealthcare);
        insuranseCompanies.add(InsuranseCompanies.HUMANA);


        Hospital sinai = new Hospital("Sinai", address1, doctors, rooms, insuranseCompanies);
        System.out.println(sinai);

//  *** hospital name, address, list of insurance companies ***

        sinai.printInfo();

//  *** List of  doctors and their positions ***

        System.out.println(doctors);

//  *** all rooms and their names ***

        System.out.println(rooms);






    }
}
