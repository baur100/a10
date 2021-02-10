package HW_AA02_L10;

public class EnumArray {
    private String company;
    private Department[] departments;

    public EnumArray(String company, Department[] departments){
        this.company=company;
        this.departments=departments;
    }

    public EnumArray(){}

    public String getCompany(){
        return company;
    }

    public void setDepartments(Department[] departments){
        this.departments=departments;
    }

    public void printClass(){
        System.out.println("Company name: "+getCompany()+"\nDepartments:");
        for (Department v: this.departments){
            System.out.println(v);
        }
    }
}
