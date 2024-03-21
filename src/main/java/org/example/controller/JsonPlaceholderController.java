package org.example.controller;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.assertj.core.api.Assertions;
import org.example.client.JsonPlaceholderClient;
import org.example.model.PostRequest;
import org.example.model.PostResponse;

public class JsonPlaceholderController {

    private final JsonPlaceholderClient jsonPlaceholderClient = new JsonPlaceholderClient();

    @Step("Get Post by Id: {id}")
    public PostResponse getPostById(int id) {
        Response response = jsonPlaceholderClient.getPostById(id);

        Assertions.assertThat(response.getStatusCode())
            .withFailMessage("Status code should be 200 but was: " + response.getStatusCode())
            .isEqualTo(HttpStatus.SC_OK);

        return response.as(PostResponse.class);
    }

    @Step("Publish Post")
    public PostResponse publishPost(PostRequest postRequest) {
        Response response = jsonPlaceholderClient.postPost(postRequest);

        Assertions.assertThat(response.getStatusCode())
            .withFailMessage("Status code should be 200 but was: " + response.getStatusCode())
            .isEqualTo(HttpStatus.SC_CREATED);

        return response.as(PostResponse.class);
    }

    @Step("Delete Post by Id: {id}")
    public String deletePost(int id) {
        Response response = jsonPlaceholderClient.deletePost(id);

        Assertions.assertThat(response.getStatusCode())
            .withFailMessage("Status code should be 200 but was: " + response.getStatusCode())
            .isEqualTo(HttpStatus.SC_OK);

        return response.body().asString();
    }

    @Step("Update Post")
    public PostResponse updatePost(int id, PostRequest postRequest) {
        Response response = jsonPlaceholderClient.putPost(id, postRequest);

        Assertions.assertThat(response.getStatusCode())
            .withFailMessage("Status code should be 200 but was: " + response.getStatusCode())
            .isEqualTo(HttpStatus.SC_OK);

        return response.as(PostResponse.class);
    }

}
