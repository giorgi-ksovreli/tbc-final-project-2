package ge.tbc.testautomation.api;


import io.restassured.RestAssured;
import ge.tbc.testautomation.pojo.PageResponse;

public class ApiClient {

    public static PageResponse getPage(String pageId) {

        return RestAssured
                .given()
                .when()
                .get("https://apigw.tbcbank.ge/api/v1/sites/pages/" + pageId + "?locale=ka-GE")
                .then()
                .statusCode(200)
                .extract()
                .as(PageResponse.class);
    }
}