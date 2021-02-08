package homework8AF18;

import java.sql.SQLOutput;

public class Toys {
    public String noize;
    public int parts;
    public int age;
    public String name;

    public void DoNoize(){
        System.out.println("The "+name+" can do "+ noize);
    }

    public void info(){
        System.out.println("The "+name+" consist of "
                +parts+" parts. And "+name
                +" can be used by children from "
                +age+" years old.");
    }
}
