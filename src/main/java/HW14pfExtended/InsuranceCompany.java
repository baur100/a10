package HW14pfExtended;

public class InsuranceCompany {
    private Insurance insurance;
    private Address address1;

    public InsuranceCompany(Insurance insurance, Address address1) {
        this.insurance = insurance;
        this.address1 = address1;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }
    public void printInfo(){
        System.out.println("insurance ="+ this.insurance+"address1 ="+ this.address1);
    }

    @Override
    public String toString() {
        return "InsuranceCompany{" +
                "insurance=" + insurance +
                ", address1=" + address1 +
                '}';
    }
}


