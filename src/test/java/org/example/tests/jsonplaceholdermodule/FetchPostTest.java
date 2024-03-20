package org.example.tests.jsonplaceholdermodule;

import io.qameta.allure.Description;
import org.example.model.PostResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FetchPostTest extends BaseTest {

    @Test
    @DisplayName("Get Post Test")
    @Description("Get Post Test")
    public void getPostTest() {
        PostResponse post = jsonPlaceholderController.getPostById(1);

        System.out.println(post);
    }

}
