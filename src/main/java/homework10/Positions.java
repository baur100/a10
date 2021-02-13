package homework10;

import java.util.Arrays;

public class Positions extends Jobboard {
        private String [] availability;


    public Positions(String name, String type, String time, String location, String[] availability){
        super(name, type, time, location);
        this.availability = availability;
    }


    public Positions(){}


    public void printInfo(){
        System.out.println("This " +name+ " available just on:" + Arrays.toString(availability));
//        for (String v: availability){
//            System.out.println(v);
//        }
    }


    public void setAvailability (String[] availability){
        this.availability = availability;
    }
    public String[] getAvailability(){
        return availability;
    }
}
