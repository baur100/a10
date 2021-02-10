package HW_AA02_L9;

public class Home {
    private String houseHolder;
    private int bathrooms;
    private int bedrooms;
    private String[] furniture;

    public Home(String houseHolder, int bedrooms, int bathrooms, String[] furniture){
        setBedrooms(bedrooms);
        setBathrooms(bathrooms);
        this.houseHolder=houseHolder;
        this.bedrooms=bedrooms;
        this.bathrooms=bathrooms;
        this.furniture=furniture;
    }

    public Home(String houseHolder, int bedrooms, int bathrooms){
        setBedrooms(bedrooms);
        setBathrooms(bathrooms);
        this.houseHolder=houseHolder;
        this.bedrooms=bedrooms;
        this.bathrooms=bathrooms;
    }

    public Home(){}

    public String getHouseHolder(){
        return houseHolder;
    }

    public void setHouseHolder(String houseHolder){
        this.houseHolder = houseHolder;
    }

    public int getBathrooms(){
        return bathrooms;
    }

    public void setBathrooms(int bathrooms){
        if(bedrooms<0){
            throw new IllegalArgumentException("Bathrooms can not be less then zero");
        }
        this.bathrooms = bathrooms;
    }

    public int getBedrooms(){
        return bedrooms;
    }

    public void setBedrooms(int bedrooms){
        if(bedrooms<0){
            throw new IllegalArgumentException("Bedrooms can not be less then zero");
        }
        this.bedrooms = bedrooms;
    }

    public String[] getFurniture(){
        return furniture;
    }

    public void setFurniture(String[] furniture){

        this.furniture = furniture;
    }

    public void printClass() {
        System.out.println("House Holder: " + getHouseHolder() + "\nBathrooms: " + getBathrooms() + "\nBedrooms: " + getBedrooms());
        for (String v : this.furniture) {
            System.out.println(v);
        }

    }
}
