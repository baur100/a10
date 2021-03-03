package simpleTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WashGasLoginExplicitilyWait {
    private WebDriver driver;
    WebDriverWait wait;


    @BeforeMethod
    public void startUp() {
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10, 200);
        driver.get("https://eservice.washgas.com/Pages/Login.aspx");
    }

    @AfterMethod

    public void tearDown() {
        driver.quit();
    }

    @Test
    public void WashGasLoginSuccessfull() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_SPWebPartManager1_g_778d3a08_260c_4a12_808d_a051c9581a61_ctl00_txtEmail']")));
        WebElement emailField = driver.findElement(By.xpath("//*[@id='ctl00_SPWebPartManager1_g_778d3a08_260c_4a12_808d_a051c9581a61_ctl00_txtEmail']"));
        WebElement passwordField = driver.findElement(By.cssSelector("[id='ctl00_SPWebPartManager1_g_778d3a08_260c_4a12_808d_a051c9581a61_ctl00_txtPassword']"));
        WebElement signInButton = driver.findElement(By.xpath("//*[@value='Sign In']"));

        emailField.sendKeys("2004vgp@gmail.com");
        passwordField.sendKeys("Ktm5113vz@");
        signInButton.click();
    }
}

