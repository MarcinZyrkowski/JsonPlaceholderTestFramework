package org.example.tests.jsonplaceholdermodule;

import org.example.model.Post;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GetPostTest extends BaseTest {

    @Test
    @DisplayName("Get Post test")
    public void getPostTest() {
        Post post = jsonPlaceholderController.getPostById(1);

        System.out.println(post);
    }

}
