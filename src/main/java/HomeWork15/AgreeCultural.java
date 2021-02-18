package HomeWork15;

public class AgreeCultural {
    private String nameOfCulture;
    private int fieldsNumber;

    public AgreeCultural(String nameOfCulture, int fieldsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
    }

    @Override
    public String toString() {
        return nameOfCulture+" ("+fieldsNumber+" fields)";
    }
}
