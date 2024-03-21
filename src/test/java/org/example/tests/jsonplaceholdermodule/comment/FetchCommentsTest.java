package org.example.tests.jsonplaceholdermodule.comment;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.example.model.Comment;
import org.example.model.CommentListResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Fetch comment")
public class FetchCommentsTest extends BaseTest {

    @Test
    @DisplayName("Get comment")
    @Description("Get comment")
    public void getPostTest() {
        // given
        int postId = 1;
        int id = 2;

        Comment expectedComment = Comment.builder()
            .postId(postId)
            .id(2)
            .name("quo vero reiciendis velit similique earum")
            .email("Jayne_Kuhic@sydney.com")
            .body(
                "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et")
            .build();
        CommentListResponse expectedCommentsListResponse = new CommentListResponse(
            List.of(expectedComment));

        // when
        CommentListResponse commentListResponse = commentController.getCommentByPostIdAndId(postId,
            id);

        // then
        Assertions.assertThat(commentListResponse)
            .withFailMessage("Response is different than expected")
            .isEqualTo(expectedCommentsListResponse);
    }

}
