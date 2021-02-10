package homework9AF18;

import java.util.Arrays;

public class Students {
    private String name;
    private int age;
    private String course;
    private String[] subjects;

    public Students(){}

    public Students(String name, int age, String course, String[] subjects){
        this.name=name;
        this.age=age;
        this.course=course;
        this.subjects=subjects;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public String getCourse(){
        return this.course;
    }
    public void setSubjects(String[] subjects){
        this.subjects=subjects;
    }

    public void printClass(){
        System.out.println("Student: "+name+" is "+age+" years old." + "\n Study at: "+course+".\n The "+ course
        + " consist of: "+ Arrays.toString(subjects));
    }
}
