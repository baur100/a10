package lesson11;

public class App {
    public static void main(String[] args) {
        Address schoolAddress = new Address("11 Elm Str","Gotham City",State.PA,33209);
        School school = new School(SchoolType.PUBLIC,SchoolLevel.MIDDLE,schoolAddress,"Gotham middle school");


        System.out.println(school.getAddress().getCity());
    }
}
