package lesson10;

import lesson9.ZStudent;

public class Z_Student extends Person {

    private String[] listOfSubjects;

    public Z_Student(String name, String lastname, int year, String[] listOfSubjects) {
        super(name,lastname,year);
        this.listOfSubjects = listOfSubjects;

    }



    public String[] getListOfSubjects() {
        return listOfSubjects;
    }

    public void setListOfSubjects(String[] listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }
}
