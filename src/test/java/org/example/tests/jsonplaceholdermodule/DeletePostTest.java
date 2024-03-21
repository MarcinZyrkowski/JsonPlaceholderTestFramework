package org.example.tests.jsonplaceholdermodule;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import java.util.Random;
import org.assertj.core.api.Assertions;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Delete Post")
public class DeletePostTest extends BaseTest {

    @Test
    @DisplayName("Delete Post Test")
    @Description("Delete Post Test")
    public void publishPostTest() {
        // given
        Random random = new Random();
        int id = random.nextInt(100);

        // when
        String response = jsonPlaceholderController.deletePost(id);

        // then
        Assertions.assertThat(response)
            .withFailMessage("Delete should return empty json object: {}")
            .isEqualTo("{}");
    }

}
