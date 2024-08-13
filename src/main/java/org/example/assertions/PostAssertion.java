package org.example.assertions;

import io.qameta.allure.Step;
import org.assertj.core.api.Assertions;
import org.example.model.PostListResponse;
import org.example.model.PostRequest;
import org.example.model.PostResponse;
import org.example.utils.JsonConverter;

public class PostAssertion {

    @Step("Verify Post Response and compare it to Post Request")
    public static void verifyPostRequestAndResponseAreEquals(PostRequest postRequest,
                                                             PostResponse postResponse) {

        Assertions.assertThat(postRequest)
                .usingRecursiveComparison()
                .ignoringFields("id")
                .as("Post request: \n" + JsonConverter.serializePojo(postRequest)
                        + "\n Post response: \n" + JsonConverter.serializePojo(postResponse))
                .withFailMessage("There is mismatch between request and response")
                .isEqualTo(postResponse);
    }

    @Step("Verify Post is deleted")
    public static void verifyPostIsDeleted(String response) {
        Assertions.assertThat(response)
                .withFailMessage("Delete should return empty json object: {}")
                .isEqualTo("{}");
    }

    @Step("Verify post response Id")
    public static void verifyPostResponseId(PostResponse postResponse, int id) {
        Assertions.assertThat(postResponse.id())
                .withFailMessage("Id should be updated")
                .isEqualTo(id);
    }

    @Step("Verify post response list size")
    public static void verifyPostResponseListSize(PostListResponse postListResponse,
                                                  int expectedNumberOfAllPosts) {
        Assertions.assertThat(postListResponse.posts().size())
                .withFailMessage("Actual number of all posts is different than actual")
                .isEqualTo(expectedNumberOfAllPosts);
    }

    @Step("Verify post responses")
    public static void verifyPostResponses(PostResponse actual, PostResponse expected) {
        Assertions.assertThat(actual)
                .withFailMessage("Response is different than expected")
                .isEqualTo(expected);
    }

}
