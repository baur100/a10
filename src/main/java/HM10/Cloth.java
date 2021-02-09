package HM10;

import HM10.Color;
import HM10.SIZE;

public class  Cloth {
    public Color Color;
    public SIZE Size;
    public String brand;

    public Cloth(HM10.Color color, SIZE size, String brand) {

        Color = color;
        Size = size;
        this.brand = brand;
    }

    public HM10.Color getColor() {
        return Color;
    }

    public void setColor(HM10.Color color) {
        Color = color;

    }

    public SIZE getSize() {
        return Size;
    }

    public void setSize(SIZE size) {
        Size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Cloth(HM10.Color color, SIZE size) {
        Color = color;
        Size = size;

    }
    public void getDress(){
        System.out.println(brand + " " + Color + " " +  " " + Size);


    }
}

