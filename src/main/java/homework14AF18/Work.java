package homework14AF18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Work {
    public static void main(String[] args) {


        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alex","Shimman",Position.PEDIATRICIAN));
        doctors.add(new Doctor("Lev","Semily",Position.ANESTHESIOLOGIST));
        doctors.add(new Doctor("Mary","Louren",Position.PHYSICIAN));
        doctors.add(new Doctor("Melissa","Filippenko",Position.SURGEON));
        doctors.add(new Doctor("Nicki","Smirnov",Position.SURGEON));

        Map<Integer,String> cabinets= new HashMap<>();
        cabinets.put(111,"Operating room");
        cabinets.put(222,"Intensive care");
        cabinets.put(333,"Emergency room");
        cabinets.put(444,"Consulting room");

        List<InsuranseCompamies> IC= new ArrayList<>();
        IC.add(InsuranseCompamies.AMBETTER);
        IC.add(InsuranseCompamies.OSCAR_QUALITY);
        IC.add(InsuranseCompamies.BRIGHT_PLUS);
        IC.add(InsuranseCompamies.UNITED_HEALTHCARE);

        Hospital h1 = new Hospital("Memory Hospital",
                new Address("111 Ocean Drive Ave", "Hollywood", "FL", 33319),
                doctors, cabinets, IC);

        h1.printInfo();
        h1.printDoctors();
        h1.printRooms();
    }
}
