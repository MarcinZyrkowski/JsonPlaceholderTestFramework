package org.example.tests.jsonplaceholdermodule.post;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.example.assertions.PostAssertions;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Post")
@Feature("Delete Post")
@DisplayName("Delete Post Test")
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
        PostAssertions.verifyPostIsDeleted(response);
    }

}
