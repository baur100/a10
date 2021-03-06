package pageObjectTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTests extends BaseTest{
    @Test
    public void playlist_createPlaylistTest(){
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApplication("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @Test
    public void playlist_renamePlaylistTest(){
        String playlistName = faker.funnyName().name();
        String newName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApplication("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist(playlistName);
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,newName));
    }
}
