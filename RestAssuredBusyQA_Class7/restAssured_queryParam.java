package RestAssuredBusyQA.RestAssuredBusyQA_Class7;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class restAssured_queryParam {
	
	@Test
	void queryParam() {
		
		given()
			.queryParam("postId", 1)
			.queryParam("dummy", true)
		
		.when()
			.log().all()
			.get("https://jsonplaceholder.typicode.com/photos")
				
		.then()
			.statusCode(200)
			.and()
			.header("X-Content-Type-Options", "nosniff")
			.and()
			.statusLine("HTTP/1.1 200 OK")
			.and()
			.body("albumId[0]", equalTo(1));
	}
	
	
	@Test
	void queryParam1() {
		
		Response response = given()
			.queryParam("postId", 1)
			.queryParam("dummy", true)
		
		.when()
			.log().all()
			.get("https://jsonplaceholder.typicode.com/photos");
		
		
		List<Integer> albumIds = response.jsonPath().getList("albumId");
		Set<Integer> albumIdsSet = new HashSet<Integer>(albumIds);
		for(Integer i : albumIdsSet) {
			if(i == 94) {
				System.out.println("94 present!!!");
			}
		}
		
	}

}
