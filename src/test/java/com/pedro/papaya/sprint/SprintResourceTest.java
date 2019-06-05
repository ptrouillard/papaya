package com.pedro.papaya.sprint;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class SprintResourceTest {

    @Test
    public void testGet() {
        RestAssured.given()
                .when().get("/sprints")
                .then()
                .statusCode(200)
                .contentType(ContentType.fromContentType("application/json"))
                .body(CoreMatchers.is("[{\"commitment\":0,\"done\":0,\"name\":\"sprint 1\"},{\"commitment\":0,\"done\":0,\"name\":\"sprint 2\"}]"));
    }

}