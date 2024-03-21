package org.example.client;

import io.restassured.response.Response;
import org.example.model.PostRequest;

public class PostClient extends RestClient {

    public static final String POST_BY_ID = "/posts/{id}";
    public static final String POSTS = "/posts";

    public Response getPostById(int id) {
        return basicRequestSpecification()
            .pathParam("id", id)
            .get(POST_BY_ID);
    }

    public Response getAllPosts() {
        return basicRequestSpecification()
            .get(POSTS);
    }

    public Response postPost(PostRequest postRequest) {
        return basicRequestSpecification()
            .body(postRequest)
            .post(POSTS);
    }

    public Response deletePost(int id) {
        return basicRequestSpecification()
            .pathParam("id", id)
            .delete(POST_BY_ID);
    }

    public Response putPost(int id, PostRequest postRequest) {
        return basicRequestSpecification()
            .body(postRequest)
            .pathParam("id", id)
            .put(POST_BY_ID);
    }

}
