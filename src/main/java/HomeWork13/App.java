package HomeWork13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Lesson 13 - ArraysList
        ArrayList<String> coworkers = new ArrayList<>();

        coworkers.add("James");
        coworkers.add("Lilly");
        coworkers.add(1,"Jack");
        coworkers.add("John");
        coworkers.set(2, "Hugo");
        coworkers.remove(1);
        System.out.println(coworkers.get(0));
        for (String person: coworkers) {
            person="Mr. "+person;
            System.out.println(person);
        }

        System.out.println(coworkers);
        System.out.println("-----------------------");

        List<Integer> magicNumbers = new ArrayList<>();
        magicNumbers.add(4);
        magicNumbers.add(8);
        for (int i=0; i<7; i++) {
            magicNumbers.add((i*13-7)%9);
        }

        magicNumbers.set(2,13);
        magicNumbers.remove(5);

        System.out.println(magicNumbers);
        if (magicNumbers.contains(13)) {
            System.out.println("yes, there's devil 13 in the list");
        }

        Characters patrik = new Characters("Sponge Bob", "Patrick", 6);
        Characters arnold = new Characters("Hey, Arnold", "Arnold", 8);
        Characters sid = new Characters("Ice age", "Sid", 7);
        Characters po = new Characters("Kung-fu Panda", "Po", 9);

        List<Characters> moviestars = new ArrayList<>();
        moviestars.add(patrik);
        moviestars.add(arnold);
        moviestars.add(1, po);
        moviestars.set(2, sid);
        moviestars.add(new Characters("Zootopia", "Judy", 6));
        moviestars.add(0, new Characters("Frozen", "Olaf", 10));
        for (Characters character: moviestars) {
            System.out.println(character);
        }


        System.out.println("-----------------------"); //Lesson 14 - Map

        Map <String, String> lovers = new HashMap<>();
        lovers.put("Romeo", "Juliette");
        lovers.put("Ruslan", "Lyudmila");
        lovers.put("Clyde", "Bonnie");
        lovers.put("Ron", "Germiona");

        System.out.println(lovers.get("Clyde"));
        System.out.println(lovers.toString());
        lovers.remove("Ron");
        System.out.println(lovers.toString());

        Map <Integer, String> champions = new HashMap<>();
        champions.put(1, "HussainBolt");
        champions.put(5,"Flash");
        champions.put(2,"Mr.Incredible");
        champions.put(3,"AntMan");
        champions.replace(2,"Dash");
        champions.put(4, "Mr.Propper");
        System.out.println(champions.toString());
        System.out.println(champions.values());
        champions.remove(4);
        System.out.println(champions.get(5));
        for (String champ: champions.values()) {
            System.out.println(champ);
        }

        System.out.println("-----------------------");
        Map<InsuranceCompanies, Doctor> insuranceCoordinator = new HashMap<>();
        insuranceCoordinator.put(InsuranceCompanies.AmericanCross, new Doctor("Perry", "Cox", Position.PHYSICIAN));
        insuranceCoordinator.put(InsuranceCompanies.Coral, new Doctor("Lee","Chang", Position.DENTIST));
        insuranceCoordinator.put(InsuranceCompanies.AETNA, new Doctor("Judy", "Reese", Position.NURSE));
        insuranceCoordinator.put(InsuranceCompanies.GingerBreadMan, new Doctor("Jan", "Itor", Position.JANITOR));
        insuranceCoordinator.remove(InsuranceCompanies.Coral);
        System.out.println(insuranceCoordinator.get(InsuranceCompanies.GingerBreadMan));
        System.out.println(insuranceCoordinator);
        insuranceCoordinator.replace(InsuranceCompanies.AmericanCross, new Doctor("Hutch", "Norris", Position.OPTOMETRIST));
        for (Doctor dr: insuranceCoordinator.values()) {
            System.out.println(dr.getLastName());
        }


        System.out.println("-----------------------"); //Lesson 14 - Hospital Class

        Address sh_address = new Address("17 Blackberry str","Los Angeles", "California", 17254);
        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(13, "Therapy room");
        rooms.put(24, "Surgical room");
        rooms.put(2, "Lab");
        rooms.put(5, "Pharmacy");
        List<Doctor> cast = new ArrayList<>();
        cast.add(new Doctor("John", "Dorian", Position.PHYSICIAN));
        cast.add(new Doctor("Christopher", "Turk", Position.SURGEON));
        cast.add(new Doctor("Elliot", "Reid", Position.PHYSICIAN));
        List<InsuranceCompanies> insurance_sh = new ArrayList<>();
        insurance_sh.add(InsuranceCompanies.AETNA);
        insurance_sh.add(InsuranceCompanies.GingerBreadMan);
        Hospital sacreadHeart = new Hospital("SacredHeart", sh_address, cast,rooms, insurance_sh);
        sacreadHeart.printInfo();
        sacreadHeart.printDoctors();
        sacreadHeart.printRooms();














    }
}
