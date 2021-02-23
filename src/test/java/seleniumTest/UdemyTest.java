package seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UdemyTest {
    @Test
    public void searchTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://udemy.com");

        WebElement searchFIeld = driver.findElement(By.cssSelector("[placeholder='What do you want to learn?']"));
        searchFIeld.sendKeys("Java");
        searchFIeld.sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        WebElement searchResult = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals("10,000 results for “java”", searchResult.getText());

        driver.quit();
    }

}
