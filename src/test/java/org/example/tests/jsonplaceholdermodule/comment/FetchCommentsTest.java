package org.example.tests.jsonplaceholdermodule.comment;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.example.assertions.CommentAssertions;
import org.example.dataprovider.comment.CommentDataProvider;
import org.example.model.CommentListResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Comment")
@Feature("Fetch comment")
@DisplayName("Fetch Comment")
public class FetchCommentsTest extends BaseTest {

    @Test
    @DisplayName("Get comment by postId and id")
    @Description("Get comment by postId and id")
    public void getCommentsByPostIdAndIdTest() {
        // given
        int postId = 1;
        int id = 2;
        CommentListResponse expectedCommentsListResponse = CommentDataProvider.provideCommentsForPostId1AndId2();

        // when
        CommentListResponse commentListResponse = commentController.getCommentsByPostIdAndId(postId,
            id);

        // then
        CommentAssertions.verifyCommentList(commentListResponse, expectedCommentsListResponse);
    }

    @Test
    @DisplayName("Get comment by postId")
    @Description("Get comment by postId")
    public void getCommentsByPostIdTest() {
        // given
        int postId = 1;
        CommentListResponse expectedCommentsListResponse = CommentDataProvider.provideCommentsForPostId1();

        // when
        CommentListResponse commentListResponse = commentController.getCommentsByPostId(postId);

        // then
        CommentAssertions.verifyCommentList(commentListResponse, expectedCommentsListResponse);
    }

    @Test
    @DisplayName("Get comment for postId")
    @Description("Get comment for postId")
    public void getCommentsForPostIdTest() {
        // given
        int postId = 1;
        CommentListResponse expectedCommentsListResponse = CommentDataProvider.provideCommentsForPostId1();

        // when
        CommentListResponse commentListResponse = commentController.getCommentsForPostId(postId);

        // then
        CommentAssertions.verifyCommentList(commentListResponse, expectedCommentsListResponse);
    }

}
