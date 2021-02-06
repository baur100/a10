package lesson9nik;

public class App1 {
    public static void main(String[] args) {
        String[] subjs={"Mth","History","Chemistry"};
        Student michael = new Student(name: "Michael", lastName: "Jonson", year: 2001,subjs);

        michael.printInfo();
    }
}
