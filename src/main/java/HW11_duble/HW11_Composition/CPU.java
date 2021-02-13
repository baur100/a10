package HW11_duble.HW11_Composition;

public class CPU {
    private String brand;
    private String model;
    private int nunberCore;

    public CPU(String brand, String model, int nunberCore) {
        this.brand = brand;
        this.model = model;
        this.nunberCore = nunberCore;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNunberCore() {
        return nunberCore;
    }

    public void setNunberCore(int nunberCore) {
        this.nunberCore = nunberCore;
    }
}
