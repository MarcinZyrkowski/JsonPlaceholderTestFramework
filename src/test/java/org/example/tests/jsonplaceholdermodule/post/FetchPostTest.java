package org.example.tests.jsonplaceholdermodule.post;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.assertj.core.api.Assertions;
import org.example.assertions.PostAssertions;
import org.example.dataprovider.post.PostDataProvider;
import org.example.model.PostListResponse;
import org.example.model.PostResponse;
import org.example.tests.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Post")
@Feature("Get Post")
@DisplayName("Fetch Post Test")
public class FetchPostTest extends BaseTest {

    @Test
    @DisplayName("Get post")
    @Description("Get post")
    public void getPostTest() {
        // given
        int id = 1;
        PostResponse expectedResponse = PostDataProvider.providePostForId1();

        // when
        PostResponse postResponse = postController.getPostById(id);

        // then
        Assertions.assertThat(postResponse)
            .withFailMessage("Response is different than expected")
            .isEqualTo(expectedResponse);
    }

    @Test
    @DisplayName("Get all posts")
    @Description("Get all posts")
    public void getAllPostsTest() {
        // given
        int expectedNumberOfAllPosts = 100;

        // when
        PostListResponse postListResponse = postController.getAllPosts();

        // then
        PostAssertions.verifyPostResponseListSize(postListResponse, expectedNumberOfAllPosts);
    }

}
