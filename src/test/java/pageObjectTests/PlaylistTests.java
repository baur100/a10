package pageObjectTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import myPageObjects.LoginPage;
import myPageObjects.MyMainPage;

public class PlaylistTests {
    private WebDriver driver;
    @BeforeMethod
    public void startUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
//    @Test
//    public void playlist_createPlaylistTest(){
//        String playlistName = "XXX";
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        MyMainPage mainPage = loginPage.loginToApplication("koeluser06@testpro.io","te$t$tudent");
//        String playlistId = mainPage.createPlaylist(playlistName);
//        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
//    }
}
