package org.example.client;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.example.config.Environment;

public class RestClient {

    public RequestSpecification basicRequestSpecification() {
        return RestAssured.given()
            .contentType(ContentType.JSON)
            .baseUri(Environment.QA.getBASE_URL());
    }

}
