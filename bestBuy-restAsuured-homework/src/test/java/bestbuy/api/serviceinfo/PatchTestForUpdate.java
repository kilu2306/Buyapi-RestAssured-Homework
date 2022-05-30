package bestbuy.api.serviceinfo;

import bestbuy.api.model.ServicePoJo;
import bestbuy.api.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchTestForUpdate extends TestBase {
    @Test
    public void creatService(){
        ServicePoJo servicePoJo = new ServicePoJo();
        servicePoJo.setName("String");
        Response response = given()
                .header("content-type","application/json")
                .when()
                .body(servicePoJo)
                .put("/services/15");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
