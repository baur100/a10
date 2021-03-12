package pageObjectTests;
import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest extends BaseTest{
    @Test
    public void loginTest_loginToAppUsingCorrectCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginToAppUsingWrongCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test(enabled = false)
    public void loginTest_loginToAppUsingCorrectCredentials1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginToAppUsingWrongCredentials1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginTest_loginToAppUsingCorrectCredentials2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginToAppUsingWrongCredentials2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginTest_loginToAppUsingCorrectCredentials3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginToAppUsingWrongCredentials3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    private int count = 0;
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void flakyTestExample(){
        Assert.assertEquals(count++,2);
    }
}
