
package hw11;

public class MotherBoard extends Device {

    public MotherBoard(String brand, String modal, int RAM, String manufacture) {
        super(brand, modal);
        this.RAM = RAM;
        this.manufacture = manufacture;

    }

    private int RAM;
    private String manufacture;

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }


}