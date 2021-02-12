package HomeWorkL10;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] responsibilities={"Driving","Cleaning"};
        Worker pavel = new Worker("Pavel","Furtuna",1982,responsibilities);
        Director mike = new Director("Mikke","Burstall",1950,"Business");

  //      System.out.println(pavel.getLastName());

        Counter jana=new Counter("Jana","Kuku",1970,responsibilities,"Vancuver");

 //       System.out.println(jana.getYear());

        Truck Tow= new Truck(2020,"Big",TruckModel.HINO);

  //      System.out.println(Tow.getMake());

        Seasons[] seasons={Seasons.SUMMER,Seasons.WINTER};
        Tire michelin = new Tire("Michelin",seasons);

//        System.out.println(Arrays.toString(michelin.getSeasons()));









    }
}
