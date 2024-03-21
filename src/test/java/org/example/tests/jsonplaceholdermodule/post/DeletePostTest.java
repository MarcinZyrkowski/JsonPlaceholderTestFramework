package org.example.tests.jsonplaceholdermodule.post;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.assertj.core.api.Assertions;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Delete Post")
public class DeletePostTest extends BaseTest {

    @Test
    @DisplayName("Delete post")
    @Description("Delete post")
    public void publishPostTest() {
        // given
        int id = random.nextInt(100);

        // when
        String response = postController.deletePost(id);

        // then
        Assertions.assertThat(response)
            .withFailMessage("Delete should return empty json object: {}")
            .isEqualTo("{}");
    }

}
