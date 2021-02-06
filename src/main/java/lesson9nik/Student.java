package lesson9nik;

public class Student {
    private String name;
    private String lastName;
    private int year;
    private String[]subjects;

    public void printInfo(){
        System.out.println("Name = "+this.name+"\nLastName = " + this.lastName +
                "\nYear = "+ this.year+"\nSubjects:");
        for (String V : subjects){
            System.out.println(v);
        }

    }
}
