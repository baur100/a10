package lesson11;

public class ZDepatmentStore {

    private ZDepartment[] departments;
    private ZSalesMan[]  salesMEN;
    private ZManager[] managers;
    private ZAddress address;

    public ZDepatmentStore(ZDepartment[] departments, ZSalesMan[] salesMEN, ZManager[] managers, ZAddress address) {
        this.departments = departments;
        this.salesMEN = salesMEN;
        this.managers = managers;
        this.address = address;
    }

    public ZDepartment[] getDepartments() {
        return departments;
    }

    public void setDepartments(ZDepartment[] departments) {
        this.departments = departments;
    }

    public ZSalesMan[] getSalesMEN() {
        return salesMEN;
    }

    public void setSalesMEN(ZSalesMan[] salesMEN) {
        this.salesMEN = salesMEN;
    }

    public ZManager[] getManagers() {
        return managers;
    }

    public void setManagers(ZManager[] managers) {
        this.managers = managers;
    }

    public ZAddress getAddress() {
        return address;
    }

    public void setAddress(ZAddress address) {
        this.address = address;
    }
}
