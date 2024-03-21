package org.example.assertions;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.assertj.core.api.Assertions;

public class HttpAssertions {

    public static void validateResponseStatusCode(Response response, int httpStatusCode) {
        Assertions.assertThat(response.getStatusCode())
            .withFailMessage(
                "Status code should be " + httpStatusCode + " but was: " + response.getStatusCode())
            .isEqualTo(httpStatusCode);
    }

    public static void statusResponseIsOk(Response response) {
        validateResponseStatusCode(response, HttpStatus.SC_OK);
    }

    public static void statusResponseIsCreated(Response response) {
        validateResponseStatusCode(response, HttpStatus.SC_CREATED);
    }

}
