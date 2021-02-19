package MYHomework15;

import MyHM13.Address;
import MyHM13.Doctor;
import MyHM13.Position;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {


        Address farmAddress = new Address("505 W Broad St","Sacramento","CA",5846);

        List<AgraCultural>  agraCulturalList = new ArrayList<>();
        agraCulturalList.add(new AgraCultural("Basmati Rice",27));
        agraCulturalList.add(new AgraCultural("Corn" ,15));
        agraCulturalList.add(new AgraCultural("Wheat", 55));


        Map<Cattle, Integer> cattleIntegerMap = new HashMap<>();
        cattleIntegerMap.put(Cattle.CHICKENS, 30);
        cattleIntegerMap.put(Cattle.COWS, 20);
        cattleIntegerMap.put(Cattle.SHEEP, 13);
        cattleIntegerMap.put(Cattle.TURKEYS, 10);
        cattleIntegerMap.put(Cattle.PIGS, 8);

        Farm farm1 = new Farm("HappyLand",farmAddress,cattleIntegerMap,agraCulturalList);

        System.out.println(farm1.getFarmName());
        System.out.println(farmAddress.getStreetAddress() + " " + farmAddress.getZip() + " "+ farmAddress.getTown() + farmAddress.getState() );
        System.out.println(farm1.cattleIntegerMap);
        System.out.println(agraCulturalList);
    }
}

