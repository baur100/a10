package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.CalculateTicketPrice;

public class UnitTest_ExeAtHome {
    @Test
    public void calculateTicketPrice_infant_returnsZero() {
        //Arrange - preconditions - Given
        CalculateTicketPrice infant = new CalculateTicketPrice(1000, 1);

        //Act- testing  - When
        double price = infant.getPrice();

        // Assert Validate result (Ожидания)
        Assert.assertEquals(price, 0.0);
    }

    @Test
    public void calculateTicketPrice_child_50percent() {
        CalculateTicketPrice child = new CalculateTicketPrice(1000, 10);
        double priceChild= child.getPrice();
        Assert.assertEquals(priceChild,500.0);
        }

        @Test
    public void calculateTicketPrice_adult_fullPrice(){
        CalculateTicketPrice adult=new CalculateTicketPrice(1000,35);
        double priceAdult= adult.getPrice();
        Assert.assertEquals(priceAdult,1000.0);
        }

        @Test
    public void calculateTicketPrice_senior_80percent(){
        CalculateTicketPrice senior=new CalculateTicketPrice(1000,66);
        double priceSenior= senior.getPrice();
        Assert.assertEquals(priceSenior,800.0);
        }
        }



