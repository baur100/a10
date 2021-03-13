package seleniumTest;

import MyListnerers.RetryAnalyzer;
import myPageObjects.LoginPage;
import myPageObjects.LoginPageFactory;
import myPageObjects.LoginPageLocators;
import myPageObjects.MyMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class KoelLogin extends BaseTest{



    @Test
    public void koelLogin_LoginToAppUsingRightCredentials() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());

    }

    @Test
    public void koelLogin_LoginToAppUsingWrongCredentials() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp(username,password+"t");
        Assert.assertTrue(loginPage.isError());

    }

    @Test
    public void koelLogin_LoginToAppUsingRightCredentials1() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());

    }

    @Test
    public void koelLogin_LoginToAppUsingWrongCredentials1() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp(username,password+"t");
        Assert.assertTrue(loginPage.isError());

    }

    @Test
    public void koelLogin_LoginToAppUsingRightCredentials2() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());

    }

    @Test
    public void koelLogin_LoginToAppUsingWrongCredentials2() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp(username,password+"t");
        Assert.assertTrue(loginPage.isError());

    }
    private int count = 0;
    @Test (retryAnalyzer = RetryAnalyzer.class)

    public void flakyTestExample (){
        Assert.assertEquals(count++, 2);
    }


}
