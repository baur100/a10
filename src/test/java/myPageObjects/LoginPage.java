package myPageObjects;

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
        wait = new WebDriverWait(driver, 10, 200);
    }

    private WebElement getEmailField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='email']")));
        return driver.findElement(By.cssSelector("[type='email']"));
    }
    private  WebElement getPassword() {
        return driver.findElement(By.cssSelector("[type='password']"));
    }
    private WebElement getButton() {
        return driver.findElement(By.cssSelector("button"));
    }

    public MyMainPage loginToApp(String username, String password) {
        getEmailField().sendKeys(username);
        getPassword().sendKeys(password);
        getButton().click();
        return new MyMainPage(driver);

    }

    public void open() {
        driver.get("https://koelapp.testpro.io/");
    }
    private WebElement getError() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")));
        return driver.findElement(By.cssSelector(".error"));
    }

    public boolean isError() {
        try {
            return getError().isDisplayed();
        } catch (TimeoutException ignored) {return false;}

    }
}
