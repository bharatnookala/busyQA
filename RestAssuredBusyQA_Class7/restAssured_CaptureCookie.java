package RestAssuredBusyQA.RestAssuredBusyQA_Class7;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class restAssured_CaptureCookie {
	
	@Test
	public void captureCookie() {
		
		Response response = given()
		
		.when()
			.get("http://google.com");
		
		String var1 = response.getCookie("1P_JAR");
		String var2 = response.getCookie("NID");
		System.out.println("the cookie1 is::::"+var1);
		System.out.println("the cookie2 is::::"+var2);
		
		
		
	}

}
