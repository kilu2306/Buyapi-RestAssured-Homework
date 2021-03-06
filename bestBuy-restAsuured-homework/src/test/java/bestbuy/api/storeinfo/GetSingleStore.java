package bestbuy.api.storeinfo;

import bestbuy.api.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetSingleStore extends TestBase {
    @Test
    public void getSingleRecord(){
        Response response = given()
                .when()
                .get("/stores/13");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
