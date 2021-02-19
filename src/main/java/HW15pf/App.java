package HW15pf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<Cattle,Integer> cattle=new HashMap<>();
        cattle.put(Cattle.SHEEPS,45);
        cattle.put(Cattle.PIGS,56);
        cattle.put(Cattle.TURKEYS, 67);
        cattle.put(Cattle.CHICKENS,78);

        List<AgreeCultural> agreeCultural=new ArrayList<>();
        agreeCultural.add(new AgreeCultural("Corn",76));
        agreeCultural.add(new AgreeCultural("Millet", 65));
        agreeCultural.add(new AgreeCultural("Rye",445));

        Farm f1=new Farm("McDonald",new Address("467 NoName", "Nowhere","CA",67848),
                cattle,agreeCultural);
        f1.printinfo();
    }


}
