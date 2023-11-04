package RestAssuredBusyQA.RestAssuredBusyQA_Class7;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class restAssured_PathParam {
	
	@Test
	void pathParam() {
		
		given()
			.pathParam("key", "photos")
		
		.when()
			.log().all()
			.get("https://jsonplaceholder.typicode.com/{key}")
		
		.then()
			.statusCode(200)
			;
		
	}

}
