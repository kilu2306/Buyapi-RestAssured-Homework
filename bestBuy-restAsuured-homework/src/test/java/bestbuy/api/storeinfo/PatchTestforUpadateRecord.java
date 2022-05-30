package bestbuy.api.storeinfo;

import bestbuy.api.model.StorePojo;
import bestbuy.api.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchTestforUpadateRecord extends TestBase {
    @Test
    public void UpdateRecord(){
        StorePojo storePojo = new StorePojo();
        storePojo.setAddress("String");
        storePojo.setAddress2("String");
        storePojo.setCity("String");
        storePojo.setName("String");
        storePojo.setType("String");
        storePojo.setLat(0);
        storePojo.setHours("String");
        storePojo.setLng(0);
        storePojo.setZip("string");
        storePojo.setState("string");
        Response response = given()
                .header("content-type","application/json")
                .when()
                .body(storePojo)
                .patch("/stores/13");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
