package HWPF10;

public class EnumArray {
    private String building;
    private Level[] levels;

    public EnumArray(String building, Level[] levels) {
        this.building = building;
        this.levels = levels;
    }


    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public Level[] getLevels() {
        return levels;
    }

    public void setLevels(Level[] levels) {
        this.levels = levels;
    }
    public void printClass(){
        System.out.println("Buijding name :" +getBuilding()+"Levels:");
        for (Level v: this.levels){
            System.out.println(v);
        }

    }

}
