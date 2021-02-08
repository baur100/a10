package HW_AA02_L8;

public class Home {
    public int bedrooms;
    public int bathrooms;
    public String houseHolder;

    public void HomeInfo(String city){
        System.out.println("Home located in "+city+". There are "+bedrooms+" bedrooms, "+bathrooms+" bathrooms and house holder name is "+houseHolder);
    }
}
