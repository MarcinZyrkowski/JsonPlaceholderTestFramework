package org.example.tests.jsonplaceholdermodule.post;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.assertj.core.api.Assertions;
import org.example.assertions.PostAssertions;
import org.example.generators.PostRequestGenerator;
import org.example.model.PostRequest;
import org.example.model.PostResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Update Post")
public class UpdatePostTest extends BaseTest {

    @Test
    @DisplayName("Update post")
    @Description("Update post")
    public void publishPostTest() {
        // given
        int id = random.nextInt(100);
        PostRequest postRequest = PostRequestGenerator.generateRandom();

        // when
        PostResponse postResponse = postController.updatePost(id, postRequest);

        // then
        PostAssertions.verifyPostRequestAndResponseAreEquals(postRequest, postResponse);
        Assertions.assertThat(postResponse.id())
            .withFailMessage("Id should be updated")
            .isEqualTo(id);
    }

}
