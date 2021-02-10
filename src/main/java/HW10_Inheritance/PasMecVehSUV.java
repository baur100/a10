package HW10_Inheritance;

public class PasMecVehSUV extends PassangerMechanicleVehicle{
    private String type;

    public PasMecVehSUV(String brand, String model, String make, String[] devices, int numberOfsets, String type) {
        super(brand, model, make, devices, numberOfsets);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

