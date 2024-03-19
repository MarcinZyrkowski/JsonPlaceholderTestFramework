package org.example.client;

import io.restassured.response.Response;

public class JsonPlaceholderClient extends RestClient {

    public static final String GET_POST = "/posts/{id}";

    public Response getPostById(int id) {
        return basicRequestSpecification()
            .pathParam("id", id)
            .get(GET_POST);
    }

}
