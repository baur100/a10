package homework9AF18;

public class Work {
    public static void main(String[] args) {
        String[] crs1={"Economic","Sociology","Politology"};
        University u1=new University("Florida Medical University", 222, "20th Ave",crs1);

        String[] crs2={"Modern art","Literature","Composition of picture"};
        University u2=new University();
        u2.setName("Ney York art school");
        u2.setBuilding(1010);
        u2.setAddress("Ocean Drive St");
        u2.setCourses(crs2);

        u1.printClass();
        System.out.println("================================");
        u2.printClass();

        String[] tchrs1={"Stiff","Freeman","Pollonsky"};
        Courses course1= new Courses("Economic",48,518,tchrs1);

        String[] tchrs2={"Colomy","Bushuew"};
        Courses course2=new Courses();
        course2.setName("Politology");
        course2.setStudents(58);
        course2.setRoom(112);
        course2.setTeachers(tchrs2);

        course1.printClass();
        System.out.println("================================");
        course2.printClass();

        String[] sub1={"Picture","Photo","Color"};
        Students st1=new Students("Mary",22,"Modern art",sub1);

        String[] sub2={"Mathematics","World economics","Analytic"};
        Students st2=new Students();
        st2.setName("Andrew");
        st2.setAge(21);
        st2.setCourse("Economic");
        st2.setSubjects(sub2);

        st1.printClass();
        System.out.println("==========================");
        st2.printClass();
    }
}
