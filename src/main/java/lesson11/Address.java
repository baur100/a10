package lesson11;

public class Address {
    private String address1;
    private String city;
    private State state;
    private int zip;

    public Address() {
    }

    public Address(String address1, String city, State state, int zip) {
        this.address1 = address1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
