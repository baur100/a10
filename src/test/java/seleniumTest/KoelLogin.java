package seleniumTest;

import myPageObjects.LoginPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class KoelLogin extends BaseTest{



    @Test
    public void koelLogin_LoginToAppUsingRightCredentials() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageLocators.email));
        WebElement email = driver.findElement(LoginPageLocators.email);
        WebElement password = driver.findElement(LoginPageLocators.password);
        WebElement button = driver.findElement(LoginPageLocators.button);

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='home active']")));
        WebElement homeIcon = driver.findElement(By.xpath("//*[@class='home active']"));
        Assert.assertTrue(homeIcon.isDisplayed());

    }

    @Test
    public void koelLogin_LoginToAppUsingWrongCredentials() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='email']")));
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement button = driver.findElement(By.cssSelector("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tuden2t");
        button.click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='error']")));
        WebElement errorBorder = driver.findElement(By.xpath("//*[@class='error']"));
        Assert.assertTrue(errorBorder.isDisplayed());

    }
}
