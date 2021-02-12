package HomeWorkL10;

public class Counter extends Worker{
    private String location;
    public Counter(String name,String lastName,int year,String[] listOfResponsibilities,String location){
        super(name,lastName,year,listOfResponsibilities);
        this.location=location;
    }

}
