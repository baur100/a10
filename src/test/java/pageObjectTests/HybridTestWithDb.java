package pageObjectTests;

import helpers.DbAdapter;
import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.CreatePlaylistResponse;
import models.Playlist;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import static io.restassured.RestAssured.given;

public class HybridTestWithDb extends BaseTest{
    private int playlistId;
    private String token;
    @BeforeMethod
    public void startUp(){
        token = Token.get();
        String playlistName = faker.friends().character();
        System.out.println(playlistName);
        CreatePlaylistRequest playlist = new CreatePlaylistRequest(playlistName);
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist")
                        .header("Authorization",token)
                        .header("accept","application/json")
                        .header("Content-Type","application/json")
                        .body(playlist)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse resp = jsonPath.getObject("$",CreatePlaylistResponse.class);
        playlistId = resp.getId();
        System.out.println(playlistId);
    }
    @AfterMethod
    public void deletePlaylist(){
        given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Authorization",token)
                .when()
                .delete();
    }
    @Test
    public void renamePlaylist_playlistRenamed(){
        String newName = faker.artist().name();
        System.out.println(newName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApplication(username,password);
        mainPage.renamePlaylist(playlistId+"",newName);

        Playlist pl = DbAdapter.getPlaylistsById(playlistId);
        System.out.println("new name = "+newName + " name from DB = "+pl.getName());
        Assert.assertEquals(newName,pl.getName());
    }
}
