package org.example.tests.jsonplaceholdermodule.post;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.example.assertions.PostAssertions;
import org.example.generators.PostRequestGenerator;
import org.example.model.PostRequest;
import org.example.model.PostResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Post")
@Feature("Update Post")
@DisplayName("Update Post Test")
public class UpdatePostTest extends BaseTest {

    @Test
    @DisplayName("Update post")
    @Description("Update post")
    public void publishPostTest() {
        int id = random.nextInt(100);
        PostRequest postRequest = PostRequestGenerator.generateRandom();

        PostResponse postResponse = postController.updatePost(id, postRequest);

        PostAssertions.verifyPostRequestAndResponseAreEquals(postRequest, postResponse);
        PostAssertions.verifyPostResponseId(postResponse, id);
    }

}
