package HWPF10;

public class LightAs extends Human {

   protected String[]listOfResponsibilities;

    public LightAs(String name,String lastName,int year,String[]listOfResponsibilities){
        super(name, lastName, year);
        this.listOfResponsibilities = listOfResponsibilities;
    }


    public String[] getresponsibilities() {
        return listOfResponsibilities;
    }

    public void setListOfResponsibilities(String[]listOfResponsibilities) {
        this.listOfResponsibilities = listOfResponsibilities;
    }
}
