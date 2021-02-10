package HW_AA02_L10;

public class Contractor extends Worker{
    private int hoursPerWeek;

    protected Contractor(String name1, String lastName1, int age1, String profession, String[] empTools, int hoursPerWeek) {
        super(name1, lastName1, age1, profession, empTools);
        setHoursPerWeek(hoursPerWeek);
        this.hoursPerWeek=hoursPerWeek;
    }

    public int getHoursPerWeek(){
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek){
        if(hoursPerWeek<0){
            throw new IllegalArgumentException("Can not be negative");
        }
        this.hoursPerWeek=hoursPerWeek;
    }

    public void printClass(){
        System.out.println("Name: "+getName1()+"\nLastName: "+getLastName1()+"\nAge: "+getAge1()+"\nProfession: "+getProfession()+"\nHours per week: "+getHoursPerWeek()+"\nTools:");
        for(String v:this.empTools){
            System.out.println(v);
        }
    }
}
