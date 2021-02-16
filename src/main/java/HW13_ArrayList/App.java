package HW13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Citroen");
        cars.add("Ford");
        cars.add("Toyota");
//        cars.set(0,"GMC");
//        cars.set(3,"Lincoln");
      //  cars.remove(0);

//        System.out.println(cars.get(1));//print second object from array
//
//        System.out.println(cars.size());
//        System.out.println(cars);//print all Array

//        Boolean inList = cars.contains("BMW");//print True or False
//        System.out.println(inList);//print True or False
//        System.out.println(cars);
//        for(String v: cars){
//            System.out.println(v);
//        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        List<Double> temp = new ArrayList<>();
        temp.add(30.2);
        temp.add(25.47);
        temp.add(-10.2);
        temp.add(42.0);
        //System.out.println(temp.get(1));
        temp.set(0,25.13);
        temp.set(3,100.0);
       // System.out.println(temp);
//        for(Double v : temp){
//            System.out.println(v);
//        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        List<Plane> russian = new ArrayList<>();
        Plane suhoi = new Plane("Suhoi", "SuperJet", 100);
        Plane tu = new Plane("Tupolev", "144", 210);
        Plane yak = new Plane("Yakovlev", "42", 85);
        Plane il = new Plane("Ilushin", "96", 350);
        russian.add(suhoi);
        russian.add(tu);
        russian.add(yak);
        russian.add(il);
        russian.add(new Plane("MIG","35",2));
        russian.add(new Plane("MC","21",220));

        System.out.println(russian.get(0).getName());

//        suhoi.printInfo();
//        yak.printInfo();

        System.out.println(il);
        System.out.println(russian);
        }
    }


