package org.example.controller;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import java.util.List;
import org.apache.http.HttpStatus;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Arrays;
import org.example.assertions.HttpAssertions;
import org.example.client.JsonPlaceholderClient;
import org.example.model.PostListResponse;
import org.example.model.PostRequest;
import org.example.model.PostResponse;

public class JsonPlaceholderController {

    private final JsonPlaceholderClient jsonPlaceholderClient = new JsonPlaceholderClient();

    @Step("Get Post by Id: {id}")
    public PostResponse getPostById(int id) {
        Response response = jsonPlaceholderClient.getPostById(id);
        HttpAssertions.statusResponseIsOk(response);

        return response.as(PostResponse.class);
    }

    @Step("Get all Posts")
    public PostListResponse getAllPosts() {
        Response response = jsonPlaceholderClient.getAllPosts();
        HttpAssertions.statusResponseIsOk(response);

        PostResponse[] postResponseArray = response.as(PostResponse[].class);
        return new PostListResponse(List.of(postResponseArray));
    }

    @Step("Publish Post")
    public PostResponse publishPost(PostRequest postRequest) {
        Response response = jsonPlaceholderClient.postPost(postRequest);
        HttpAssertions.statusResponseIsCreated(response);

        return response.as(PostResponse.class);
    }

    @Step("Delete Post by Id: {id}")
    public String deletePost(int id) {
        Response response = jsonPlaceholderClient.deletePost(id);
        HttpAssertions.statusResponseIsOk(response);

        return response.body().asString();
    }

    @Step("Update Post")
    public PostResponse updatePost(int id, PostRequest postRequest) {
        Response response = jsonPlaceholderClient.putPost(id, postRequest);
        HttpAssertions.statusResponseIsOk(response);

        return response.as(PostResponse.class);
    }

}
