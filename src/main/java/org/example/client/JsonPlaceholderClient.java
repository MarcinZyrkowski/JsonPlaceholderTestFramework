package org.example.client;

import io.restassured.response.Response;
import org.example.model.PostRequest;

public class JsonPlaceholderClient extends RestClient {

    public static final String POST_BY_ID = "/posts/{id}";
    public static final String POSTS = "/posts";

    public Response getPostById(int id) {
        return basicRequestSpecification()
            .pathParam("id", id)
            .get(POST_BY_ID);
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

}
