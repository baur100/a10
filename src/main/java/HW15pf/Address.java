package HW15pf;

public class Address {
    public String streetName;
    public String town;
    public String state;
    public  int zip;

    public Address(String streetName, String town, String state, int zip) {
        this.streetName = streetName;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", town='" + town + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
