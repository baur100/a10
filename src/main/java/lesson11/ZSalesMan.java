package lesson11;

public class ZSalesMan extends Person {
    private Department department;

    public ZSalesMan(Name name, int year, Department department) {
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
