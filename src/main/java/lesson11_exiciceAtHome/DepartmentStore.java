package lesson11_exiciceAtHome;

public class DepartmentStore {
    private Department[] department;
    private SalesMan[] salesMEN;
    private Manager[]managers;
    private Address address;

    public DepartmentStore(Department[] department, SalesMan[] salesMEN, Manager[] managers, Address address) {
        this.department = department;
        this.salesMEN = salesMEN;
        this.managers = managers;
        this.address = address;
    }

    public Department[] getDepartment() {
        return department;
    }

    public void setDepartment(Department[] department) {
        this.department = department;
    }

    public SalesMan[] getSalesMEN() {
        return salesMEN;
    }

    public void setSalesMEN(SalesMan[] salesMEN) {
        this.salesMEN = salesMEN;
    }

    public Manager[] getManagers() {
        return managers;
    }

    public void setManagers(Manager[] managers) {
        this.managers = managers;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
