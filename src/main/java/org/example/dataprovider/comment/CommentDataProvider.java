package org.example.dataprovider.comment;

import io.qameta.allure.Step;
import org.example.model.Comment;
import org.example.model.CommentListResponse;
import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

public class CommentDataProvider {

    @Step("Provide comments for post id = 1")
    public static Stream<Arguments> commentsForPostWithId1() {
        List<Comment> comments = List.of(
                Comment.builder()
                        .postId(1)
                        .id(1)
                        .name("id labore ex et quam laborum")
                        .email("Eliseo@gardner.biz")
                        .body("laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo " +
                                "necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium")
                        .build(),
                Comment.builder()
                        .postId(1)
                        .id(2)
                        .name("quo vero reiciendis velit similique earum")
                        .email("Jayne_Kuhic@sydney.com")
                        .body("est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati " +
                                "quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem " +
                                "reiciendis et")
                        .build(),
                Comment.builder()
                        .postId(1)
                        .id(3)
                        .name("odio adipisci rerum aut animi")
                        .email("Nikita@garfield.biz")
                        .body("quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam " +
                                "eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam " +
                                "est\ncum et ducimus et vero voluptates excepturi deleniti ratione")
                        .build(),
                Comment.builder()
                        .postId(1)
                        .id(4)
                        .name("alias odio sit")
                        .email("Lew@alysha.tv")
                        .body("non et atque\noccaecati deserunt quas accusantium unde odit nobis qui " +
                                "voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut " +
                                "occaecati")
                        .build(),
                Comment.builder()
                        .postId(1)
                        .id(5)
                        .name("vero eaque aliquid doloribus et culpa")
                        .email("Hayden@althea.biz")
                        .body("harum non quasi et ratione\ntempore iure ex voluptates in ratione\nharum " +
                                "architecto fugit inventore cupiditate\nvoluptates magni quo et")
                        .build()
        );
        return Stream.of(
                Arguments.of(new CommentListResponse(comments))
        );
    }

    @Step("Provide comments for post id = 1 and id = 2")
    public static Stream<Arguments> commentsForPostId1AndId2() {
        Comment expectedComment = Comment.builder()
                .postId(1)
                .id(2)
                .name("quo vero reiciendis velit similique earum")
                .email("Jayne_Kuhic@sydney.com")
                .body("est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod " +
                        "ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem " +
                        "reiciendis et")
                .build();
        return Stream.of(
                Arguments.of(new CommentListResponse(List.of(expectedComment)))
        );
    }

}
