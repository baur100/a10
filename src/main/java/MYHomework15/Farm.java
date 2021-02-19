package MYHomework15;

import MyHM13.Address;

import java.util.List;
import java.util.Map;

public class Farm {
    private String farmName;
    private Address address;
    Map<Cattle, Integer> cattleIntegerMap;
    List<AgraCultural> agreeCulturalList;

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<Cattle, Integer> getCattleIntegerMap() {
        return cattleIntegerMap;
    }

    public void setCattleIntegerMap(Map<Cattle, Integer> cattleIntegerMap) {
        this.cattleIntegerMap = cattleIntegerMap;
    }

    public List<AgraCultural> getAgreeCulturalList() {
        return agreeCulturalList;
    }

    public void setAgreeCulturalList(List<AgraCultural> agreeCulturalList) {
        this.agreeCulturalList = agreeCulturalList;
    }

    public Farm(String farmName, Address address, Map<Cattle, Integer> cattleIntegerMap, List<AgraCultural> agreeCulturalList) {
        this.farmName = farmName;
        this.address = address;
        this.cattleIntegerMap = cattleIntegerMap;
        this.agreeCulturalList = agreeCulturalList;



    }
}