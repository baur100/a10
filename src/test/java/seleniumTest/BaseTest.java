package seleniumTest;

import Helpers.BrowserFabric;
import com.github.javafaker.Faker;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    WebDriverWait wait;
    protected Faker faker;
    protected String username;
    protected String password;
    @Parameters({"email", "password", "browser"})
    @BeforeMethod
    public void startUp(String username,String password, String browser){
        BrowserType browserType = browser.equals("chrome") ? BrowserType.CHROME : BrowserType.FIREFOX;
//        driver = BrowserFabric.getDriver(browserType);
        faker = new Faker();
        this.username = username;
        this.password = password;
    }
    @AfterMethod
    public void shutDown() {
        driver.quit();
    }

}
