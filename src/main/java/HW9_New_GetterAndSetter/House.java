package HW9_New_GetterAndSetter;

public class House {
    private String typeOfHouse;
    private String state;
    private int square;
    private int numberOfLevel;
    private String[] appliances;

    public House(String typeOfHouse, String state, int square, int numberOfLevel, String[] appliances) {
        this.typeOfHouse = typeOfHouse;
        this.state = state;
        this.square = square;
        this.numberOfLevel = numberOfLevel;
        this.appliances = appliances;
    }
    public House(){//Empty constructor

    }

    public String getTypeOfHouse() {
        return typeOfHouse;
    }

    public void setTypeOfHouse(String typeOfHouse) {
        this.typeOfHouse = typeOfHouse;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getNumberOfLevel() {
        return numberOfLevel;
    }

    public void setNumberOfLevel(int numberOfLevel) {
        if(numberOfLevel<1 || numberOfLevel>10){
            throw new IllegalArgumentException("Wrong number of Level");//Проверка кол-во этажей
        }
        this.numberOfLevel = numberOfLevel;
    }

    public String[] getAppliances() {
        return appliances;
    }

    public void setAppliances(String[] appliances) {
        this.appliances = appliances;
    }

    public void printInfo(){
        System.out.println("Type of House = "+this.typeOfHouse+", State = "+this.state+", Square = "+this.square+", Number of Level = "+this.numberOfLevel+", Appliences = ");
    for(String v : appliances){
        System.out.println(v);
    }
    }
}
