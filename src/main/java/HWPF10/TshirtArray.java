package HWPF10;

public class TshirtArray {
    private String brand;
    private Size[] sizes;


    public TshirtArray(String brand, Size[] sizes) {
        this.brand = brand;
        this.sizes = sizes;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Size[] getSizes() {
        return sizes;
    }

    public void setSizes(Size[] sizes) {
        this.sizes = sizes;
    }

    

}
