package HW_AA02_L13;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {
    static public void main(String[]args){
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Ivanov");
        arr1.add("Petrov");
        arr1.add("Sidorov");
        System.out.println(arr1);
        arr1.add(1, "Pupkin");
        System.out.println(arr1);
        System.out.println(arr1.get(2));
        arr1.remove("Petrov");
        System.out.println(arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(44);
        arr2.add(2, 99);
        arr2.add(88);
        System.out.println(arr2);
        arr2.remove(2);
        System.out.println(arr2);
        arr2.set(0,100);
        System.out.println(arr2);

        ArrayList<Double> arr3 = new ArrayList<>();
        arr3.add(2.5);
        arr3.add(34.5);
        arr3.add(86.9);
        arr3.add(67.3);

        System.out.println(arr3);
        for (Double v:arr3){
            System.out.println(v);
        }

        System.out.println(arr3.size());

        HashMap<String,String> map1 = new HashMap<>();
        map1.put("Toyta", "Corolla");
        map1.put("BMW", "X3");
        map1.put("Mazda", "CX6");
        map1.put("Opel", "Omega");

        System.out.println(map1);
        System.out.println(map1.values());

        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(1,"Ivanov");
        map2.put(2, "Petrov");
        map2.put(3,"Belkin");
        map2.put(4, "Sorokin");

        System.out.println(map2);
        System.out.println(map2.get(2));

        HashMap<String, Double> map3 = new HashMap<>();
        map3.put("Alex", 6.7);
        map3.put("Anna", 4.9);
        map3.put("Max", 8.5);
        map3.put("Antony", 9.0);

        System.out.println(map3.keySet());

        map3.replace("Max", 0.3);
        System.out.println(map3);

        for (String key: map3.keySet()){
            System.out.println(key);
        }

        for (Double value: map3.values()){
            System.out.println(value);
        }

    }
}
