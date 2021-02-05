package HomeWork08;

public class Pool {
    public String name;
    public int length;
    public int wide;
    public int depth;

    public void volume() {
        System.out.println("The volume of "+name+" pool is "+(length*wide* depth)+" feet");
    }

    public void safety() {
        if (depth > 3) {
            System.out.println("The depth of the " + name + " is " + depth + " feet , it is safe to dive");
        }
        if (depth <= 3) {
            System.out.println("The depth of the " + name + " is " + depth + " feet , it is NOT safe to dive");
        }
    }



}
