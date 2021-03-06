package pageObjectTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest extends BaseTest{
    @Test
    public void loginTest_loginToAppUsingCorrectCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApplication("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginToAppUsingWrongCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApplication("koeluser06@testpro.io","WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
