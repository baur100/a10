package lesson15;

public class Person {
    private String name;
    private String lastName;
    private static int mia = 0;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        mia++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    public static void sayHello(String name){
        System.out.println("Hello "+name+" "+mia);
    }
}
