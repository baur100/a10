package lesson9;

public class ZPerson1sConstructorom {
    private String name;
    private String lastName;
    private int year;

    public ZPerson1sConstructorom(String name, String lastName, int year){      //Конструктор для ZPerson1sConstructorom
        this.name=name;
        this.lastName=lastName;
        setYear(year);//Проверка года в конструкторе. Вызываем функцию SetYear(внизу) и она проверяет правильный год или нет
    }
    public ZPerson1sConstructorom(String name, String lastName){    // 2-ой Конструктор
        this.name=name;
        this.lastName=lastName;
    }
    public ZPerson1sConstructorom(){                                // Empty Constructor

    }


    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String l){
        lastName=l;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year1){
        if (year1>2021 || year1<1900){
            throw new IllegalArgumentException("Wrong year");//проверка года
        }
        year=year1;
    }
}
