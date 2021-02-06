package homework8AF18;

public class Shop {
    public String address;
    public String name;
    public int hours;

    public String getInfo(){
        String time=". Time of work per day: ";
        return name+address+time+hours;
    }
}
