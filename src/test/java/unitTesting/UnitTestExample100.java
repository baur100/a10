package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.CalculateTicketPrice;

public class UnitTestExample100 {
    @Test
    public void calculateTicketPrice_infant_returnsZero(){
        CalculateTicketPrice infant = new CalculateTicketPrice(100,1);
        double price = infant.getPrice();
        Assert.assertEquals(price,0.0);
    }
    @Test
    public void calculateTicketPrice_child_50percent(){
        CalculateTicketPrice child = new CalculateTicketPrice(100,10);
        double price = child.getPrice();
        Assert.assertEquals(price,50.0);
    }
    @Test
    public void calculateTicketPrice_adult_fullPrice(){
        CalculateTicketPrice adult = new CalculateTicketPrice(100,35);
        double price=adult.getPrice();
        Assert.assertEquals(price,100.0);
    }
    @Test
    public void calculateTicketPrice_senior_80percent(){
        CalculateTicketPrice senior = new CalculateTicketPrice(100,70);
        double price = senior.getPrice();
        Assert.assertEquals(price,80.0);
    }
}
