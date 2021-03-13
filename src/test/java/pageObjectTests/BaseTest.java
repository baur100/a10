package pageObjectTests;

import com.github.javafaker.Faker;
import enums.BrowserType;
import helpers.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected Faker faker;
    protected String username;
    protected String password;
    @Parameters({"email","password"})
    @BeforeMethod
    public void startUp(String username,String password){
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
        faker = new Faker();
        this.username = username;
        this.password = password;
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
