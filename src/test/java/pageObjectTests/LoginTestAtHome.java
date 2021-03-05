//package pageObjectTests;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import pageObjects.LoginPage;
//import pageObjects.LoginPageAtHome;
//import pageObjects.MainPageAtHome;
//
//public class LoginTestAtHome {
//    private WebDriver driver;
//
//    @BeforeMethod
//    public void startUp() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
//
//    @Test
//    public void loginTest_loginTo_AppUsingCorrectCredentials() {
//        LoginPageAtHome loginPage = new LoginPageAtHome(driver);//Создали Логин Пейдж!!!
//        loginPage.open();//открываем Логин Пейдж
//        MainPageAtHome mainPage = loginPage.loginToApplication("koeluser06@testpro.io", "te$t$tudent");
//        Assert.assertTrue(mainPage.isMainPage());
//    }
//
//    @Test
//    public void loginTest_Wrong() {
//        LoginPageAtHome loginPage = new LoginPageAtHome(driver);
//        loginPage.open();
//        loginPage.loginToApplication("koeluser06@testpro.io","wrongPassword");
//Assert.assertTrue(loginPage.isError());
//    }
//
//
//}
