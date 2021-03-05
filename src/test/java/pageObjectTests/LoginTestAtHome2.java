package pageObjectTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPageAtHome2;
import pageObjects.MainPageAtHome2;

public class LoginTestAtHome2 {
    private WebDriver driver;

    @BeforeMethod
    public void sturtup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
@Test
    public void LoginTestCorrectCredential(){
    LoginPageAtHome2 loginPage=new LoginPageAtHome2(driver);
    loginPage.open();
    MainPageAtHome2 mainPage=loginPage.LoginToApplication("koeluser06@testpro.io","te$t$tudent");
    Assert.assertTrue(mainPage.isMainPage());
}

}
