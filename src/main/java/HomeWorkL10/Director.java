package HomeWorkL10;

public final class Director extends Human{

    private String responsibility;

    public Director(String name,String lastName,int year,String responsibility){
        super(name,lastName,year);

        this.responsibility=responsibility;

    }

    public String getResponsibility(){
        return responsibility;
    }
    public void setResponsibility(String responsibility){
        this.responsibility=responsibility;
    }


}
