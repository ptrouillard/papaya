package com.pedro.papaya.sprint;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class SprintResourceTest {

    @Test
    @Ignore
    public void testGetEndpoint() {
        RestAssured.given()
          .when().get("/sprint")
          .then()
             .statusCode(200)
             .body(CoreMatchers.is("hello Sprint 1\n"));
    }

}