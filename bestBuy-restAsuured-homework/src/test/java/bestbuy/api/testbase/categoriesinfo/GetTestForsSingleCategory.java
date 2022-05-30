package bestbuy.api.testbase.categoriesinfo;

import bestbuy.api.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetTestForsSingleCategory extends TestBase {
    @Test
    public void readProductList(){
        Response response = given()
                .when()
                .get("/categories/pcmcat84000050004");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
