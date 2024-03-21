package org.example.tests.jsonplaceholdermodule;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.assertj.core.api.Assertions;
import org.example.assertions.HttpAssertions;
import org.example.generators.PostRequestGenerator;
import org.example.model.PostRequest;
import org.example.model.PostResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Update Post")
public class UpdatePostTest extends BaseTest {

    @Test
    @DisplayName("Update Post Test")
    @Description("Update Post Test")
    public void publishPostTest() {
        // given
        int id = random.nextInt(100);
        PostRequest postRequest = PostRequestGenerator.generateRandom();

        // when
        PostResponse postResponse = jsonPlaceholderController.updatePost(id, postRequest);

        // then
        HttpAssertions.verifyPostRequestAndResponseAreEquals(postRequest, postResponse);
        Assertions.assertThat(postResponse.id())
            .withFailMessage("Id should be updated")
            .isEqualTo(id);
    }

}
