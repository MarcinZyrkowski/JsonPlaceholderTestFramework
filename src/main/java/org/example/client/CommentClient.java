package org.example.client;

import io.restassured.response.Response;

public class CommentClient extends RestClient {

  public static final String COMMENTS = "/comments";
  public static final String COMMENTS_BY_POST_ID = "/posts/{id}/comments";

  public Response getCommentByPostIdAndId(int postId, int id) {
    return basicRequestSpecification()
        .queryParam("postId", postId)
        .queryParam("id", id)
        .get(COMMENTS);
  }

  public Response getCommentsByPostId(int postId) {
    return basicRequestSpecification()
        .queryParam("postId", postId)
        .get(COMMENTS);
  }

  public Response getCommentsForPostWithId(int id) {
    return basicRequestSpecification()
        .pathParam("id", id)
        .get(COMMENTS_BY_POST_ID);
  }

}
