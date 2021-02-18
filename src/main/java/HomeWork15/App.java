package HomeWork15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App   {
    public static void main(String[] args) {


        Map<Cattle, Integer> oldMcdonaldCattle = new HashMap<>();
        oldMcdonaldCattle.put(Cattle.CHICKEN, 48);
        oldMcdonaldCattle.put(Cattle.COWS, 4);
        oldMcdonaldCattle.put(Cattle.DOGS, 7);
        oldMcdonaldCattle.put(Cattle.PIGS, 72);
        oldMcdonaldCattle.put(Cattle.DOLPHINS,3);
        oldMcdonaldCattle.put(Cattle.UNICORNS,1);


        List<AgreeCultural> oldMcdonaldCulture = new ArrayList<>();
        oldMcdonaldCulture.add(new AgreeCultural("Corn", 4));
        oldMcdonaldCulture.add(new AgreeCultural("Potato", 2));
        oldMcdonaldCulture.add(new AgreeCultural("Strawberry", 2));
        oldMcdonaldCulture.add(new AgreeCultural("Rice", 8));
        Address oldMDaddress = new Address("Cloverfield 10 lane", "Lemontown", "Dabraska", 773125);

        Farm oldMcDonald = new Farm("Old McDonald's farm", oldMDaddress, oldMcdonaldCattle, oldMcdonaldCulture);

        oldMcDonald.printInfo();

    }
}