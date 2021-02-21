package Homework15_ov;

import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle, Integer> cattle;
    private List<Agricultural> agriCultural;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<Agricultural> agriCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agriCultural = agriCultural;
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

    public List<Agricultural> getAgriCultural() {
        return agriCultural;
    }

    public void setAgreeCultural(List<Agricultural> agriCultural) {
        this.agriCultural = agriCultural;
    }

    public void printInfo(){
        System.out.println("Farm "+ getName()+ "\nAddress "+ getAddress()+ "\nCattle "+ getCattle()+ "\nAgriculture "+ getAgriCultural());
    }

    @Override
    public String toString() {
        return "Farm " +
                "\nName= " + name +
                "\nAddress=" + address +
                "\nCattle=" + cattle +
                "\nAgriCulture=" + agriCultural;
    }
}
