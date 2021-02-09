package HM10;

import HM10.UniversityType;

public class University {
    public  String name;
     public UniversityType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UniversityType getType() {
        return type;
    }

    public void setType(UniversityType type) {
        this.type = type;
    }

    public University(String name, UniversityType type) {
        this.name = name;
        this.type = type;
    }
        public void UnInfo(){
        System.out.println(name + " " + " " + type);


    }
}
