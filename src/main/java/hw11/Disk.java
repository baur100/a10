package hw11;

public class Disk {

    private double  accessTime;
    private double  DataTransferTime;

    public double  getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(double accessTime) {
        this.accessTime = accessTime;
    }

    public double getDataTransferTime() {
        return DataTransferTime;
    }

    public void setDataTransferTime(double  dataTransferTime) {
        DataTransferTime = dataTransferTime;
    }

    public Disk(double  accessTime, double  dataTransferTime) {
        this.accessTime = accessTime;
        DataTransferTime = dataTransferTime;


    } }