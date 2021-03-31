package petstoreApi;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Category;
import models.Pet;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestPet {
    @Test
    public void petTest_getPetById_petReturned(){
        Response response =
        given()
            .baseUri("https://petstore.swagger.io/v2")
            .basePath("/pet/1010")
        .when()
            .get()
        .then()
            .statusCode(200)
            .extract()
            .response();

        JsonPath jsonPath = response.jsonPath();
        Pet responseDog = jsonPath.getObject("$",Pet.class);
        Category cat = jsonPath.getObject("category",Category.class);
        String name = jsonPath.getString("name");
        long id = jsonPath.getLong("id");
        System.out.println(id);

        System.out.println(responseDog.getName());
    }
}
