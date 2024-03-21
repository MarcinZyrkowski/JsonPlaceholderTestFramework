package org.example.controller;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import java.util.List;
import org.example.assertions.HttpAssertions;
import org.example.client.CommentClient;
import org.example.model.Comment;
import org.example.model.CommentListResponse;

public class CommentController {

    private final CommentClient commentClient = new CommentClient();

    @Step("Get comment by postId: {postId} and id: {id}")
    public CommentListResponse getCommentByPostIdAndId(int postId, int id) {
        Response response = commentClient.getCommentByPostIdAndId(postId, id);
        HttpAssertions.statusResponseIsOk(response);

        Comment[] commentsArray = response.as(Comment[].class);
        return new CommentListResponse(List.of(commentsArray));
    }

}
