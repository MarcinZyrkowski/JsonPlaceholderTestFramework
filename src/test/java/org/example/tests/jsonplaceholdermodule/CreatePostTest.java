package org.example.tests.jsonplaceholdermodule;

import io.qameta.allure.Description;
import org.example.assertions.HttpAssertions;
import org.example.generators.PostRequestGenerator;
import org.example.model.PostRequest;
import org.example.model.PostResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreatePostTest extends BaseTest {

    @Test
    @DisplayName("Publish Post Test")
    @Description("Publish Post Test")
    public void publishPostTest() {
        // given
        PostRequest postRequest = PostRequestGenerator.generateRandom();

        // when
        PostResponse postResponse = jsonPlaceholderController.publishPost(postRequest);

        // then
        HttpAssertions.verifyPostRequestAndResponseAreEquals(postRequest, postResponse);
    }

}
