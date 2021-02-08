package homeWork09;

import java.util.Arrays;

public class SimpleHouse {
    protected String name;
    protected int squareFeet;
    protected int floors;
    protected String[] tenants;

    public SimpleHouse(String name, int squareFeet, int floors, String[] tenants) {
        this.name=name;
        this.squareFeet=squareFeet;
        this.floors=floors;
        this.tenants = tenants;
    }

    public SimpleHouse() {}


    public void setFloors(int floors) {
        this.floors = floors;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }
    public void setTenants(String[] tenants) {this.tenants = tenants;}

    public String getName() {
        return name;
    }
    public int getFloors() {
        return floors;
    }
    public int getSquareFeet() {
        return squareFeet;
    }
    public String[] getTenants() {return tenants;}

    public void printClass() {
        System.out.println(this.name+" has "+this.squareFeet+" square feet and " + this.floors + " floors, and "+ Arrays.toString(tenants)+" live here");
    }

}

