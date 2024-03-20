package org.example.tests.jsonplaceholdermodule;

import io.qameta.allure.Description;
import org.assertj.core.api.Assertions;
import org.example.model.PostResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FetchPostTest extends BaseTest {

    @Test
    @DisplayName("Get Post Test")
    @Description("Get Post Test")
    public void getPostTest() {
        // given
        int id = 1;
        PostResponse expectedResponse = PostResponse.builder()
            .userId(1)
            .id(1)
            .title("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")
            .body(
                "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")
            .build();

        // when
        PostResponse postResponse = jsonPlaceholderController.getPostById(id);

        // then
        Assertions.assertThat(postResponse)
            .withFailMessage("Response is different than expected")
            .isEqualTo(expectedResponse);
    }

}
