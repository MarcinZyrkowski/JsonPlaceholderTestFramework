package org.example.assertions;

import io.qameta.allure.Step;
import org.assertj.core.api.Assertions;
import org.example.model.CommentListResponse;
import org.example.utils.JsonConverter;

public class CommentAssertions {

    @Step("Verify comment list")
    public static void verifyCommentList(CommentListResponse commentListResponseActual,
                                         CommentListResponse commentListResponseExpected) {
        Assertions.assertThat(commentListResponseActual)
                .as("Comment List Actual: \n" + JsonConverter.serializePojo(commentListResponseActual)
                        + "\nComment List Expected: \n" + JsonConverter.serializePojo(
                        commentListResponseExpected))
                .withFailMessage("Comment List Response is different than expected")
                .isEqualTo(commentListResponseExpected);
    }

}
