package lesson10;

public class Z_App {
    public static void main(String[] args) {
        String[]subjects={"Math","History","English"};
        Student pety = new Student("Pety","Potapov",1870,subjects);
        Teacher mrJones=new Teacher("Bill","Jons",1982,Subjects.MATH);


        System.out.println(pety.lastName);
    }

}
