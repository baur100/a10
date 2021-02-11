package homework11AF18;

public class Monitor {
    private String brand;
    private double diagonal;
    private String model;

    public Monitor(String brand, double diagonal, String model) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
