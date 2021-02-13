package lesson11;

public class ZAddress {
    private String address1;
    private String city;
    private ZState state;
    private int zip;

    public ZAddress(String address1, String city, ZState state, int zip) {
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

    public ZState getState() {
        return state;
    }

    public void setState(ZState state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
