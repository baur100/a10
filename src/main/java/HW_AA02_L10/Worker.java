package HW_AA02_L10;

public class Worker extends Employee {
    protected String profession;
    protected String [] empTools;

    public Worker(String name1, String lastName1, int age1, String profession, String [] empTools){
        super(name1, lastName1, age1);
        this.profession = profession;
        this.empTools = empTools;
    }

    public String getProfession(){
        return profession;
    }

    public void setProfession(String profession){
        this.profession = profession;
    }

    public String[] getEmpTools(){
        return empTools;
    }

    public void setEmpTools(String[] empTools){
        this.empTools = empTools;
    }
}
