package HW9;

public class House {
    private String type;
    private String location;
    private int sizeOfsf;
    private int numberOflevel;

    public House(String type, String location, int sizeOfsf, int numberOflevel){  //Constructor 3
        this.type=type;
        this.location=location;
        this.sizeOfsf=sizeOfsf;
        this.numberOflevel=numberOflevel;
    }
    public House(){                                                               //Empty Constructor

    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSizeOfsf() {
        return sizeOfsf;
    }

    public void setSizeOfsf(int sizeOfsf) {
        this.sizeOfsf = sizeOfsf;
    }

    public int getNumberOflevel() {
        return this.numberOflevel;
    }

    public void setNumberOflevel(int numberOflevel) {
        if(numberOflevel>10 || numberOflevel<1){
            throw new IllegalArgumentException("Wrong number of leve, must be between 1 and 10");//Проверка кол-во этажей
        }
        this.numberOflevel = numberOflevel;
    }
}
