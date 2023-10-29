package RestAssuredBusyQA.RestAssuredBusyQA;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restAssured_GET_Request {
	
	@Test
	public void getDemo() {
		
		given()
		
		.when()
		    .log().all()
			.get("https://reqres.in/api/users")
			
		
		.then()
			.log().all()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body("data[0].first_name", equalTo("George"))
			.assertThat().body("data[1].first_name", equalTo("Janet"))
			.header("Server", "cloudflare");
		
	}

}
