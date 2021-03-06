package myPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageFactory {
    private WebDriver driver;

    @FindBy(css = "[type='email']")
    private WebElement email;

    @FindBy(xpath = "//*[type='password']")
    private WebElement password;

    @FindBy(tagName = "button")
    private WebElement button;

    @FindBy(className = "error")
    private WebElement error;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
//        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://koelapp.testpro.io/");
    }
//    private WebElement getError() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")));
//        return driver.findElement(By.cssSelector(".error"));
//    }

    public MyMainPage loginToApp(String username, String password) {
        email.sendKeys(username);
        this.password.sendKeys(password);
        button.click();
        return new MyMainPage(driver);

    }

//    public boolean isError() {
//        try {
//            return getError().isDisplayed();
//        } catch (TimeoutException ignored) {return false;}
//
//    }


}
