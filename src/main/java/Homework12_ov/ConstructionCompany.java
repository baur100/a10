package Homework12_ov;

public class ConstructionCompany implements BusinessRules{
    private String companyName;
    private int numberOfEmployees;
    private  String city;
    private int annualTurnover;

    public ConstructionCompany(String companyName, int numberOfEmployees, String city, int annualTurnover) {
        this.companyName = companyName;
        this.numberOfEmployees = numberOfEmployees;
        this.city = city;
        this.annualTurnover = annualTurnover;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAnnualTurnover() {
        return annualTurnover;
    }

    public void setAnnualTurnover(int annualTurnover) {
        this.annualTurnover = annualTurnover;
    }

    @Override
    public void fileTaxes() {
        System.out.println("Construction company , we file taxes");
    }

    @Override
    public void getLicense() {
        System.out.println("Construction company , we get license");
    }
    public void construct(){
        System.out.println("We constructed 10 houses");
    }
}
