//package HW15_Farms;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class App {
//    public static void main(String[] args) {
//
//        //Address AddressfarmTexas = new Address("208 Main", "Austin", "TX", 20223);//создали адрес новой фермы
//
//        //Farm texasFarm = new Farm("TexasFarm",AddressfarmTexas,listcattle,);
//
//
//        Map<Cattle, Integer> listcattle = new HashMap<>();//Создали новый список скота
//        listcattle.put(Cattle.CHICKENS, 3000);
//        listcattle.put(Cattle.COWS, 250);
//        listcattle.put(Cattle.PIGS, 125);
//        listcattle.put(Cattle.SHEEPS, 235);
//        listcattle.put(Cattle.TURKEYS, 159);
//
//        List<AgreeCultural> agreeCultures = new ArrayList<>();
//
//        agreeCultures.add(new AgreeCultural("Rice", 10));
//        agreeCultures.add(new AgreeCultural("Weet", 15));
//        AgreeCultural tomato = new AgreeCultural("Tomato", 20);
//        AgreeCultural cucumber = new AgreeCultural("Cucumber", 5);
//        agreeCultures.add(tomato);
//        agreeCultures.add(cucumber);
//        agreeCultures.add(new AgreeCultural("Plumb", 12));
//
//
//        for (Map.Entry<Cattle, Integer> entry : listcattle.entrySet()) {//print array cattle
//            // System.out.println("Cattle = " + entry.getKey() + " amount = " + entry.getValue());
//        }
//        System.out.println(agreeCultures);
//
//        System.out.println(listcattle);
//
//
//
//        // farmTexas.printInfo();
//
//    }
//
//
//}