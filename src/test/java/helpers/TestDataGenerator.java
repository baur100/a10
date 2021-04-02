package helpers;

import com.github.javafaker.Faker;
import enums.Status;
import models.Category;
import models.Pet;
import models.Tag;

import java.util.Random;

public class TestDataGenerator {
    public static Pet getRandomPet(){
        Faker faker = new Faker();
        Random random = new Random();
        Category category = new Category(random.nextInt(10),faker.animal().name());
        Tag tag = new Tag(random.nextInt(5), faker.dog().breed());
        Tag[] tags = {tag};
        Status status = Status.available;
        return new Pet(0,category,faker.funnyName().name(),new String[]{},tags,status);
    }
}
