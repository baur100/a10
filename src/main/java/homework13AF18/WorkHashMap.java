package homework13AF18;

import java.util.HashMap;
import java.util.Map;

public class WorkHashMap {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("Kirillov", "Ivan");
        students.put("Sierra", "Monica");
        students.put("Jellynholder", "Dashia");
        students.put("Newman", "Carl");

//        System.out.println(students.get("Sierra"));
//
//        students.remove("Jellynholder");
//        students.replace("Sierra","Silvia");
//        for (Map.Entry<String, String> entry : students.entrySet()) {
//            System.out.println("key = " + entry.getKey() + "; value = " + entry.getValue());
//        }

        Map<Integer, String> years = new HashMap<>();
        years.put(15, "Jessy");
        years.put(16, "Anna");
        years.put(17, "Kelly");
        years.put(18, "Nicki");

//        System.out.println(years.get(16));
//        years.put(16, "Elizabeth");
//        System.out.println(years.get(16));
//        years.remove(18);
//
//        for (int key : years.keySet()) {
//            System.out.println(key);
//        }
        Map<Salon,Car> cars=new HashMap<>();
        cars.put(Salon.KIA,new Car("Black","Kia Sportage"));
        cars.put(Salon.BMW,new Car("Silver","BMW XX"));
        cars.put(Salon.GERMANY_AUTO,new Car("RED","Wolkswagen"));
        cars.put(Salon.AUDI,new Car("Black","Audi TT"));

        System.out.println(cars.get(Salon.KIA));
        cars.put(Salon.GERMANY_AUTO,new Car("White","BMW"));
        cars.remove(Salon.AUDI);

        for (Car  object: cars.values()) {
            System.out.println(object);
       }
    }
}
