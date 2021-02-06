package lesson10;

public class App {
    public static void main(String[] args) {
        String[] subjects = {"Math","Economics"};
        Student edward = new Student("Edward","Swanson",1999,subjects);
        Teacher mrJones = new Teacher("Bill","Jones",1985,Subjects.MATH);

        System.out.println(edward.getLastName());

        OnlineStudent simon = new OnlineStudent("Simon","Perrie",2002,subjects,"Montreal");

        String str= new String("Hello");

        Colors apple = Colors.RED;
        // "RED" ,"Red", "red", "rED"


    }
}
