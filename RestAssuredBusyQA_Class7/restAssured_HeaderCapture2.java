package RestAssuredBusyQA.RestAssuredBusyQA_Class7;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restAssured_HeaderCapture2 {
	
	@Test
	public void HeaderCapture2() {
		
		SoftAssert sa = new SoftAssert();
		
		Response response = given()
		
		.when()
			.get("https://reqres.in/api/users");
		
		Headers header_value = response.getHeaders();
		for(Header h1 : header_value) {
			//System.out.println("the header name is::::"+h1.getName()+" and the value is::::::"+h1.getValue());
			if(h1.getName().equalsIgnoreCase("Server") && h1.getValue().trim().equalsIgnoreCase("cloudflare")) {
				//System.out.println("server param is having the right value!!!!");
				sa.assertEquals(h1.getValue().trim(), "cloudflare","It is matching");
				
			}
		}
		sa.assertAll();
		
	}

}
