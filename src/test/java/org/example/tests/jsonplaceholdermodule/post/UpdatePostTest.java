package org.example.tests.jsonplaceholdermodule.post;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.example.assertions.PostAssertion;
import org.example.model.PostRequest;
import org.example.model.PostResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Epic("Post")
@Feature("Update Post")
@DisplayName("Update Post Test")
public class UpdatePostTest extends BaseTest {

    @ParameterizedTest(name = "Update post")
    @DisplayName("Update post")
    @Description("Update post")
    @MethodSource("org.example.dataprovider.post.PostDataProvider#provideRandomPost")
    public void publishPostTest(PostRequest postRequest) {
        int id = random.nextInt(100);

        PostResponse postResponse = postController.updatePost(id, postRequest);

        PostAssertion.verifyPostRequestAndResponseAreEquals(postRequest, postResponse);
        PostAssertion.verifyPostResponseId(postResponse, id);
    }

}
