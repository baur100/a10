package homework15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Home15 {
    public static void main(String[] args){

        Address address = new Address("34 Park Way", "Dallas", "Texas", 23415);

        Map<Cattle,Integer> cattle = new HashMap<>();
        cattle.put(Cattle.CHICKENS, 75);
        cattle.put(Cattle.COWS, 30);
        cattle.put(Cattle.PIGS, 65);
        cattle.put(Cattle.SHEEPS, 50);

        AgreeCultural adventure = new AgreeCultural("Adventure",4);
        AgreeCultural agroAcres = new AgreeCultural("AgroAcres", 5);
        AgreeCultural natureHills = new AgreeCultural("Nature Hills", 3);
        AgreeCultural farmington = new AgreeCultural("Farmington", 6);

        List<AgreeCultural> agreeCulturalList = new ArrayList<>();
        agreeCulturalList.add(adventure);
        agreeCulturalList.add(agroAcres);
        agreeCulturalList.add(natureHills);
        agreeCulturalList.add(farmington);


        Farm oakdaleFarm = new Farm("Oakdale Farm", address, cattle, agreeCulturalList);
        oakdaleFarm.printInfo();


    }
}
