package seleniumTest;

import myPageObjects.LoginPage;
import myPageObjects.MyMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class PlaylistTest extends BaseTest{

    @Test
    public void createPlayList() throws InterruptedException {
        String playListName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
        String playListId = mainPage.createPlaylist(playListName);
        Assert.assertTrue(mainPage.isPlaylistExist(playListId, playListName));
//        mainPage.isPlayListVisible(playListId, playListName);

    }

    @Test
    public void renamePlayList() throws InterruptedException {
        String playListName = faker.funnyName().name();
        String newListName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
        String playListId = mainPage.createPlaylist(playListName);
        mainPage.renamePlaylist(playListId, newListName);
        Assert.assertTrue(mainPage.isPlaylistExist(playListId,newListName));

    }

    @Test
    public void createPlayList1() throws InterruptedException {
        String playListName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
        String playListId = mainPage.createPlaylist(playListName);
        Assert.assertTrue(mainPage.isPlaylistExist(playListId, playListName));
//        mainPage.isPlayListVisible(playListId, playListName);

    }

    @Test
    public void renamePlayList1() throws InterruptedException {
        String playListName = faker.funnyName().name();
        String newListName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
        String playListId = mainPage.createPlaylist(playListName);
        mainPage.renamePlaylist(playListId, newListName);
        Assert.assertTrue(mainPage.isPlaylistExist(playListId,newListName));

    }

    @Test (enabled = false)
    public void createPlayList2() throws InterruptedException {
        String playListName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
        String playListId = mainPage.createPlaylist(playListName);
        Assert.assertTrue(mainPage.isPlaylistExist(playListId, playListName));
//        mainPage.isPlayListVisible(playListId, playListName);

    }

    @Test
    public void renamePlayList2() throws InterruptedException {
        String playListName = faker.funnyName().name();
        String newListName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MyMainPage mainPage = loginPage.loginToApp("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
        String playListId = mainPage.createPlaylist(playListName);
        mainPage.renamePlaylist(playListId, newListName);
        Assert.assertTrue(mainPage.isPlaylistExist(playListId,newListName));

    }
}
