package pageObjectTests;

import com.github.javafaker.Faker;
import enums.BrowserType;
import helpers.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected Faker faker;
    @BeforeMethod
    public void startUp(){
        driver = BrowserFabric.getDriver(BrowserType.FIREFOX);
        faker = new Faker();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
