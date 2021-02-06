package lesson9;

public class App1 {
    public static void main(String[] args) {
        String[] subjs={"Math","History","Chemistry"};
        Student michael = new Student("Michael","Jonson",2001,subjs);

        michael.printInfo();

    }
}
