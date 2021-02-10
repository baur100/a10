package HW8PF;

import lesson8.Person;

public class App {
    public static void main(String[] args) {
        Person pavel = new Person();
        pavel.name = "Pavel";
        pavel.lastName = "Furtuna";
        pavel.yearOfBirth=1982;
  //      System.out.println(pavel.lastName);
        pavel.hello("Olga");

        Person olga = new Person();
        olga.name = "Olga";
        olga.lastName = "Djandarova";



        Vehicle MyCar = new Vehicle();
        MyCar.color=" blue ";
        MyCar.make=" honda ";
        MyCar.model=" civic ";
        MyCar.year=2005;
        MyCar.broken();

        Fruit Banana = new Fruit();
        Banana.color = "Green";
        Banana.name = "Platan";




    }
}
