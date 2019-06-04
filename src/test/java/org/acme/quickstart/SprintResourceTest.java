package org.acme.quickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class SprintResourceTest {

    @Test
    public void testGetEndpoint() {
        given()
          .when().get("/sprint")
          .then()
             .statusCode(200)
             .body(is("hello Sprint 1\n"));
    }

}