package org.example.dataprovider.post;

import io.qameta.allure.Step;
import org.example.model.PostResponse;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PostDataProvider {

    @Step("Provide Post for id = 1")
    public static Stream<Arguments> postWithId1() {
        PostResponse postResponseWithId1 = PostResponse.builder()
                .userId(1)
                .id(1)
                .title("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")
                .body("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit " +
                        "molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")
                .build();

        return Stream.of(
                Arguments.of(postResponseWithId1)
        );
    }

}
