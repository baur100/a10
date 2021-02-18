package homework15AF18;

public class AgreeCultural {
    private String nameOfCulture;
    private int fielsNumber;

    public AgreeCultural(String nameOfCulture, int fielsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fielsNumber = fielsNumber;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public int getFielsNumber() {
        return fielsNumber;
    }

    public void setFielsNumber(int fielsNumber) {
        this.fielsNumber = fielsNumber;
    }

    @Override
    public String toString() {
        return "Agree Cultural: "+ nameOfCulture +
                ", number of field = " + fielsNumber;
    }
}
