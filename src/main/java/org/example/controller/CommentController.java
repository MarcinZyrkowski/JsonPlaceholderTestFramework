package org.example.controller;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.example.assertions.HttpAssertions;
import org.example.client.CommentClient;
import org.example.model.Comment;
import org.example.model.CommentListResponse;

import java.util.List;

public class CommentController {

    private final CommentClient commentClient = new CommentClient();

    @Step("Get comment by postId: {postId} and id: {id}")
    public CommentListResponse getCommentsByPostIdAndId(int postId, int id) {
        Response response = commentClient.getCommentByPostIdAndId(postId, id);
        HttpAssertions.statusResponseIsOk(response);

        Comment[] commentsArray = response.as(Comment[].class);
        return new CommentListResponse(List.of(commentsArray));
    }

    @Step("Get comment by postId: {postId}")
    public CommentListResponse getCommentsByPostId(int postId) {
        Response response = commentClient.getCommentsByPostId(postId);
        HttpAssertions.statusResponseIsOk(response);

        Comment[] commentsArray = response.as(Comment[].class);
        return new CommentListResponse(List.of(commentsArray));
    }

    @Step("Get comment for id: {id}")
    public CommentListResponse getCommentsForPostId(int id) {
        Response response = commentClient.getCommentsForPostWithId(id);
        HttpAssertions.statusResponseIsOk(response);

        Comment[] commentsArray = response.as(Comment[].class);
        return new CommentListResponse(List.of(commentsArray));
    }

}
