package HW14_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Address hopkinsAddress = new Address("208 Main street", "Washington", "DC", 20123);

        Hospital hopkins = new Hospital("Hopkins hospital", hopkinsAddress);
//        System.out.println(hopkins);


        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Samuel", "Rabinivich", Position.DERMATOLOGIST));
        doctors.add(new Doctor("Peter", "Piterson", Position.DERMATOLOGIST));
        Doctor mike = new Doctor("Mike", "Smith", Position.PHYSICIAN);
        Doctor roy = new Doctor("Roy", "Lukas", Position.DENTAL);
        doctors.add(new Doctor("Moti", "Crasty", Position.RADIOLOGIST));
        doctors.add(mike);
        doctors.add(roy);

      // System.out.println(doctors);
//        System.out.println(doctors.size());
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Map<Integer, Rooms> rooms = new HashMap<>();
        rooms.put(2, Rooms.DENTALOGY);
        rooms.put(4, Rooms.RADIOLOGY);
        rooms.put(6, Rooms.UROLOGY);
        rooms.put(8, Rooms.DERMATOLOGY);
        rooms.put(10, Rooms.PHYSICIANGY);
        //System.out.println(rooms.get(2));


            //System.out.println(rooms);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            List<Insuranse> insh = new ArrayList<>();
            insh.add(Insuranse.AETNA);
            insh.add(Insuranse.HUMANA);
            insh.add(Insuranse.KAISER);
            insh.add(Insuranse.UNITEDHEALTH);

            //System.out.println(hopkins);

            for (Insuranse v : insh) {
                //System.out.println(v);
            }


        }


    }
