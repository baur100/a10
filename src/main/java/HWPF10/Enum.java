package HWPF10;

public class Enum {
    private String name;
    private String lastName;
    private CameraModel make;

    public Enum(String name, String lastName, CameraModel make) {
        this.name = name;
        this.lastName = lastName;
        this.make = make;
    }
    public Enum(){}


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

    public CameraModel getMake() {
        return make;
    }

    public void setMake(CameraModel make) {
        this.make = make;


            System.out.println("Name: " + getName() + "Last name: " + getLastName() + "Camera Model: " + getMake());

        }
    }
