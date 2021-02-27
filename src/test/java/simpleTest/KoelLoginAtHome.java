package simpleTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KoelLoginAtHome {
    @Test
    public void koellogin_LoginToAppUsingCorrectCredentials_SuccessfullLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        Thread.sleep(2000);

        WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement blueButton = driver.findElement(By.xpath("//*[@type='submit']"));

        emailField.sendKeys("4potapova@gmail.com");
        passwordField.sendKeys("Noginsk16");
        blueButton.click();
        Thread.sleep(2000);

        WebElement homeIcon=driver.findElement(By.xpath("//*[@class='home active']"));
        Assert.assertTrue(homeIcon.isDisplayed());

        driver.quit();
    }

    @Test
    public void koellogin_LoginToAppUsingWrongCredentials_ErrorFrame() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io");
        Thread.sleep(2000);

        WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement blueButton = driver.findElement(By.xpath("//*[@type='submit']"));

        emailField.sendKeys("4potapova@gmail.com");
        passwordField.sendKeys("IncorrectPassword");
        blueButton.click();
        Thread.sleep(2000);

        WebElement homeIcon=driver.findElement(By.xpath("//*[@class='error']"));
        Assert.assertTrue(homeIcon.isDisplayed());

        driver.quit();
    }
}
