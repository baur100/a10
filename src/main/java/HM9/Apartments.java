package HM9;

public class Apartments {

    public int building;
    public int floor;
    public  int[] availability;

    


    public Apartments(int building, int floor, int[] availability) {
        this.building = building;
        this.floor = floor;
        this.availability = availability;
    }

    public Apartments() {}

    public int getNumber() {
        return building;
    }

    public void setNumber(int number) {
        this.building = number;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int []getAvailability() {
        return availability;
    }

    public void setAvailability(int [] availability) {
        this.availability = availability;
    }
 
      
    public void GetInfo() {
        System.out.println("Building" + " " + building + " " + " floor" + " " + floor + " " + " Available apartments  " + " " + availability);
        for (int v: this.availability) {
            System.out.println(v);
        }
    }
}