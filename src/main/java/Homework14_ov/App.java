package Homework14_ov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Doctor surgen = new Doctor("John", "Brown",Position.SURGEON);
        Doctor gastro = new Doctor("Mary", "Nia", Position.GASTROENTEROLOGIST);
        Doctor derma = new Doctor("Mike", "Summers", Position.DERMATOLOGIST);
        Doctor cardio = new Doctor("Jimmy", "Carter", Position.CARDIOLOGIST);
        Doctor physio = new Doctor("Mikki", "Tyler", Position.PHYSICIAN);

        List<Doctor> doctors1 = new ArrayList<>();
        doctors1.add(surgen);
        doctors1.add(gastro);
        doctors1.add(cardio);
        doctors1.add(physio);

        List<Doctor> doctors2 = new ArrayList<>();
        doctors2.add(cardio);
        doctors2.add(derma);
        doctors1.add(physio);

        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(10, "Cargiologist");
        rooms.put(14, "Garstoenterologist");
        rooms.put(15, "Physician");
        rooms.put(17, "Surgeon");
        rooms.put(25, "Dermatolodist");

        List<InuranceCompanies> insComp = new ArrayList<>();
        insComp.add(InuranceCompanies.VITALIFE);
        insComp.add(InuranceCompanies.MediCare);
        insComp.add(InuranceCompanies.AETHNA);
        insComp.add(InuranceCompanies.UnitedHealthcare);



        Address a1 = new Address("12 Hight. St", "New Orleanse", "Missuri",12345);
        Address a2 = new Address("34 Nice. St", "New York", "Maryland",78345);
        Address a3 = new Address("56 Willoy. St", "Los Angelos", "California",128345);
        Address a4 = new Address("79  Magestiq. St", "New York", "Maryland",78345);

        Hospital h1 = new Hospital("Memorial",a1 ,doctors1 ,rooms,insComp  );
        Hospital h2 = new Hospital("Patterson", a2, doctors2, rooms, insComp);
        Hospital h3 = new Hospital("Eagle Ridge", a3, doctors1, rooms, insComp);
        Hospital h4 = new Hospital("Columbia", a4, doctors2, rooms, insComp);

        System.out.println("+++++++++++Print Insurance Companies*************");
        h1.printInfo();
        System.out.println("****************Print Doctors****************");
        h2.printDoctors();

        System.out.println("****************Print rooms****************");
        System.out.println(rooms);
        System.out.println("****************Print Hospital****************");
        System.out.println(h1);



    }
    }


