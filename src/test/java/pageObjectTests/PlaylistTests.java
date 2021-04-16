package pageObjectTests;

import Helpers.BrowserFabric;
import com.github.javafaker.Faker;
import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import myPageObjects.LoginPage;
import myPageObjects.MyMainPage;

public class PlaylistTests extends BaseTest{

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
