package GET_Request;

import io.restassured.RestAssured;
import io.restassured.internal.http.HttpResponseDecorator;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponseLogSpec;
import io.restassured.specification.LogSpecification;
import org.testng.annotations.Test;
import sun.util.logging.LoggingSupport;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;


public class GetRequest{
    @Test
    public void GetRequest()
    {
        //RestAssured.baseURI="http://usersdemo.herokuapp.com/api/users?page=2";
        Response res=
                when().
                    get("http://usersdemo.herokuapp.com/api/users?page=2").
                    then().
                        extract().response();

        String rest1=res.asString();
        System.out.println(rest1);

    }



}
