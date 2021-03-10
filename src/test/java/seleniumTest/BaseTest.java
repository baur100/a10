package seleniumTest;

import Helpers.BrowserFabric;
import com.github.javafaker.Faker;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    WebDriverWait wait;
    protected Faker faker;

    @BeforeMethod
    public void startUp() {

        driver = BrowserFabric.getDriver(BrowserType.CHROME);
//        driver.get("https://koelapp.testpro.io/");
        faker = new Faker();

    }
    @AfterMethod
    public void shutDown() {
        driver.quit();
    }

}
