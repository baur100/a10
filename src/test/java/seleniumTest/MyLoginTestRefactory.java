package seleniumTest;

import myPageObjects.LoginPage;
import myPageObjects.LoginPageFactory;
import myPageObjects.MyMainPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyLoginTestRefactory extends BaseTest{


    @Test

    public void loginTestFactory_loginToAppUsingCorrectCredentials() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }

    @Test
    public void loginTest_loginToAppUsingWrongCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(username,password+"t");
        Assert.assertTrue(loginPage.isError());
    }

    @Test

    public void loginTestFactory_loginToAppUsingCorrectCredentials1() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }

    @Test
    public void loginTest_loginToAppUsingWrongCredentials1() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp(username,password+"t");
        Assert.assertTrue(loginPage.isError());
    }

}
