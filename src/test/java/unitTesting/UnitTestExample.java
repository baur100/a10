package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.CalculateTicketPrice;

public class UnitTestExample {
    @Test
    public void calculateTicketPrice_infant_returnsZero(){
        // Arrange - preconditions - Given
        CalculateTicketPrice infant = new CalculateTicketPrice(1000,1);

        // Act - testing - When
        double price = infant.getPrice();

        // Assert - validate result - Then
        Assert.assertEquals(price,0.0);
    }
    @Test
    public void calculateTicketPrice_child_50percent(){
        CalculateTicketPrice child = new CalculateTicketPrice(1000,10);

        double price = child.getPrice();

        Assert.assertEquals(price,500.0);
    }
    @Test
    public void calculateTicketPrice_adult_fullPrice(){
        CalculateTicketPrice adult = new CalculateTicketPrice(1000,35);
        double price=adult.getPrice();
        Assert.assertEquals(price,1000.0);
    }
    @Test
    public void calculateTicketPrice_senior_80percent(){
        CalculateTicketPrice senior = new CalculateTicketPrice(1000,70);
        double price = senior.getPrice();
        Assert.assertEquals(price,800.0);
    }
}
