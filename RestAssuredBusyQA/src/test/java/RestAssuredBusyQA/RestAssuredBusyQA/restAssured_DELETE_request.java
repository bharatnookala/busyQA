package RestAssuredBusyQA.RestAssuredBusyQA;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restAssured_DELETE_request {
	
	@Test
	public void deleteRequest() {
		
		 
				given()
				
				
				.when()
					.delete("https://reqres.in/api/users/2")
					
				.then()
					.log().all()
					.statusCode(204)
					.statusLine("HTTP/1.1 204 No Content")
					.header("Server", "cloudflare")
					.time(lessThan(1500L));
		
		
		
	}

}
