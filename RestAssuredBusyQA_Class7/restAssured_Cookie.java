package RestAssuredBusyQA.RestAssuredBusyQA_Class7;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restAssured_Cookie {
	
	@Test
	public void cookieDemo() {
		
		given()
		
		.when()
			.get("http://google.com")
		
		
		.then()
			.cookie("NID", startsWith("511="))
			.and()
			.cookie("1P_JAR", startsWith("2023-11-04"));
		
	}

}
