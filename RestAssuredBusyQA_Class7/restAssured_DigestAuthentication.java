package RestAssuredBusyQA.RestAssuredBusyQA_Class7;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class restAssured_DigestAuthentication {
	
	@Test
	void basicAuthentication() {
		given()
			.auth().digest("kminchelle", "0lelplR")
		
		
		.when()
			.log().all()
			.get("https://dummyjson.com/auth/login")
		
		
		.then()
			.log().all()
			.statusCode(403)
			.header("x-frame-options", "SAMEORIGIN")
			.and()
			.assertThat().body("message", equalTo("Authentication Problem"));
		
		
		
	}

}
