package org.example.tests.jsonplaceholdermodule;

import io.qameta.allure.Description;
import org.example.model.PostRequest;
import org.example.model.PostResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreatePostTest extends BaseTest {

    @Test
    @DisplayName("Publish Post Test")
    @Description("Publish Post Test")
    public void publishPost() {
        PostRequest postRequest = new PostRequest(4, "xc", "xxc");

        PostResponse post = jsonPlaceholderController.publishPost(postRequest);

        System.out.println(post);
    }

}
