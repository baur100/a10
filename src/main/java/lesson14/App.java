package lesson14;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,String> capitals = new HashMap<>();
        capitals.put("USA","Washington");
        capitals.put("Germany","Berlin");
        capitals.put("China","Beijing");
        capitals.put("Austia","Vienna");
        System.out.println(capitals);
        capitals.put("China","Pekin");
        System.out.println(capitals);
        capitals.put("UK","London");
        capitals.put("Canada","London");
        System.out.println(capitals);
//        for (String key:capitals.keySet()){
//            System.out.println(key);
//        }
//        for (String value:capitals.values()){
//            System.out.println(value);
//        }
//        for (Map.Entry<String,String> entry:capitals.entrySet()){
//            System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
//        }

        System.out.println(capitals.get("USA"));



        Map<Integer,String> xx = new HashMap<>();
        xx.put(0,"Red");
        xx.put(1,"Green");
        System.out.println(xx.get(1));


    }
}
