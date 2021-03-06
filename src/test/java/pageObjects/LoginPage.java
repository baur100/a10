package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{
    Logger logger = LogManager.getLogger(LoginPage.class);
    public LoginPage(WebDriver driver) {
        super(driver);
        logger.debug("Login page object created");
    }
    private WebElement getEmailField(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageLocators.email));
        return driver.findElement(LoginPageLocators.email);
    }
    private WebElement getPasswordField(){
        return driver.findElement(LoginPageLocators.password);
    }
    private WebElement getLoginButton(){
        return driver.findElement(LoginPageLocators.button);
    }
    public MainPage loginToApplication(String username,String password){
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public void open(){
        driver.get("https://bbb.testpro.io/");
    }

    private WebElement getError(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageLocators.error));
        return driver.findElement(LoginPageLocators.error);
    }
    public boolean isError() {
        try {
            return getError().isDisplayed();
        } catch (TimeoutException ignored){
            return false;
        }
    }
}
