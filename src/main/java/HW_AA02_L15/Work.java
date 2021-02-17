package HW_AA02_L15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Work {
    public static void main(String[]args){

        Address address = new Address("111 Saratoga ave", "San Francisco", "CA", 95129);

        Map<Cattle, Integer> cattle = new HashMap<>();
            cattle.put(Cattle.CHICKENS, 40);
            cattle.put(Cattle.COWS, 30);
            cattle.put(Cattle.PIGS, 20);
            cattle.put(Cattle.SHEEPS, 10);

        List<AgreeCultural> agreeCultural = new ArrayList<>();
                agreeCultural.add(new AgreeCultural("Wheat", 2));
                agreeCultural.add(new AgreeCultural("Corn", 4));
                agreeCultural.add(new AgreeCultural("Barley", 1));

        Farm uncleSam = new Farm("Uncle Sam", address, cattle, agreeCultural);
        System.out.println(uncleSam);
        address.printAddress();

    }
}
