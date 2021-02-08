package homeWork09;

public class App2 {
    public static void main(String[] args) {

        int[] for1 = {-2, 0, 5, 9, 3, 2};
        Condition[] cond1 = {Condition.RAIN, Condition.WINDY};
        Condition[] cond2 = {Condition.SUNNY};
        Forecast newYork = new Forecast("New York", for1, cond1);
        Forecast newJersey = new Forecast();

        newYork.printClass();

        newJersey.setLocation("New Jersey");
        newJersey.setConditions(cond2);
        System.out.println(newJersey.getLocation());

    }


}
