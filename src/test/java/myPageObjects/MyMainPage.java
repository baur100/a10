package myPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyMainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public MyMainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 200);
    }

    private WebElement getHomeButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home1")));
        return driver.findElement(By.cssSelector(".home1"));
    }

    public boolean isMainPage() {
        try {
            return getHomeButton().isDisplayed();
        } catch (TimeoutException ignore) {
            return false;
        }
    }
}
