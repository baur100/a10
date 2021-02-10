package homeWork09;

import java.util.Arrays;

public class Forecast {
    private String location;
    private int[] forecast;
    private Condition[] conditions;

    public Forecast(String location, int[] forecast, Condition[] conditions) {
        this.location=location;
        this.forecast=forecast;
        this.conditions=conditions;

    }

    public void setConditions(Condition[] conditions) {this.conditions = conditions;}
    public void setForecast(int[] forecast) {this.forecast = forecast;}
    public void setLocation(String location) {this.location = location;}

    public Condition[] getConditions() {return conditions;}
    public int[] getForecast() {return forecast;}
    public String getLocation() {return location;}

    public Forecast () {}

    public void printClass() {
        System.out.println("The weather in "+location+" is "+Arrays.toString(conditions)+" and forecast for next days is "+Arrays.toString(forecast));
    }

}
