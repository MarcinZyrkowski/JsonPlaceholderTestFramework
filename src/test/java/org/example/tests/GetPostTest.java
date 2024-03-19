package org.example.tests;

import org.example.model.Post;
import org.junit.jupiter.api.Test;

public class GetPostTest extends BaseTest {

    @Test
    public void getPost() {
        Post post = jsonPlaceholderController.getPostById(1);

        System.out.println(post);
    }

}
