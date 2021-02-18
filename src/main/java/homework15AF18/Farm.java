package homework15AF18;

import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle,Integer> cattle;
    private List<AgreeCultural> agreeCultural;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setAgreeCultural(List<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }

    public void printinfo(){
        System.out.println( "Name of farm: "+name+"\nAddress: "+address+
                "\nFarm consist of next type of animals: \n"+cattle+"\nFarm include: "+ agreeCultural);
    }
}
