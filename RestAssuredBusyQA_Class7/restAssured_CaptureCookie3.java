package RestAssuredBusyQA.RestAssuredBusyQA_Class7;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.Cookie;
import io.restassured.response.Response;

public class restAssured_CaptureCookie3 {
	
	@Test
	public void detailedCookie() {
		
		Response response = given()
		
		
		.when()
			.get("http://google.com");
		
		Cookie cookieInfo = response.getDetailedCookie("AEC");
		
		System.out.println("the detailed info about the cookie is::::"+cookieInfo.getComment());
		System.out.println(cookieInfo.getDomain());
		System.out.println(cookieInfo.getMaxAge());
		System.out.println(cookieInfo.getName());
		System.out.println(cookieInfo.getPath());
		System.out.println(cookieInfo.getValue());
		System.out.println(cookieInfo.getVersion());
	}

}
