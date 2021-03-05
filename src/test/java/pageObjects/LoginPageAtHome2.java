package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageAtHome2 {
    private WebDriver driver;
    WebDriverWait wait;

    public LoginPageAtHome2(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, 10);
    }

    private WebElement getEmailField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='password']")));
        return driver.findElement(By.cssSelector("[type='email']"));
    }

    private WebElement getPasswordField() {
        return driver.findElement(By.xpath("//*[@type='password']"));
    }

    private WebElement getLoginButton() {
        return driver.findElement(By.cssSelector("button"));
    }

    public MainPageAtHome2 LoginToApplication(String username, String password){
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPageAtHome2(driver);
    }

    public void open(){
        driver.get("https://koelapp.testpro.io");
    }

}
