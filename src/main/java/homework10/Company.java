package homework10;

public class Company extends Jobboard {
    protected String departments;

    public Company(String name, String type, String time, String location, String departments){
        super(name, type, time, location);
        this.departments = departments;
    }

    public Company(){}


    public void setDepartments(String departments){
        this.departments = departments;
    }
    public String getDepartments(){
        return departments;
    }
}
