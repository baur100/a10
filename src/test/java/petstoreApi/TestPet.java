package petstoreApi;

import Helpers.TestDataGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Category;
import models.Pet;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestPet {
    private long petId;
    private Pet pet;

    @BeforeMethod
    public void createPet() {
        pet = TestDataGenerator.getRandomPet();
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet")
                        .body(pet)
                        .header("accept","application/json")
                        .header("Content-Type","application/json")
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        Pet responsePet = jsonPath.getObject("$", Pet.class);
        Assert.assertEquals(pet.getName(), responsePet.getName());
        Assert.assertEquals(pet.getTags()[0].getName(), responsePet.getTags()[0].getName());
        Assert.assertEquals(pet.getStatus(), responsePet.getStatus());
        Assert.assertEquals(pet.getCategory().getId(), responsePet.getCategory().getId());
        Assert.assertEquals(pet.getCategory().getName(), responsePet.getCategory().getName());
        petId = responsePet.getId();

    }

    @AfterMethod
    public void deletePet() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/"+petId)
                        .when()
                        .delete()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
    }

    @Test
    public void petTest_getPetById_petReturned() {
        Response response =
        given()
            .baseUri("https://petstore.swagger.io/v2")
            .basePath("/pet/"+petId)
        .when()
            .get()
        .then()
            .statusCode(200)
            .extract()
            .response();
        JsonPath jsonPath = response.jsonPath();
        Pet responsePet = jsonPath.getObject("$", Pet.class);
        Assert.assertEquals(pet.getName(), responsePet.getName());
        Assert.assertEquals(pet.getTags()[0].getName(), responsePet.getTags()[0].getName());
        Assert.assertEquals(pet.getStatus(), responsePet.getStatus());
        Assert.assertEquals(pet.getCategory().getId(), responsePet.getCategory().getId());
        Assert.assertEquals(pet.getCategory().getName(), responsePet.getCategory().getName());


    }

    @Test
    public void petTest_updatePet_petUpdated() {
        Pet updatedPet = TestDataGenerator.getRandomPet();
        updatedPet.setId(petId);
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/")
                        .header("accept","application/json")
                        .header("Content-Type","application/json")
                        .body(pet)
                        .when()
                        .put()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        Pet responsePet = jsonPath.getObject("$", Pet.class);
        Assert.assertEquals(updatedPet.getName(), responsePet.getName());
        Assert.assertEquals(updatedPet.getTags()[0].getName(), responsePet.getTags()[0].getName());
        Assert.assertEquals(updatedPet.getStatus(), responsePet.getStatus());
        Assert.assertEquals(updatedPet.getCategory().getId(), responsePet.getCategory().getId());
        Assert.assertEquals(updatedPet.getCategory().getName(), responsePet.getCategory().getName());
    }



}
