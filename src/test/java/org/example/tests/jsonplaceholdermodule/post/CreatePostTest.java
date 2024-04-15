package org.example.tests.jsonplaceholdermodule.post;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import java.time.LocalDateTime;
import org.example.assertions.PostAssertions;
import org.example.generators.PostRequestGenerator;
import org.example.model.PostRequest;
import org.example.model.PostResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Post")
@Feature("Publish Post")
@DisplayName("Create Post Test")
public class CreatePostTest extends BaseTest {

    @Test
    @DisplayName("Publish post")
    @Description("Publish post")
    public void publishPostTest() {
        // given
        PostRequest postRequest = PostRequestGenerator.generateRandom();

        // when
        PostResponse postResponse = postController.publishPost(postRequest);

        // then
        PostAssertions.verifyPostRequestAndResponseAreEquals(postRequest, postResponse);
    }

}
