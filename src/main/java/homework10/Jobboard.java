package homework10;

public class Jobboard {
    protected String name;
    protected String type;
    protected String time;
    protected String location;

    public Jobboard(String name, String type, String time, String location){
        this. name = name;
        this.type = type;
        this.time = time;
        this.location = location;
    }
    public Jobboard(){}

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setTime (String time){
        this.time = time;
    }
    public String getTime(){
        return time;
    }
    public void setLocation (String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
}
