package hw11;

public class Monitor {
    private String model;
    private int size;

    public Monitor(String model, int size){
        this.model = model;
        this.size = size;
    }


    public void setModel(String model){
              this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setSize(int size){
        this.size = size;
    }
    public int getSize() {
        return size;
    }
}
