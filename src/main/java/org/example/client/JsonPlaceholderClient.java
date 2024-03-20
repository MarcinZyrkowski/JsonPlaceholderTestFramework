package org.example.client;

import io.restassured.response.Response;
import org.example.model.PostRequest;

public class JsonPlaceholderClient extends RestClient {

    public static final String GET_POST = "/posts/{id}";
    public static final String POST_POST = "/posts";

    public Response getPostById(int id) {
        return basicRequestSpecification()
            .pathParam("id", id)
            .get(GET_POST);
    }

    public Response postPost(PostRequest postRequest) {
        return basicRequestSpecification()
            .body(postRequest)
            .post(POST_POST);
    }

}
