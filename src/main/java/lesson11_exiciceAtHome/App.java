package lesson11_exiciceAtHome;

public class App {
    public static void main(String[] args) {
        Address schoolAdress = new Address("11 Elm St.","Gotham",State.PA, 33209);
        School school=new School(SchoolType.PUBLIC,SchoolLevel.MIDDLE,schoolAdress,"Gotham middle school");

        System.out.println(school.getAddress().getCity());



            }
}
