package org.example.tests.jsonplaceholdermodule.post;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.example.assertions.PostAssertions;
import org.example.model.PostRequest;
import org.example.model.PostResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Epic("Post")
@Feature("Publish Post")
@DisplayName("Create Post Test")
public class CreatePostTest extends BaseTest {

    @ParameterizedTest(name = "Publish Post")
    @DisplayName("Publish post")
    @Description("Publish post")
    @MethodSource("org.example.dataprovider.post.PostDataProvider#provideRandomPost")
    public void publishPostTest(PostRequest postRequest) {
        PostResponse postResponse = postController.publishPost(postRequest);

        PostAssertions.verifyPostRequestAndResponseAreEquals(postRequest, postResponse);
    }

}
