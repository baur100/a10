package pageObjectTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPageFactory;
import pageObjects.MainPage;

public class LoginTestWithFactory extends BaseTest{
    @Test
    public void loginTestFactory_loginToAppUsingCorrectCredentials(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApplication("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginToAppUsingWrongCredentials(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        loginPage.loginToApplication("koeluser06@testpro.io","WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
