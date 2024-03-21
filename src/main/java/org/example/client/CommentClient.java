package org.example.client;

import io.restassured.response.Response;

public class CommentClient extends RestClient {

    public static final String COMMENTS = "/comments";

    public Response getCommentByPostIdAndId(int postId, int id) {
        return basicRequestSpecification()
            .queryParam("postId", postId)
            .queryParam("id", id)
            .get(COMMENTS);
    }

}
