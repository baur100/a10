package lesson11;

public class DepartmentStore {
    private Department[] departments;
    private SalesMan[] salesMEN;
    private Manager[] managers;
    private Address address;

    public DepartmentStore(Department[] departments, SalesMan[] salesMEN, Manager[] managers, Address address) {
        this.departments = departments;
        this.salesMEN = salesMEN;
        this.managers = managers;
        this.address = address;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
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
