package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class ApiTests {

    @Test
    public void happyPath() {
        RestAssured
                .given()
                .when()
                .get("https://apigw.tbcbank.ge/api/v1/sites/pages/consumer-loan?locale=ka-GE")
                .then()
                .statusCode(200);
    }

    @Test
    public void negativeTest() {
        RestAssured
                .given()
                .when()
                .get("https://apigw.tbcbank.ge/api/v1/sites/pages/invalid?locale=ka-GE")
                .then()
                .statusCode(404);
    }
}