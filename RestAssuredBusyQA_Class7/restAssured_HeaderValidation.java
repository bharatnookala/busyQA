package RestAssuredBusyQA.RestAssuredBusyQA_Class7;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restAssured_HeaderValidation {
	
	@Test
	public void validateHeader() {
		
		//Preconditions or setting headers etc
		given()
			.header("Connection", "keep-alive")
			
		
		//sending the request
		.when()
			.log().all()
			.get("https://reqres.in/api/users")
			
			
		
		//validating the header params
		.then()
			.log().all()
			.header("Content-Type", "application/json; charset=utf-8")
			.and()
			.header("Transfer-Encoding", "chunked")
			.and()
			.header("Connection", "keep-alive");
		
	}

}
