package HWpf13;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        ArrayList<String> lens = new ArrayList<>();
//        lens.add("Canon");
//        lens.add("Nikor");
//        lens.add("Sony");
//        lens.add("Tamron");
//        System.out.println(lens);
//        System.out.println(lens.size());
//        System.out.println(lens.get(3));
//        lens.set(2,"Sigma");
//        System.out.println(lens);
//        lens.add(2,"Zeiss");
//        System.out.println(lens);
//
//        ArrayList<String>lens1 = new ArrayList<>();
//        lens1.add("YN");
//        lens1.add("RW");
//        lens.addAll(2,lens1);
//        System.out.println(lens);
//        boolean isInList = lens.contains("Sigma");
//        System.out.println(isInList);
//        lens.remove("Canon");
//        System.out.println(lens);
//        for (String v:lens){
//            System.out.println(v);
//        List<Integer> temperature = new ArrayList<>();
//        temperature.add(18);
//        temperature.add(20);
//        temperature.add(30);
//        temperature.add(9);
//        System.out.println(temperature);
//        System.out.println(temperature.size());
//        System.out.println(temperature.get(0));
//        temperature.set(2,-12);
//        System.out.println(temperature);
//        temperature.add(2,-3);
//        System.out.println(temperature);
//        List<Integer> highTem = new ArrayList<>();
//        highTem.add(90);
//        highTem.add(100);
//        temperature.addAll(1,highTem);
//        System.out.println(temperature);
//        boolean isInList = temperature.contains(100);
//        temperature.remove(2);
//        System.out.println(isInList);
//        for (Integer v : temperature){
//            System.out.println(v);
//        }
        List<Tires> summer = new ArrayList<>();
        summer.add(Tires.BRIDGESTONE);
        summer.add(Tires.MICHELIN);
        summer.add(Tires.TOYO);
        summer.add(Tires.YAKOHOMA);
        summer.add(Tires.PIRELLI);
        System.out.println(summer);
        System.out.println(Tires.values().length);
        System.out.println(summer.size());
        System.out.println(summer.get(2));
        boolean isInList = summer.contains(Tires.TOYO);
        System.out.println(isInList);
        summer.remove(Tires.MICHELIN);
        System.out.println(summer);
        for (Tires v : summer){
            System.out.println(v);
        }





    }






    }

