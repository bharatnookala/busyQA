package RestAssuredBusyQA.RestAssuredBusyQA;

import java.util.HashMap;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restAssured_POST_Request {
	
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
	public void postRequest() {
		
		given()
			.contentType("application/json")
			.body(createData())
			.log().all()
		
		.when()
			.post("https://reqres.in/api/users")
			
		.then()
			.log().all()
			.statusCode(201)
			.and()
			.body("name", equalTo("busyqa"))
			.body("id", matchesPattern("[0-9]+"))
			.header("Content-Type", "application/json; charset=utf-8")
			.time(lessThan(1500L));
			
			
		
		
		
	}

}
