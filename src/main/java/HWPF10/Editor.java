package HWPF10;

public class Editor extends LightAs{
    private String[]listOfResponsibilities;
    private String location;
    public Editor(String name,String lastName,int year,String[]listOfResponsibilities,String location){

        super(name,lastName,year,listOfResponsibilities);
        this.location = location;
        this.listOfResponsibilities =listOfResponsibilities;
    }

    public String[] getlistOfResponsibilities() {
        return listOfResponsibilities;
    }

    public void setlistOfResponsibilities(String[]listOfResponsibilities) {
        this.listOfResponsibilities = listOfResponsibilities;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
