package org.example.assertions;

import org.assertj.core.api.Assertions;
import org.example.model.PostRequest;
import org.example.model.PostResponse;

public class HttpAssertions {

    public static void verifyPostRequestAndResponseAreEquals(PostRequest postRequest,
        PostResponse postResponse) {
        Assertions.assertThat(postRequest.userId())
            .withFailMessage("userId is different in request and response")
            .isEqualTo(postResponse.userId());

        Assertions.assertThat(postRequest.body())
            .withFailMessage("body is different in request and response")
            .isEqualTo(postResponse.body());

        Assertions.assertThat(postRequest.title())
            .withFailMessage("title is different in request and response")
            .isEqualTo(postResponse.title());
    }

}
