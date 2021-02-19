package HW_AA02_L9;

public class Worker {
    private String lastName;
    private int age;
    private String[] tools;

    public Worker(String lastName, int age, String[] tools){
        this.lastName = lastName;
        this.age = age;
        this.tools = tools;
    }

    public Worker(){};

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        if(this.age<0){
            throw new IllegalArgumentException("The age can not be negative");
        }
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String[] getTools(){
        return tools;
    }

    public void setTools(String [] tools){
        this.tools = tools;
    }

    public void printClass(){
        System.out.println("Worker lastname: "+getLastName()+"\nAge: "+getAge()+"\n Worker are using next tools: ");
        for(String v:this.tools){
            System.out.println(v);
        }
    }
}
