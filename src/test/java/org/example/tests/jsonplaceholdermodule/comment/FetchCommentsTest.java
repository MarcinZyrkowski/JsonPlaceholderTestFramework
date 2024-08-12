package org.example.tests.jsonplaceholdermodule.comment;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.example.assertions.CommentAssertions;
import org.example.model.CommentListResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Epic("Comment")
@Feature("Fetch comment")
@DisplayName("Fetch Comment")
public class FetchCommentsTest extends BaseTest {

    @ParameterizedTest(name = "Get comments by postId and id")
    @DisplayName("Get comment by postId and id")
    @Description("Get comment by postId and id")
    @MethodSource("org.example.dataprovider.comment.CommentDataProvider#commentsForPostId1AndId2")
    public void getCommentsByPostIdAndIdTest(CommentListResponse expectedCommentsListResponse) {
        int postId = 1;
        int id = 2;

        CommentListResponse commentListResponse = commentController.getCommentsByPostIdAndId(postId, id);

        CommentAssertions.verifyCommentList(commentListResponse, expectedCommentsListResponse);
    }

    @ParameterizedTest(name = "Get comments by post id")
    @DisplayName("Get comment by postId")
    @Description("Get comment by postId")
    @MethodSource("org.example.dataprovider.comment.CommentDataProvider#commentsForPostWithId1")
    public void getCommentsByPostIdTest(CommentListResponse expectedCommentsListResponse) {
        int postId = 1;

        CommentListResponse commentListResponse = commentController.getCommentsByPostId(postId);

        CommentAssertions.verifyCommentList(commentListResponse, expectedCommentsListResponse);
    }

    @ParameterizedTest(name = "Get comments for post id")
    @DisplayName("Get comment for postId")
    @Description("Get comment for postId")
    @MethodSource("org.example.dataprovider.comment.CommentDataProvider#commentsForPostWithId1")
    public void getCommentsForPostIdTest(CommentListResponse expectedCommentsListResponse) {
        int postId = 1;

        CommentListResponse commentListResponse = commentController.getCommentsForPostId(postId);

        CommentAssertions.verifyCommentList(commentListResponse, expectedCommentsListResponse);
    }

}
