package homework15;

public class AgreeCultural {
    private String nameOfCulture;
    private int fieldNumber;

    public AgreeCultural(String nameOfCulture, int fieldNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldNumber = fieldNumber;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    @Override
    public String toString() {
        return "AgreeCultural{" +
                "nameOfCulture='" + nameOfCulture + '\'' +
                ", fieldNumber=" + fieldNumber +
                '}';
    }
}
