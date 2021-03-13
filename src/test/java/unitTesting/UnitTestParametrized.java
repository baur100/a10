package unitTesting;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tickets.CalculateTicketPrice;

public class UnitTestParametrized {
    @DataProvider (name = "testData")
    public Object[][] getTestData() {
        return new Object[][] {
                {1, 1000, 0.0},
                {5, 1000, 500.0},
                {29, 1000, 1000.0},
                {75, 1000, 800.0},
        };
    }
    @Test(dataProvider = "testData")
    public void calculateTicketPrice(int age, int fare, double price) {
        CalculateTicketPrice person = new CalculateTicketPrice(fare, age);
        double result = person.getPrice();
        Assert.assertEquals(price, result);
    }
}
