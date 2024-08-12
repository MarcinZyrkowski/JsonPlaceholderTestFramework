package org.example.tests.jsonplaceholdermodule.post;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.example.assertions.PostAssertions;
import org.example.model.PostListResponse;
import org.example.model.PostResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Epic("Post")
@Feature("Get Post")
@DisplayName("Fetch Post Test")
public class FetchPostTest extends BaseTest {

    @ParameterizedTest(name = "Get Post for id = 1")
    @DisplayName("Get post")
    @Description("Get post")
    @MethodSource("org.example.dataprovider.post.PostDataProvider#postWithId1")
    public void getPostTest(PostResponse expectedResponse) {
        int id = 1;

        PostResponse postResponse = postController.getPostById(id);

        PostAssertions.verifyPostResponses(postResponse, expectedResponse);
    }

    @Test
    @DisplayName("Get all posts")
    @Description("Get all posts")
    public void getAllPostsTest() {
        int expectedNumberOfAllPosts = 100;

        PostListResponse postListResponse = postController.getAllPosts();

        PostAssertions.verifyPostResponseListSize(postListResponse, expectedNumberOfAllPosts);
    }

}
