package HomeWorkL10;

public class Worker extends Human{

    String[]listOfResponsibilities;

    public Worker(String name,String lastName,int year,String[]listOfResponsibilities){

        super(name,lastName,year);

        this.listOfResponsibilities=listOfResponsibilities;
    }

    public String[] getListOfResponsibilities(){
        return listOfResponsibilities;
    }
    public void setListOfResponsibilities(String[] listOfResponsibilities){
        this.listOfResponsibilities=listOfResponsibilities;
    }
}
