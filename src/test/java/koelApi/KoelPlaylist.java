package koelApi;

import com.github.javafaker.Faker;
import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.CreatePlaylistResponse;
import models.Credentials;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class KoelPlaylist {
    private String token;
    private Faker faker;
    private int playlistId;
    private String playlistName;
    @BeforeClass
    public void runOnce(){
        token = Token.get();
        faker = new Faker();
    }
    @BeforeMethod
    public void startUp(){
        playlistName = faker.friends().character();
        CreatePlaylistRequest playlist = new CreatePlaylistRequest(playlistName);
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/playlist")
                        .header("accept","application/json")
                        .header("Content-Type","application/json")
                        .header("Authorization",token)
                        .body(playlist)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse resp = jsonPath.getObject("$",CreatePlaylistResponse.class);
        Assert.assertEquals(playlistName, resp.getName());
        playlistId = resp.getId();
    }
    @AfterMethod
    public void cleanUp(){
        given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .header("Authorization",token)
                .when()
                .delete()
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
    @Test
    public void getPlaylist(){
    }
    @Test
    public void updatePlaylist(){
    }

}
