package koelApi;

import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Playlist;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestDeletePlaylists {
    @Test
    public void purgePlaylists() throws InterruptedException {
        String token = Token.get();
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/playlist")
                        .header("accept","application/json")
                        .header("Content-Type","application/json")
                        .header("Authorization",token)

                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        Playlist[] playlists = jsonPath.getObject("$",Playlist[].class);
        System.out.println(playlists.length);

        for (Playlist p :playlists){
            Thread.sleep(1000);
            given()
                    .baseUri("https://koelapp.testpro.io/")
                    .basePath("api/playlist/"+p.getId())
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

    }
}
