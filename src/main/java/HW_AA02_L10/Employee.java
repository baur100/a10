package HW_AA02_L10;

public class Employee {
    protected String name1;
    protected String lastName1;
    protected int age1;

    public Employee(){}

    public Employee(String name1, String lastName1, int age1){
        setAge1(age1);
        this.name1 = name1;
        this.lastName1 = lastName1;
        this.age1 = age1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1){
        this.name1 = name1;
    }

    public String getLastName1(){
        return lastName1;
    }

    public void setLastName1(String lastName1){
        this.lastName1 = lastName1;
    }

    public int getAge1(){
        return age1;
    }

    public void setAge1(int age1){
        if(age1<0){
            throw new IllegalArgumentException("Can not be negative");
        }
        this.age1 = age1;
    }

}
