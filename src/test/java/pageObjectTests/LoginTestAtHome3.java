package pageObjectTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPageAtHome3;
import pageObjects.MainPageAtHome3;

public class LoginTestAtHome3 {
    private WebDriver driver;

    @BeforeMethod
    private void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    private void teaDown() {
        driver.quit();
    }

    @Test
    public void loginTestWithCorrectCredentials(){
        LoginPageAtHome3 loginPage=new LoginPageAtHome3(driver);
        loginPage.open();
        MainPageAtHome3 mainPage=loginPage.loginToApplication("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());

    }
    @Test
    public void oginTestWithInCorrectCredentials(){
        LoginPageAtHome3 loginPage=new LoginPageAtHome3(driver);
        loginPage.open();
        loginPage.loginToApplication("koeluser06@testpro.io","wrong");
        Assert.assertTrue(loginPage.isError());
    }



}
