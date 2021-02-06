package lesson10;

public class Student extends Person{
    protected String[]listOfSubjects;

    public Student(String name, String lastName, int year, String[] listOfSubjects) {
        super(name,lastName,year);
        this.listOfSubjects = listOfSubjects;
    }

    public String[] getListOfSubjects() {
        return listOfSubjects;
    }

    public void setListOfSubjects(String[] listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }
}
