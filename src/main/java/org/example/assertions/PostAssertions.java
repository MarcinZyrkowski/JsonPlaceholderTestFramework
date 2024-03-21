package org.example.assertions;

import org.assertj.core.api.Assertions;
import org.example.model.PostRequest;
import org.example.model.PostResponse;
import org.example.utils.JsonConverter;

public class PostAssertions {

    public static void verifyPostRequestAndResponseAreEquals(PostRequest postRequest,
        PostResponse postResponse) {

        Assertions.assertThat(postRequest)
            .usingRecursiveComparison()
            .ignoringFields("id")
            .as("Post request: \n" + JsonConverter.serializePojo(postRequest)
                + "\n Post response \n" + JsonConverter.serializePojo(postResponse))
            .withFailMessage("There is mismatch between request and response")
            .isEqualTo(postResponse);
    }

}
