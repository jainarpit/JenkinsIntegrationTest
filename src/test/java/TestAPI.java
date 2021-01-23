import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class TestAPI {

    @Test
    public void TestApI() {
        RestAssured.baseURI = "https://reqres.in/";

        Response response = given().log().all().contentType("application/json").when().get("/api/users").then().statusCode(200).and().extract().response();
        System.out.println(response.asString());

    }
}
