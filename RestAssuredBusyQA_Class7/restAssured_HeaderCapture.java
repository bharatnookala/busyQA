package RestAssuredBusyQA.RestAssuredBusyQA_Class7;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restAssured_HeaderCapture {
	
	@Test
	public void HeaderCapture() {
		
		Response response = given()
		
		
		.when()
			.get("https://reqres.in/api/users");
		
		String header = response.getHeader("Content-Type");
		System.out.println("the header in the response is::::::"+header);
		Assert.assertEquals(header, "application/json; charset=utf-8", "Header not matching!!!");
		
		
		
		
	}

}
