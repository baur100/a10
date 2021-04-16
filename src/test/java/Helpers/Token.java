package Helpers;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Credentials;
import models.Pet;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class Token {
    public static String getToken() {
        Credentials cred = new Credentials("koeluser06@testpro.io", "te$t$tudent");
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/me")
                        .header("accept", "application/json")
                        .header("Content-Type", "application/json")
                        .body(cred)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        String token = jsonPath.getString("token");
        return "Bearer " + token;
    }
}
