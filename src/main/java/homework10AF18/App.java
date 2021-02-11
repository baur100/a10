package homework10AF18;

public class App {
    public static void main(String[] args) {
        Meal dinner = new Meal("Beef", "Medium", 5.2, "Tomatoes", "Rye", Souses.RANCH, "Dinner", Beverages.COCA_COLA);
        String getMeat = dinner.getTypeMeat();
        System.out.println(getMeat);

        Beverages[] beverages={Beverages.JUICE, Beverages.SPRITE,Beverages.SPRITE};
        ComboMeal lunch=new ComboMeal("Chicken","Crispy",3.4,"American",Souses.BBQ,"Two for one",beverages,3);
        System.out.println(lunch.getRoast());
        System.out.println(lunch.getBeverage());
    }
}
