package simpleTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class KoelLogin {
    private WebDriver driver;
    WebDriverWait wait;
    FluentWait<WebDriver> fluentWait;
    @BeforeMethod
    public void startUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,10,200);
        fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        driver.get("https://koelapp.testpro.io/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void koelLogin_LoginToAppUsingCorrectCredintials_SuccessfulLogin() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='email']")));
        WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement passwordField = driver.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement blueButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("te$t$tudent");
        blueButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='home active']")));
        WebElement homeIcon = driver.findElement(By.xpath("//*[@class='home active']"));
        Assert.assertTrue(homeIcon.isDisplayed());
    }
    @Test
    public void koelLogin_LoginToAppUsingWrongCredintials_ErrorFrame() throws InterruptedException {
        fluentWait.until(x->x.findElement(By.xpath("//*[@type='email']")));
        WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement passwordField = driver.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement blueButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("IncorrectPassword");
        blueButton.click();
        fluentWait.until(x->x.findElement(By.xpath("//*[@class='error']")));
        WebElement homeIcon = driver.findElement(By.xpath("//*[@class='error']"));
        Assert.assertTrue(homeIcon.isDisplayed());
    }
}
