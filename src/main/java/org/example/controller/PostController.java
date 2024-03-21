package org.example.controller;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import java.util.List;
import org.example.assertions.HttpAssertions;
import org.example.client.PostClient;
import org.example.model.PostListResponse;
import org.example.model.PostRequest;
import org.example.model.PostResponse;

public class PostController {

    private final PostClient postClient = new PostClient();

    @Step("Get Post by Id: {id}")
    public PostResponse getPostById(int id) {
        Response response = postClient.getPostById(id);
        HttpAssertions.statusResponseIsOk(response);

        return response.as(PostResponse.class);
    }

    @Step("Get all Posts")
    public PostListResponse getAllPosts() {
        Response response = postClient.getAllPosts();
        HttpAssertions.statusResponseIsOk(response);

        PostResponse[] postResponseArray = response.as(PostResponse[].class);
        return new PostListResponse(List.of(postResponseArray));
    }

    @Step("Publish Post")
    public PostResponse publishPost(PostRequest postRequest) {
        Response response = postClient.postPost(postRequest);
        HttpAssertions.statusResponseIsCreated(response);

        return response.as(PostResponse.class);
    }

    @Step("Delete Post by Id: {id}")
    public String deletePost(int id) {
        Response response = postClient.deletePost(id);
        HttpAssertions.statusResponseIsOk(response);

        return response.body().asString();
    }

    @Step("Update Post")
    public PostResponse updatePost(int id, PostRequest postRequest) {
        Response response = postClient.putPost(id, postRequest);
        HttpAssertions.statusResponseIsOk(response);

        return response.as(PostResponse.class);
    }

}
