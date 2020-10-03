package GET_Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.path.json.JSONAssertion;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;


public class PostRequest {
    @Test
    public void PostRequest()
    {

        String x= "{\n"+
                "\t\"name\":\"morpheus\",\n"+
                "\t\"job\":\"leader\",\n"+
                "}";

        RestAssured.baseURI="http://usersdemo.herokuapp.com";
        Response res=
                given()
                        .contentType("application/json")
                        .accept(ContentType.JSON)
                .when()
                    .body(x)
                        .log().all()
                        .request("POST","/api/register")
                .then()
                        .extract().response();


        String str=res.asString();
        System.out.println(str);



    }

}
