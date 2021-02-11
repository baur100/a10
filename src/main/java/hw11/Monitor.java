package hw11;

public class Monitor extends Device  {

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Monitor(String brand, String modal, int num) {
        super(brand, modal);
        this.num = num;


    }
}



