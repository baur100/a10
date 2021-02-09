package HM10;

public class IdahoUniversities {
    public static void main(String[] args) {
       University U1 = new University("Boise State University",  UniversityType.PUBLIC);

       University U2 = new University("University of Idaho", UniversityType.PRIVATE );

       U1.UnInfo();
       U2.UnInfo();
    }
}