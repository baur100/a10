package koelApi;

import Helpers.Token;
import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.Playlist;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestDeletePlaylist {
    @Test
    public void purgePlaylists(){
        String token = Token.getToken();
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
        Playlist[] playlists = jsonPath.getObject("$", Playlist[].class);
        System.out.println(playlists.length);

        for(Playlist p : playlists) {
                    given()
                            .baseUri("https://koelapp.testpro.io/")
                            .basePath("api/playlist/"+p.getId())
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

    }
}
