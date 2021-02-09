package homework10;

public class CompanyInternat extends Company {
    private String country;

    public CompanyInternat(String name, String type, String time, String location, String departments, String country){
        super(name, type, time, location, departments);
        this.country = country;
    }


    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}

