package org.example.generators;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.model.PostRequest;

public class PostRequestGenerator {

    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();

    @Step("Generate random PostRequest")
    public static PostRequest generateRandom() {
        return PostRequest.builder()
            .userId(RANDOM.nextInt(100))
            .title(FAKER.book().title())
            .body(RandomStringUtils.randomAlphabetic(30))
            .build();
    }

}
