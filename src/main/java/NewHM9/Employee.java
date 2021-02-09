package NewHM9;

public class Employee {
    public String name;
    public   String title;
    public  int workExperience;

    public Employee(String name, String title, int workExperience) {
        this.name = name;
        this.title = title;
        this.workExperience = workExperience;
    }

    public Employee () {};



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
        public void Info(){
            System.out.println("Employee name"+" " + name + " " + " Employee title"+ " " + title+ " " + " Employee work experience  "+ " " + workExperience);

    }
}