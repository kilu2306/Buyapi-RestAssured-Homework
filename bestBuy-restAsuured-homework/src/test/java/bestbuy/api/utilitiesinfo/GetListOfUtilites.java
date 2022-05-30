package bestbuy.api.utilitiesinfo;

import bestbuy.api.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetListOfUtilites extends TestBase {
    @Test
    public void readProductList(){
        Response response = given()
                .when()
                .get("/version");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
