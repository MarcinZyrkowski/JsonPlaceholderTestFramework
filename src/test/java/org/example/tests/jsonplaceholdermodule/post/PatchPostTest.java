package org.example.tests.jsonplaceholdermodule.post;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.example.assertions.PostAssertion;
import org.example.generators.PostRequestGenerator;
import org.example.model.PostRequest;
import org.example.model.PostResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Post")
@Feature("Patch Post")
@DisplayName("Patch Post Test")
public class PatchPostTest extends BaseTest {

  @Test
  @DisplayName("Patch post")
  @Description("Patch post")
  public void pathPostTest() {
    int id = random.nextInt(100);
    PostResponse response = postController.getPostById(1);

    // we only want to modify title
    PostRequest postRequestTemplate = PostRequestGenerator.generateRandom();
    PostRequest postRequest = PostRequest.builder()
        .userId(response.userId())
        .title(postRequestTemplate.title())
        .body(response.body())
        .build();

    PostResponse postResponse = postController.patchPost(id, postRequest);

    PostAssertion.verifyPostRequestAndResponseAreEquals(postRequest, postResponse);
    PostAssertion.verifyPostResponseId(postResponse, id);
  }

}
