package HW14pfExtended;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Address address = new Address("20 Westmore", "Montreal", "QC", ZipCode.H1B7D8);
        Hospital hospital = new Hospital("St.Elizabette", address);
        Doctors pratt = new Doctors("Samuel", "Pratt", Position.CARDIOLOGIST);
        Doctors nick = new Doctors("Nick", "Mojo", Position.DERMATOLOGIST);
        Doctors anna = new Doctors("Anna", "Jiku", Position.PEDIATRIAN);
        Doctors sara = new Doctors("Sara", "Konar", Position.PSYCHIATRIST);
        Doctors ravi = new Doctors("Ravi", "Tanus", Position.SURGEON);
        Doctors[] doctors = {pratt, nick, anna, sara, ravi};

        System.out.println(Arrays.toString(doctors));
        Doctors.printInfo();
//        List<Doctors> doctors = new ArrayList<>();
//          doctors.add(pratt);
//          doctors.add(nick);
//          doctors.add(anna);
//          doctors.add(sara);
//          doctors.add(ravi);

        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(44, "Cardiologist");
        rooms.put(66, "Dermatologist");
        rooms.put(33, "Pediatrian");
        rooms.put(88, "Psychiatrist");
        rooms.put(11, "Surgeon");
        for (Map.Entry<Integer, String> entry : rooms.entrySet()) {
            System.out.println("key = " + entry.getKey() + " value =" + entry.getValue());
        }

        Address address1 = new Address("65 Maple", "Montreal", "QC", ZipCode.H2R4D8);
        Address address2 = new Address("1050 Brien", "Lasalle", "QC", ZipCode.H4B1Z6);
        InsuranceCompany acceptedInsurance1 = new InsuranceCompany(Insurance.AETNA, address1);
        InsuranceCompany acceptedInsurance2 = new InsuranceCompany(Insurance.UNITEDHELHCARE, address2);

        InsuranceCompany[] insuranceCompanies = {acceptedInsurance1, acceptedInsurance2};
        System.out.println(acceptedInsurance1);
        Insurance.printInfo();
    }
}









