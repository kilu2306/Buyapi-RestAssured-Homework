package bestbuy.api.testbase.categoriesinfo;

import bestbuy.api.model.CategoryPojo;
import bestbuy.api.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostTestForCreatData extends TestBase {
    @Test
    public void readProductList(){
        CategoryPojo categoryPojo = new CategoryPojo();
        categoryPojo.setName("String");
        categoryPojo.setId("String");
        Response response = given()
                .header("content-type","application/json")
                .body(categoryPojo)
                .when()
                .post("/categories");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
