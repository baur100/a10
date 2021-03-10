package seleniumTest;

import myPageObjects.LoginPage;
import myPageObjects.LoginPageFactory;
import myPageObjects.MyMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyLoginTestRefactory extends BaseTest{


    @Test

    public void loginTestFactory_loginToAppUsingCorrectCredentials() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp("koeluser06@testpro.io", "te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }

    @Test
    public void loginTest_loginToAppUsingWrongCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp("koeluser06@testpro.io2", "te$t$tudent");
        Assert.assertTrue(loginPage.isError());
    }


}
