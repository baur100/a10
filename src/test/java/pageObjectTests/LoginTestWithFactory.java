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
        MainPage mainPage = loginPage.loginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginToAppUsingWrongCredentials(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        loginPage.loginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginTestFactory_loginToAppUsingCorrectCredentials1(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginToAppUsingWrongCredentials1(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        loginPage.loginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginTestFactory_loginToAppUsingCorrectCredentials2(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginToAppUsingWrongCredentials2(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        loginPage.loginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginTestFactory_loginToAppUsingCorrectCredentials3(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginToAppUsingWrongCredentials3(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        loginPage.loginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
