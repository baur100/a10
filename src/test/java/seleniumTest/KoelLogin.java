package seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class KoelLogin {

    private WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void startUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        wait = new WebDriverWait(driver, 10, 200);
        driver.get("https://koelapp.testpro.io/");

    }
    @AfterMethod
    public void shutDown() throws InterruptedException {
        driver.quit();
    }

    @Test
    public void koelLogin_LoginToAppUsingRightCredentials() throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='email']")));
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement button = driver.findElement(By.cssSelector("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        button.click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='home active']")));
        WebElement homeIcon = driver.findElement(By.xpath("//*[@class='home active']"));
        Assert.assertTrue(homeIcon.isDisplayed());

    }

    @Test
    public void koelLogin_LoginToAppUsingWrongCredentials() throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='email']")));
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement button = driver.findElement(By.cssSelector("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tuden2t");
        button.click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='error']")));
        WebElement errorBorder = driver.findElement(By.xpath("//*[@class='error']"));
        Assert.assertTrue(errorBorder.isDisplayed());

    }
}
