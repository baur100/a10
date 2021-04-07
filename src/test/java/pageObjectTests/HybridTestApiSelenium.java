package pageObjectTests;

import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.CreatePlaylistResponse;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import static io.restassured.RestAssured.given;

public class HybridTestApiSelenium extends BaseTest{
    private String playlistId;
    private String token;

    @BeforeMethod
    public void startUp(){
        token = Token.get();
        String playlistName = faker.friends().character();
        CreatePlaylistRequest playlist = new CreatePlaylistRequest(playlistName);
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
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
        playlistId = resp.getId()+"";
    }
    @AfterMethod
    public void deletePlaylist(){
        given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Authorization",token)
                .when()
                .delete();
    }
    @Test
    public void renamePlaylist() throws InterruptedException {
        String newName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        var mainPage =  loginPage.loginToApplication(username,password);
        mainPage.renamePlaylist(playlistId,newName);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,newName));
    }
}
