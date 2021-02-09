package HM10;

import HM10.Animal;

public class AdoptionCenter extends Animal {

    public  String orgName;
    public  int adoptionPrice;

    public AdoptionCenter(String name, String color, int id, int adoptionPrice, String orgName) {
        super(name, color, id);
        this.adoptionPrice = adoptionPrice;
        this.orgName = orgName;

    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public int getAdoptionPrice() {
        return adoptionPrice;
    }

    public void setAdoptionPrice(int adoptionPrice) {
        this.adoptionPrice = adoptionPrice;
    }
    public void GetPet(){
        System.out.println("Hi my name is " + " " + name + " My adoption price "  + " " + adoptionPrice);
    }
}

