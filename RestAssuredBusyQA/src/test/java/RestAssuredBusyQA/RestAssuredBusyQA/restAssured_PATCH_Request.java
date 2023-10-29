package RestAssuredBusyQA.RestAssuredBusyQA;

import java.util.HashMap;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restAssured_PATCH_Request {
	
public static HashMap<String, String> map = new HashMap<String, String>();
	
	//"name": "busyqa"
	//"job": "team"
	
	public HashMap<String, String> createData() {
		
		map.put("name", "busyqa");
		map.put("job", "team");
		System.out.println("added");
		return map;
		
	}
	
	@Test
	public void patchDetails() {
		
		given()
			.contentType("application/json")
			.body(createData())
			.log().all()
			
		.when()
			//.put("https://reqres.in/api/users/2")
			.patch("https://reqres.in/api/users/2")
			
			
		.then()
			.statusCode(200)
			.body("name", equalTo("busyqa"))
			.header("Content-Type", "application/json; charset=utf-8")
			.time(lessThan(1500L));
			
		
	}

}
