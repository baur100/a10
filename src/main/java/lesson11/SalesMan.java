package lesson11;

public class SalesMan extends Person{
    private Department department;

    public SalesMan(Name name, int year, Department department) {
        super(name, year);
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
