package lesson11;

public class School {
    private SchoolType schoolType;
    private SchoolLevel schoolLevel;
    private Address address;
    private String name;

    public School(SchoolType schoolType, SchoolLevel schoolLevel, Address address, String name) {
        this.schoolType = schoolType;
        this.schoolLevel = schoolLevel;
        this.address = address;
        this.name = name;
    }

    public SchoolType getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(SchoolType schoolType) {
        this.schoolType = schoolType;
    }

    public SchoolLevel getSchoolLevel() {
        return schoolLevel;
    }

    public void setSchoolLevel(SchoolLevel schoolLevel) {
        this.schoolLevel = schoolLevel;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
