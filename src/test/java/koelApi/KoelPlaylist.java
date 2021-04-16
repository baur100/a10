package koelApi;

import Helpers.Token;
import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class KoelPlaylist {
    private String token;
    Faker faker;
    private int playlistId;

    @BeforeClass
    public void runOnce(){
        token = Token.getToken();
        Faker faker = new Faker();

    }

    @BeforeMethod
    public void startUp(){
        String playListName = faker.gameOfThrones().character();
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
        playlistId = resp.getId();
    }

    @AfterMethod
    public void cleanUp(){
        given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", token)
                .when()
                .delete()
                .then()
                .statusCode(200)
                .extract()
                .response();
    }


    @Test
    public void getPlaylist() {
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/playlist")
                        .header("accept", "application/json")
                        .header("Content-Type", "application/json")
                        .header("Authorization", token)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        Playlist[] resp = jsonPath.getObject("$", Playlist[].class);
        List<Playlist> list = Arrays.asList(resp);
//        Playlist pl = list.stream();
    }

    @Test
    public void updatePlaylist() {

    }

}
