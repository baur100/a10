package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.CalculateTicketPrice;

public class UnitTestExample {
    @Test
    public void calculateTicketPrice_infant_returnsZero(){
        CalculateTicketPrice infant = new CalculateTicketPrice(500,1);
        double price = infant.getPrice();
        Assert.assertEquals(price,0.0);
    }
    @Test
    public void calculateTicketPrice_child_50percent(){
        CalculateTicketPrice child = new CalculateTicketPrice(500,10);
        double price = child.getPrice();
        Assert.assertEquals(price,250.0);
    }
    @Test
    public void calculateTicketPrice_adult_fullPrice(){
        CalculateTicketPrice adult = new CalculateTicketPrice(500,35);
        double price=adult.getPrice();
        Assert.assertEquals(price,500.0);
    }
    @Test
    public void calculateTicketPrice_senior_80percent(){
        CalculateTicketPrice senior = new CalculateTicketPrice(500,70);
        double price = senior.getPrice();
        Assert.assertEquals(price,400.0);
    }
}
