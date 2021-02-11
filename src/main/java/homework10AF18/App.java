package homework10AF18;

public class App {
    public static void main(String[] args) {
        Meal dinner = new Meal("Beef", "Medium", 5.2, "Tomatoes", "Rye", Souses.RANCH, "Dinner", Beverages.COCA_COLA);
        String getMeat = dinner.getTypeMeat();
        System.out.println(getMeat);

        ComboMeal lunch=new ComboMeal("Chicken","Crispy",3.4,"American",Souses.BBQ,"Two for one",Beverages.JUICE,3);
        System.out.println(lunch.getRoast());
    }
}
