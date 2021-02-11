package hw11;

public class Keyboard {
    private String brand;
    private String model;
    private String [] language;


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

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public Keyboard(String brand, String model, String[] lan) {
        this.brand = brand;
        this.model = model;
        this.language = lan;


    }
}


