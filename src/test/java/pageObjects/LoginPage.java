package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait= new WebDriverWait(driver,10);
    }
    private WebElement getEmailField(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='email']")));
        return driver.findElement(By.cssSelector("[type='email']"));
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.xpath("//*[@type='password']"));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.cssSelector("button"));
    }
    public MainPage loginToApplication(String username,String password){
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public void open(){
        driver.get("https://koelapp.testpro.io/");
    }

    private WebElement getError(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")));
        return driver.findElement(By.cssSelector(".error"));
    }
    public boolean isError() {
        try {
            return getError().isDisplayed();
        } catch (TimeoutException ignored){
            return false;
        }
    }
}
