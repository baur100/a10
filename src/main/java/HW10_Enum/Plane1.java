package HW10_Enum;

public class Plane1 {
    private String brand;
    private Type1 type;
    private Engine1 engine;


    public Plane1(String brand, Type1 type, Engine1 engine) {
        this.brand = brand;
        this.type = type;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Type1 getType() {
        return type;
    }

    public void setType(Type1 type) {
        this.type = type;
    }

    public Engine1 getEngine() {
        return engine;
    }

    public void setEngine(Engine1 engine) {
        this.engine = engine;
    }
}
