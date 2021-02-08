package HW9;

public class Plane {
    private String name;
    private int model;
    private String manufacturer;
    private String country;
    private int numberOfsets;
    private String[]users;

    public Plane(String name, int model, String manufacturer, String country, int numberOfsets, String[]users){ //Constructor 4
        this.name=name;
        this.model=model;
        this.manufacturer=manufacturer;
        this.country=country;
        this.numberOfsets=numberOfsets;
        this.users=users;
            }
    public Plane(){  //Empty Constructor

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getModel() {
        return this.model;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer=manufacturer;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getCountry(){
        return this.country;
    }
    public void setNumberOfsets(int numberOfsets){
        if(numberOfsets>500 ||numberOfsets<0){
            throw new IllegalArgumentException("Wrong number of sets, number of sets must be between 0 and 500");//проверка кол-во мест
        }
        this.numberOfsets=numberOfsets;

    }
    public int getNumberOfsets(){
        return this.numberOfsets;
    }
    public String[] getUsers(){
        return this.users;
    }
    public void setUsers(String[] users){
        this.users=users;
    }
    public void printinfo(){//Метод Принт класс для распечатки всех полей
        System.out.println("Name = "+this.name+", Model = "+this.model+", Manufacture = "+this.manufacturer+", Country = "+
        this.country+", Number of sets = "+this.numberOfsets+", Users are ");
        for(String v : this.users){
            System.out.println(v);
        }
    }
}
