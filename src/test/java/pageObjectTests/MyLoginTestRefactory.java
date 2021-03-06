package pageObjectTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import myPageObjects.LoginPage;
import myPageObjects.LoginPageFactory;
import myPageObjects.MyMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MyLoginTestRefactory {

    private WebDriver driver;

    @BeforeMethod
    public void startUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test

    public void loginTestFactory_loginToAppUsingCorrectCredentials() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp("koeluser06@testpro.io", "te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }

//    @Test
//    public void loginTest_loginToAppUsingWrongCredentials() {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        loginPage.loginToApp("koeluser06@testpro.io2", "te$t$tudent");
//        Assert.assertTrue(loginPage.isError());
//    }


}
