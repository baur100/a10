package homework15;

public class Address {
    private String streetAddress;
    private String town;
    private String state;
    private int zip;

    public Address(String streetAddress, String town, String state, int zip){
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public void setStreetAddress(){
        this.streetAddress = streetAddress;
    }
    public String getStreetAddress(){
        return streetAddress;
    }
    public void setTown(){
        this.town = town;
    }
    public String getTown(){
        return town;
    }
    public void setState (){
        this.state = state;
    }
    public String getState (){
        return state;
    }
    public void setZip(){
        this.zip = zip;
    }
    public int getZip(){
        return zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", town='" + town + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
