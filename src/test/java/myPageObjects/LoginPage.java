package myPageObjects;


import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getEmailField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageLocators.email));
        return driver.findElement(LoginPageLocators.email);
    }
    private  WebElement getPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageLocators.passwordField));
        return driver.findElement(LoginPageLocators.passwordField);
    }
    private WebElement getButton() {
        return driver.findElement(LoginPageLocators.button);
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageLocators.error));
        return driver.findElement(LoginPageLocators.error);
    }

    public boolean isError() {
        try {
            return getError().isDisplayed();
        } catch (TimeoutException ignored) {return false;}

    }
}
