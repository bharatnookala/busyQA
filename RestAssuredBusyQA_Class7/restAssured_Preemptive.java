package RestAssuredBusyQA.RestAssuredBusyQA_Class7;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class restAssured_Preemptive {
	
	@Test
	void basicAuthentication() {
		given()
			//.auth().basic("kminchelle", "0lelplR")
			.auth().preemptive().basic("kminchelle", "0lelplR")
			
		
		
		.when()
			.log().all()
			.get("https://dummyjson.com/auth/login")
		
		
		.then()
			.log().all()
			.statusCode(401)
			.header("x-frame-options", "SAMEORIGIN")
			.and()
			.assertThat().body("message", equalTo("Invalid/Expired Token!"));
		
		
		
	}

}
