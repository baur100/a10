package homework15AF18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Work {
    public static void main(String[] args) {

        Map<Cattle,Integer> cattle=new HashMap<>();
        cattle.put(Cattle.SHEEPS,200);
        cattle.put(Cattle.PIGS,150);
        cattle.put(Cattle.TURKEYS, 100);
        cattle.put(Cattle.CHICKENS,150);

        List<AgreeCultural> agreeCultural=new ArrayList<>();
        agreeCultural.add(new AgreeCultural("Corn",230));
        agreeCultural.add(new AgreeCultural("Millet", 250));
        agreeCultural.add(new AgreeCultural("Rye",300));

        Farm f1=new Farm("Kack's FARM",new Address("1 US road", "Jacksonville","FL",2001),cattle,agreeCultural);
  f1.printinfo();
    }
}
