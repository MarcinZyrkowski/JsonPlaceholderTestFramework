package org.example.tests.jsonplaceholdermodule.comment;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.example.dataprovider.comments.CommentsDataProvider;
import org.example.model.Comment;
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

        Comment expectedComment = Comment.builder()
            .postId(postId)
            .id(id)
            .name("quo vero reiciendis velit similique earum")
            .email("Jayne_Kuhic@sydney.com")
            .body(
                "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et")
            .build();
        CommentListResponse expectedCommentsListResponse = new CommentListResponse(
            List.of(expectedComment));

        // when
        CommentListResponse commentListResponse = commentController.getCommentsByPostIdAndId(postId,
            id);

        // then
        Assertions.assertThat(commentListResponse)
            .withFailMessage("Response is different than expected")
            .isEqualTo(expectedCommentsListResponse);
    }

    @Test
    @DisplayName("Get comment by postId")
    @Description("Get comment by postId")
    public void getCommentsByPostIdTest() {
        // given
        int postId = 1;
        CommentListResponse expectedCommentsListResponse = CommentsDataProvider.getCommentsForPostId1();

        // when
        CommentListResponse commentListResponse = commentController.getCommentsByPostId(postId);

        // then
        Assertions.assertThat(commentListResponse)
            .withFailMessage("Response is different than expected")
            .isEqualTo(expectedCommentsListResponse);
    }

    @Test
    @DisplayName("Get comment for postId")
    @Description("Get comment for postId")
    public void getCommentsForPostIdTest() {
        // given
        int postId = 1;
        CommentListResponse expectedCommentsListResponse = CommentsDataProvider.getCommentsForPostId1();

        // when
        CommentListResponse commentListResponse = commentController.getCommentsForPostId(postId);

        // then
        Assertions.assertThat(commentListResponse)
            .withFailMessage("Response is different than expected")
            .isEqualTo(expectedCommentsListResponse);
    }

}
