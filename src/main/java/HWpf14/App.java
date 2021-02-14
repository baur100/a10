package HWpf14;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
//        Map<String,String> cameras = new HashMap<>();
//        cameras.put("Canon","5D");
//        cameras.put("Nikon","700D");
//        cameras.put("Sony","7V");
//        System.out.println(cameras);
//        cameras.put("Canon","1DXm2");
//        System.out.println(cameras);
//        for (String key:cameras.keySet()){
//            System.out.println(key);
//        }
//        for (String value:cameras.values()){
//            System.out.println(value);
//        }
//        for (Map.Entry<String,String> entry:cameras.entrySet()){
//            System.out.println("key = "+entry.getKey()+"value = "+entry.getValue());
//        }
//        cameras.remove("Nikon");
//        System.out.println(cameras);
//        cameras.replace("Sony","7V","9S");
//        System.out.println(cameras);
//        boolean inList = cameras.containsValue("9S");
//        System.out.println(inList);
//        Map<String,String> dsrl = new HashMap<>();
//        System.out.println(cameras.get("Canon"));
//        dsrl.put("Hasselblad","100Q");
//        dsrl.put("Sigma","Rta");
//        cameras.putAll(dsrl);
//        System.out.println(cameras);

//        Map<Integer,String> cigarettes = new HashMap<>();
//        cigarettes.put(0,"Pall Mall");
//        cigarettes.put(1,"McDonald");
//        cigarettes.put(2,"Marlboro");
//        cigarettes.put(3,"Parliament");
//        System.out.println(cigarettes);
//        cigarettes.replace(3,"Parliament","Kanhawake");
//        System.out.println(cigarettes);
//        boolean inList = cigarettes.containsValue("Marlboro");
//        System.out.println(inList);
//        Map<Integer,String> cigars = new HashMap<>();
//        cigars.put(4,"Havana");
//        cigars.put(5,"Cubana");
//        cigarettes.putAll(cigars);
//        System.out.println(cigarettes);
//        for (Integer key:cigarettes.keySet()){
//            System.out.println(key);
//        }
//        for (String value:cigarettes.values()){
//            System.out.println(value);
//        }
//        for (Map.Entry<Integer,String> entry:cigarettes.entrySet()){
//            System.out.println("key = "+entry.getKey()+"value = "+entry.getValue());
//        }
//        cigarettes.remove(4,"Havana");
//        System.out.println(cigarettes);

        Map<Driver,Car> vehicule  = new HashMap<>();
        vehicule.put(Driver.NOCHANCE,Car.Nissan);
        vehicule.put(Driver.RACE,Car.TOYOTA);
        vehicule.put(Driver.BEGINER,Car.TOYOTA);
        vehicule.put(Driver.PROFI,Car.Porche);
        System.out.println(vehicule);
        vehicule.replace(Driver.BEGINER,Car.TOYOTA,Car.BMW);
        System.out.println(vehicule);
        for (Driver key:vehicule.keySet()){
            System.out.println(key);
        }
        for (Car value:vehicule.values()){
            System.out.println(value);
        }
        for (Map.Entry<Driver,Car> entry:vehicule.entrySet()){
            System.out.println("key = "+entry.getKey()+"value = "+entry.getValue());
        }
        System.out.println(vehicule.size());
        vehicule.remove(Driver.NOCHANCE);
        System.out.println(vehicule);
        boolean noRunning = vehicule.containsValue(Car.Nissan);
        System.out.println(noRunning);
    }







}
