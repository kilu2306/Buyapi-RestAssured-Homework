package bestbuy.api.utilitiesinfo;

import bestbuy.api.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetTestForHealthCheck extends TestBase {
    @Test
    public void healthcheckRecord() {
        Response response = given()
                .when()
                .get("/healthcheck");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
