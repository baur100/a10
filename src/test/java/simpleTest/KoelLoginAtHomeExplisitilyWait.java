package simpleTest;

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

public class KoelLoginAtHomeExplisitilyWait {
    private WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod//функция кот. будет работать перед каждым методом это предост. TestNG
    public void startUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait=new WebDriverWait(driver,10,200);//Explisitily
        driver.get("https://koelapp.testpro.io");
            }
    @AfterMethod//метод кот. будет работать после каждого метода в классе это предост. TestNG
    public void tearDown() throws InterruptedException {
                driver.quit();
    }
    @Test
    public void koellogin_LoginToAppUsingCorrectCredentials_SuccessfullLogin() throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='email']")));//Explisitily

        WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement blueButton = driver.findElement(By.xpath("//*[@type='submit']"));

        emailField.sendKeys("4potapova@gmail.com");
        passwordField.sendKeys("Noginsk16");
        blueButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='home active']")));//Explisitily

        WebElement homeIcon=driver.findElement(By.xpath("//*[@class='home active']"));
        Assert.assertTrue(homeIcon.isDisplayed());// это предост. TestNG
    }
    @Test
    public void koellogin_LoginToAppUsingWrongCredentials_ErrorFrame() throws InterruptedException {
        WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement blueButton = driver.findElement(By.xpath("//*[@type='submit']"));

        emailField.sendKeys("4potapova@gmail.com");
        passwordField.sendKeys("IncorrectPassword");
        blueButton.click();

        WebElement homeIcon=driver.findElement(By.xpath("//*[@class='error']"));
        Assert.assertTrue(homeIcon.isDisplayed());

    }
}
