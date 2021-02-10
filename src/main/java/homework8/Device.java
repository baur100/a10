package homework8;

public class Device {
    public String name;
    public String size;
    public String color;
    public int memory;

    public void repair() {
        System.out.println("I need repair my " + name + " " + size + " with size memory " + memory);
    }

        public String timeOfRepair () {
            return name+ " " +size+ ", " +color+ " color will be ready after week";
        }
    }

