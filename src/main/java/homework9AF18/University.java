package homework9AF18;

import java.util.Arrays;

public class University {
    private String name;
    private int building;
    private String address;
    private String[] courses;

    public University(){}

    public University(String name, int building, String address, String[] courses){
        this.name=name;
        this.building=building;
        this.address=address;
        this.courses=courses;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void printClass() {
        System.out.println("University: "+ name +
                ".\n Address: " + building +" "+ address +
                ". \n University courses: " + Arrays.toString(courses));
    }
}
