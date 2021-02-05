package HomeWork08;

public class Pool {
    public String name;
    public int length;
    public int wide;
    public int depth;

    public void volume() {
        System.out.println("The volume "+name+" pool is "+(length*wide* depth));
    }

    public void safety() {
        if (depth > 3) {
            System.out.println("The depth of " + name + " is " + depth + " , it is safe to dive");
        }
        System.out.println("The depth of " + name + " is " + depth + " , it is NOT safe to dive");
    }



}
