package lesson9;

public class ZApp1 {
    public static void main(String[] args) {

        String[] subjs = {"Math", "History", "Chemistry"};
        Student michel = new Student("Michel", "Jonson", 2001, subjs);
        michel.printInfo();
    }
}
