package HW13_ArrayList;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<String, String> cars = new HashMap<>();
        cars.put("Toyota", "Corolla");
        cars.put("Honda", "Civik");
        cars.put("Mazda", "3");
        cars.put("Tesla", "Corolla");
        //System.out.println(cars.get("Honda"));
        //cars.remove("Tesla");
        //System.out.println(cars);

//        for (String key : cars.keySet()) {
//            System.out.println(key);
//        }
//
//        for (String value : cars.values()) {
//            System.out.println(value);
//        }
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Map<Integer, String> school = new HashMap<>();
        school.put(1, "Elementay");
        school.put(2, "Middle");
        school.put(3, "High");
        school.put(4, "College");
        school.replace(2, "SuperMiddle");
        //System.out.println(school);
        System.out.println(school.get(1));

//        for(Integer key : school.keySet()){
//            System.out.println(key);
//        }
//
//        for(String value : school.values()){
//            System.out.println(value);
//        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Map<Continent,Country> cc=new HashMap<>();
        cc.put(Continent.AFRRICA,Country.KONGO);
        cc.put(Continent.AMERICA,Country.PERU);
        cc.put(Continent.ASIA,Country.CHINA);
        cc.put(Continent.EUROPE,Country.FRANCE);
        cc.replace(Continent.ASIA,Country.INDIA);

        //System.out.println(cc);
        for(Continent key : cc.keySet()){
            System.out.println(key);
        }

        for(Country value : cc.values()){
            System.out.println(value);
        }

    }

}
