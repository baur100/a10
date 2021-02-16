package homework13;

public class SecondName {
    private String SurName;

    public SecondName (String SurName){
        this.SurName=SurName;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    @Override
    public String toString() {
        return "SecondName{" +
                "SurName='" + SurName + '\'' +
                '}';
    }
}
