package seleniumTest;

import Helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.CreatePlaylistResponse;
import myPageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HybridTestApiSelenium extends BaseTest{
    private String playlistId;
    private String token;


    @BeforeMethod
    public void startUp(){
        token = Token.getToken();
        String playListName = faker.gameOfThrones().character();
        System.out.println(playListName);
        CreatePlaylistRequest playlist = new CreatePlaylistRequest(playListName);
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/playlist")
                        .header("accept", "application/json")
                        .header("Content-Type", "application/json")
                        .header("Authorization", token)
                        .body(playlist)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse resp = jsonPath.getObject("$", CreatePlaylistResponse.class);
        Assert.assertEquals(playListName, resp.getName());
        playlistId = resp.getId()+"";
    }

    @Test
    public void renamePlaylist() throws InterruptedException {
        String newName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        var mainPage = loginPage.loginToApp(username, password);
        Thread.sleep(15000);
        mainPage.renamePlaylist(playlistId, newName);
        Thread.sleep(15000);
        mainPage.isPlaylistExist(playlistId, newName);


    }

}
